 public static int[] findErrorNums(int[] nums) {
        //arraylist to store resuls
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> frequency = new HashMap<Integer, Integer>();
        //frequency of each element in nums array story into frequency map
        for (int i = 0; i < nums.length; i++) {
            int data = nums[i];
            if (frequency.containsKey(data)) {
                frequency.put(data, frequency.get(data) + 1);
            } else {
                frequency.put(data, 1);
            }
        }

        //iterate over the map and put the element which is duplicate
        int sum = 0;//sum will store the summation of all keys
        for (Map.Entry<Integer, Integer> values : frequency.entrySet()) {
            if (values.getValue() > 1) {
                result.add(values.getKey());
            }
            
            sum+=values.getKey();
        }
        //now we calculate missing integer.
        //we know formula of sum of n natural number :sum=n*(n+1)/2.here n .
     int sumSeries=0;
        sumSeries=nums.length*(nums.length+1)/2;
        int missingInt = sumSeries-sum;
        result.add(missingInt);
        int[] resultArray =new int[result.size()];
        for(int k=0;k<resultArray.length;k++)
        {
            resultArray[k]=result.get(k).intValue();
        }
        return resultArray;
    }