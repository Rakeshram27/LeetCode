class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        for(int i = 0;i < 26;i++){
            char upr = (char)(i + 65);
            char lwr = (char)(i + 97);
            if(word.indexOf(lwr) != -1 && word.lastIndexOf(lwr) < word.indexOf(upr)){
                    count++;
            }
        }
        return count;
    }
}