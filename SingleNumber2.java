class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int num: nums){
            hashMap.put(num, hashMap.getOrDefault(num,0)+1);
        }
        
        for(int k : hashMap.keySet()){
            if(hashMap.get(k) == 1){
                return k;
            }
        }
        return -1;
    }
}
