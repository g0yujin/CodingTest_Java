class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(s, overwrite_string.length()+1);
        return answer;
    }
}