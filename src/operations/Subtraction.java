package operations;

import complexnumbers.ComplexNumber;

public class Subtraction {
    private final ComplexNumber sub;

    public Subtraction(ComplexNumber N1,ComplexNumber N2){
//        (a+bi)−(c+di)=(a−c)+(b−d)i
        double real= N1.getRealNumber()- N2.getRealNumber();
        double img= N1.getImaginaryNumber()- N2.getImaginaryNumber();
        sub = new ComplexNumber(real,img);
    }
    @Override
    public String toString() {
        return sub.toString();
    }

}
