class Solution {
    public String solution(String rny_string) {
        StringBuilder sb = new StringBuilder(rny_string);
        String m = "m";
        String rn= "rn";
        
        return sb.toString().replace(m,rn);
    }
}