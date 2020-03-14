public int maximum69Number (int num) {
         List<Integer> numbers = new ArrayList<>();
        int a = 0;
        int max = 0;//will store the maximum value
        //int to string 
        String number = String.valueOf(num);
        //System.out.println(number);
        //string to character array
        char[] tempNumber = number.toCharArray();
        char tempChar = ' ';
        int flag = 0;
        //replace each digit using loop  and insert to an list
        //calculate if every character is 9 then break and return 

        for (int i = 0; i < tempNumber.length; i++) {
            if (tempNumber[i] != '9') {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            return num;
        } else {

            //  if(flag==1){
            for (int i = 0; i < tempNumber.length; i++) {
                // System.out.println(tempNumber[i]);
                if (tempNumber[i] == '9') {
                    tempChar = tempNumber[i];
                    tempNumber[i] = '6';//replacing if 9 with 6
                } else if (tempNumber[i] == '6') {
                    tempChar = tempNumber[i];
                    tempNumber[i] = '9'; //replacing if 6 with 9
                }
                //arraylist to store all the numbers
                a = Integer.parseInt(new String(tempNumber));
                // System.out.println(a);
                //adding every number to a list for next comparison
                numbers.add(a);
                tempNumber[i] = tempChar;

            }
        }
        //retrieve from that list and make it integer and look for the maximum
        //  } 

        for (Integer i : numbers) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }