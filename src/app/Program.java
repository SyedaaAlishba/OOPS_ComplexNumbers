package app;

import complexnumbers.ComplexNumber;
import operations.*;

import java.util.Scanner;

public class Program {
    public void run() {

        Scanner sc= new Scanner(System.in);
        //Taking input of both real and Imaginary numbers separately
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

        //flag for taking input until user Quits
        boolean flag= false;
        while (!flag) {
            System.out.println("Choose Operation \n1- Addition \n2- Subtraction \n3- Multiplication \n4- Division \n5- Conjugate \n6- Quit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Addition addition = new Addition(firstcomplexNumber, secondcomplexNumber);
                    System.out.println(addition); //toString will be called
                    break;
                case 2:
                    Subtraction subtraction = new Subtraction(firstcomplexNumber, secondcomplexNumber);
                    System.out.println(subtraction);
                    break;
                case 3:
                    Multiplication multiplication = new Multiplication(firstcomplexNumber, secondcomplexNumber);
                    System.out.println(multiplication);
                    break;
                case 4:
                    Division division = new Division(firstcomplexNumber, secondcomplexNumber);
                    System.out.println(division);
                    break;
                case 5:
                    System.out.println("enter one expression like (1+2i)");
                    System.out.println("Real Number");
                    double real = sc.nextInt();

                    System.out.println("Imaginary Number");
                    double img = sc.nextInt();
                    Conjugate conjugate = new Conjugate(new ComplexNumber(real, img));
                    System.out.println(conjugate);

                    break;
                case 6:
                    System.out.println("Quiting...");
                    flag= true;
                    break;
                default:
                    System.out.println("Enter valid choice");
            }
        }
    }
}
