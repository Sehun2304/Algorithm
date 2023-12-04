import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(int i=0; i<a.length(); i++){
            char currentChar = a.charAt(i);
            
            if(Character.isUpperCase(currentChar)){
                System.out.print(Character.toLowerCase(currentChar));
            }else{
                System.out.print(Character.toUpperCase(currentChar));
            }
        }
    }
}