class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        //count number of soldier of each row
        //store soldier number and row indexes into map
        //sort row indexes of  map based on soldier number in each row
        //then loop through the map with k times 
        //pick the row indexes from map 
        int[] result=new int[k];
        Map<Integer, Integer> soldierInEachRow = new HashMap<>();
        int soldierCounter = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    soldierCounter += 1;
                }
            }
            soldierInEachRow.put(i, soldierCounter);
            soldierCounter = 0;
        }

       // System.out.println(soldierInEachRow);
        //after sort the map
        Map<Integer, Integer> hm1 = sortByValue(soldierInEachRow);
        //making result array
        int i=0;
        for (Map.Entry<Integer, Integer> aa : hm1.entrySet()) {
            result[i]=aa.getKey(); 
            i++;
            if(i>=k)
            {
                 break;
            }
        }
        
        return result;
    }

    //sorting map
    private static Map<Integer, Integer> sortByValue(Map<Integer, Integer>                                              soldierInEachRow) 
    {
        // Create a list from elements of HashMap 
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(soldierInEachRow.entrySet());
        
       // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, 
                    Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap  
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    }
