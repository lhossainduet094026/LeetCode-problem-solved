 public boolean canConstruct(String ransomNote, String magazine) {
        int[] magazineValues = new int[127];
        int[] ransomValues = new int[127];
        for(int i=0;i<magazine.length();i++){
            magazineValues[magazine.charAt(i)]++;
        }
        for(int i=0;i<ransomNote.length();i++){
            ransomValues[ransomNote.charAt(i)]++;
        }
        for(int i=0;i<ransomNote.length();i++){
                   if(ransomValues[ransomNote.charAt(i)]>magazineValues[ransomNote.charAt(i)]){
                return false;
            }
        }
        return true;
    }