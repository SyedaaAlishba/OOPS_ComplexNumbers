package complexnumbers;

public class ComplexNumber {
    double realNumber;
    double imaginaryNumber;

    public ComplexNumber(){
        this.realNumber=0.0;
        this.imaginaryNumber=0.0;
    }
    public ComplexNumber(ComplexNumber rNum, ComplexNumber iNum){
        this.realNumber= rNum.realNumber;
        this.imaginaryNumber=iNum.imaginaryNumber;
    }

    public ComplexNumber(double v) {
        this.realNumber=v;
    }

    public double getImaginaryNumber() {
        return imaginaryNumber;
    }

    public double getRealNumber() {
        return realNumber;
    }
}
