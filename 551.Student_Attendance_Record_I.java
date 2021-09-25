class Solution {
    public boolean checkRecord(String s) {
        int absent = 0;
        int consecutiveLate = 0;
        boolean lateChance = false;
        for(char c: s.toCharArray()) {
            if(c == 'A') {
                absent += 1;
            } if(c =='L') {
                consecutiveLate += 1;
                if(consecutiveLate >= 3) lateChance = true;
            } else {
                consecutiveLate= 0;
            }
        }
        return !lateChance && absent <2;
        
    }
}