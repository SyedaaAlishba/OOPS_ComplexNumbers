package operations;

import complexnumbers.ComplexNumber;

public class Addition {
    ComplexNumber real, img;
    public ComplexNumber Addition(ComplexNumber N1,ComplexNumber N2){
        //(a+bi)+(c+di)=(a+c)+(b+d)i
        this.real= new ComplexNumber(N1.getRealNumber()+ N2.getRealNumber());
        this.img= new ComplexNumber(N1.getImaginaryNumber()+ N2.getImaginaryNumber());
        return new ComplexNumber(real,img);
    }
}

