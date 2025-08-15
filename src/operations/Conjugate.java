package operations;

import complexnumbers.ComplexNumber;

public class Conjugate {
    private final ComplexNumber conjugate;

    public Conjugate(ComplexNumber c1){
//       Conjugate of a+bi =a−bi
        double real = c1.getRealNumber();
        double img = c1.getImaginaryNumber()*-1;
        conjugate= new ComplexNumber(real,img);
    }
    @Override
    public String toString() {
        return conjugate.toString();
    }

}
