class Solution {
    public int solution(int a, int b) {
        String ans1 = String.valueOf(a) + String.valueOf(b);
        String ans2 = String.valueOf(b) + String.valueOf(a);
        
        return Math.max(Integer.valueOf(ans1),Integer.valueOf(ans2));
    }
}