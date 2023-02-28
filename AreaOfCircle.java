import java.util.*;     //* means All files of java.util

//name of file = name of 1st Class always
class AreaOfCirle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter radius of Circle");
        float radius = sc.nextFloat();
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle = " + area);
    }
}
