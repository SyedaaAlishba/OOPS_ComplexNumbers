package operations;

import complexnumbers.ComplexNumber;

public class Addition {
    double real, img;
    ComplexNumber sum;
    public   Addition(ComplexNumber N1,ComplexNumber N2){
        //(a+bi)+(c+di)=(a+c)+(b+d)i
        this.real= N1.getRealNumber()+ N2.getRealNumber();
        this.img= N1.getImaginaryNumber()+ N2.getImaginaryNumber();
        sum = new ComplexNumber(real,img);

    }

    @Override
    public String toString() {
        return "( "+ real+" , "+img+"i )";
    }
}

