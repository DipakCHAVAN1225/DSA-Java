class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        String[] key={"type","color","name"};
        int index=0;
        for(int i=0;i<key.length;i++){
            if(key[i].equals(ruleKey)){
                index=i;
                break;
            }
        }
        int count=0;
        for(List<String> item : items){
            if(item.get(index).equals(ruleValue)){
                count++;
            }
        }
        return  count;
    }
}