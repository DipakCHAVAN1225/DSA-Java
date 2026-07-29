class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> str=new HashSet<>();

        for(char ch:sentence.toCharArray()){
            str.add(ch);
        }
        if(str.size()==26){
            return true;
        }else{
            return false;
        }
    }
}