class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;
        
        TreeMap<Integer, Integer> countMap = new TreeMap<>();
        
        for(int num : hand){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        while(!countMap.isEmpty()){
            int first = countMap.firstKey();

            for(int i = 0; i < groupSize; i++){
                int currentCard = first + i;

                if(!countMap.containsKey(currentCard)) return false;

                if(countMap.get(currentCard) == 1) countMap.remove(currentCard);
                else countMap.put(currentCard, countMap.get(currentCard) - 1);
            }
        }
        
        return true;
    }
}