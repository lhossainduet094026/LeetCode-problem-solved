public int[] sumZero(int n) {
     int[] numbers = new int[n];
     int i=0;
     int j=n-1;
     int  k=1;
    while(i<j)
    {
            numbers[i]=k;
            numbers[j]=-k;
            i++;
            j--;
            k++;
      }
   return numbers;
   }