package operations;

import complexnumbers.ComplexNumber;

public class Multiplication {
    private final ComplexNumber multi;
    public   Multiplication(ComplexNumber N1,ComplexNumber N2){
//        (a+bi)(c+di)=(ac−bd)+(ad+bc)i
        double real= N1.getRealNumber()*N2.getRealNumber() - N1.getImaginaryNumber() *N2.getImaginaryNumber();
        double img= N1.getRealNumber()* N2.getImaginaryNumber() + N1.getImaginaryNumber()* N2.getRealNumber();
        multi = new ComplexNumber(real,img);

    }
    @Override
    public String toString() {
        return multi.toString();
    }
}
