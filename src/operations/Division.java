package operations;

import complexnumbers.ComplexNumber;

public class Division {
  private ComplexNumber divison;

        public Division(ComplexNumber N1,ComplexNumber N2){
           //   (ac+bd)+(bc−ad)i/ c^2+d^2;

            double real= N1.getRealNumber()*N2.getRealNumber() + N1.getImaginaryNumber() *N2.getImaginaryNumber();
            double img=  N1.getImaginaryNumber()* N2.getRealNumber() -N1.getRealNumber()* N2.getImaginaryNumber();
            double den= N2.getRealNumber()* N2.getRealNumber() + N2.getImaginaryNumber()* N2.getImaginaryNumber();
           divison= new ComplexNumber(real / den, img / den);

        }
        @Override
        public String toString() {
            return divison.toString();
        }


}
