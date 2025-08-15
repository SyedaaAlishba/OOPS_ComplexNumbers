package app;

import complexnumbers.ComplexNumber;
import operations.Addition;

import java.util.Scanner;

public class Program {
    public void run() {

        Scanner sc= new Scanner(System.in);
        ComplexNumber complexNumber = new ComplexNumber();
        System.out.println("Enter two values  like (3+4i)  & (1+2i)");
        System.out.println("Enter first value");
        System.out.println("Real Number");
        double firstReal= sc.nextInt();
        System.out.println("Imaginary Number");
        double firstImg= sc.nextInt();
        ComplexNumber firstcomplexNumber = new ComplexNumber(firstReal,firstImg);
        System.out.println("Enter second value");
        System.out.println("Real Number");
        double secondReal= sc.nextInt();
        System.out.println("Imaginary Number");
        double secondImg= sc.nextInt();
        ComplexNumber secondcomplexNumber = new ComplexNumber(secondReal,secondImg);

        System.out.println("Choose Operation \n1- Addition \n2- Subtraction \n3- Multiplication \nDivision \nConjugate");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                Addition addition= new Addition(firstcomplexNumber,secondcomplexNumber);
                System.out.println(addition);
                break;

        }
    }
}
