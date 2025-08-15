package complexnumbers;

public class ComplexNumber {
  private final double realNumber;
  private final double imaginaryNumber;

    public ComplexNumber(){
        this.realNumber=0.0;
        this.imaginaryNumber=0.0;
    }

    public ComplexNumber(double real, double img) {
        this.realNumber=real;
        this.imaginaryNumber=img;
    }

    public double getImaginaryNumber() {
        return imaginaryNumber;
    }

    public double getRealNumber() {
        return realNumber;
    }
    @Override
    public String toString() {
        return "( "+ realNumber+" , "+imaginaryNumber+"i )";
    }
}
