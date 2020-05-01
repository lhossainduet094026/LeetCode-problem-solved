class Solution {
    public int maxNumberOfBalloons(String text) {
         String ballon="balloon";
         char[] textArray = text.toCharArray();
         char[] ballonArray = ballon.toCharArray();
         StringBuffer sb = new StringBuffer();
         int counter=0;
         for(int k=1;k<=text.length()/ballon.length();k++)// how many times checking will continue
         {
                for(int i=0;i<ballonArray.length;i++)
                {
                    for(int j=0;j<textArray.length;j++)
                    {
                        if(ballonArray[i]==textArray[j])
                        {
                           sb.append(textArray[j]);
                           textArray[j]=' ';//pointing those characters what is already visited .
                           break;
                        }
                    }
                }
                
                if(sb.toString().equals("balloon"))
                {
                    counter++;
                    sb=new StringBuffer();//when one string is made then we need to initiaze new string
                }
         }
         return counter;
    }
}
