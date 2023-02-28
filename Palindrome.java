import java.util.*; //Scanner

class Palindrome {
    
    // static String reverseStr(String);
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//System.in is a standard input stream
        
        System.out.print("Enter string: ");
        String str = sc.nextLine();     //reads string
        
        String revStr = "";
        int i;
        for(i=0; i<str.length(); i++) {
            revStr = str.charAt(i) + revStr;
        }
        
        // System.out.println(revStr);
        
        /*
        compareTo()
        s1 == s2 : The method returns 0.
        s1 > s2 : The method returns a positive value.
        s1 < s2 : The method returns a negative value.
        */
        
        if(str.compareTo(revStr) == 0) {
            System.out.println("It is Palindrome!");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
