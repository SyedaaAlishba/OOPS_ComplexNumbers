package app;

import complexnumbers.ComplexNumber;

import java.util.Scanner;

public class Program {
    public void run() {

        Scanner sc= new Scanner(System.in);
        ComplexNumber complexNumber = new ComplexNumber();
        System.out.println("Enter two values  like (3+4i)  & (1+2i)");
        System.out.println("Enter first value");
        double firstReal= sc.nextInt();
        double firstImg= sc.nextInt();
        System.out.println("Enter second value");
        double secondReal= sc.nextInt();
        double secondImg= sc.nextInt();

    }
}
