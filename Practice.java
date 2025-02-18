import java.util.Scanner;

class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte b;
        short s;
        int i;
        long l;

        float f;
        double d;

        boolean bool;

        char c;
        String str1;
        String str2;

        System.out.print("Enter the value of byte: ");
        b = input.nextByte();
        System.out.print("Enter the value of short: ");
        s = input.nextShort();
        System.out.print("Enter the value of integer: ");
        i = input.nextInt();
        System.out.print("Enter the value of long: ");
        l = input.nextLong();

        System.out.print("Enter the value of float: ");
        f = input.nextFloat();
        System.out.print("Enter the value of double: ");
        d = input.nextDouble();

        System.out.print("Enter the value of boolean: ");
        bool = input.nextBoolean();

        input.nextLine(); 

        System.out.print("Enter first string: ");
        str1 = input.next(); 

        System.out.print("Enter second string: ");
        str2 = input.nextLine(); 
        
        c = str2.charAt(0);
		
        System.out.println("\nThe value of byte is: " + b);
        System.out.printf("The value of short is: %d\n", s);
        System.out.printf("The value of integer is: %03d\n", i);
        System.out.printf("The value of long is: %d\n", l);

        System.out.printf("The value of float is: %.2f\n", f);
        System.out.printf("The value of double is: %.2f\n", d);

        System.out.printf("The value of boolean is: %b\n", bool);

        System.out.println("The first string is: " + str1);
        System.out.println("The second string is: " + str2);
        System.out.println("The first character of the second string is: " + c);
    }
}
