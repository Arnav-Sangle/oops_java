//AIM: to find no. of "hello" in a string

import java.util.*;

class HelloFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        String strCpy = str.toUpperCase();
        
        System.out.println(strCpy);
        int i=0;
        while(i<str.length()) {
            if(strCpy.contentEquals("HELLO") == true) {
                System.out.println(strCpy);
            }
        }
    }
}
