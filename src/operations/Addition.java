package operations;

import complexnumbers.ComplexNumber;

public class Addition {
    private final ComplexNumber sum;
    public   Addition(ComplexNumber N1,ComplexNumber N2){
        //(a+bi)+(c+di)=(a+c)+(b+d)i

        //realPart
        double real= N1.getRealNumber()+ N2.getRealNumber();
        //imaginary Part
        double img= N1.getImaginaryNumber()+ N2.getImaginaryNumber();
        //sum
        sum = new ComplexNumber(real,img);
    }

    @Override
    public String toString() {
        return sum.toString();
    }
}

