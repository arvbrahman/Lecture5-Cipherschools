public class Lecture5 {
    public static void main(String[] args) {
        int x = 5;
        int y= 7;
        System.out.println("X is: "+x);
        System.out.println("Y is: "+y);

        byte b = 10;
        System.out.println("B is: "+b);

        int i = b; //implicit type casting or widening or up-casting
        System.out.println("I is: "+i);

        byte b2 = (byte)129; //explicit type casting or narrowing or down-casting
        System.out.println("B2 is: "+b2);

        byte b3 = (byte)128;
        System.out.println("B3 is: "+b3);
        
        byte b4 = (byte)256;
        System.out.println("B4 is: "+b4);

        float f = (float)5.5; //by default considers decimal to be double
        float f2 = 5.5f;
        
        double d= 10.5;

        char ch = 'a';
        System.out.println(ch);

        int z = x+y;
        // + -> operator
        // x,y -> operands

        // Increment & Decrement operators
        int m = 5;
        int n = m++;
        System.out.println("M is: "+m+", N is: "+n);

        int p= 5;
        int q= ++p;
        System.out.println("P is: "+p+", Q is: "+q);


    }    
}