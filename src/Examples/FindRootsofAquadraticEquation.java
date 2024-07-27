package Examples;

/* Quadratic Equation
    AX^2+Bx+C=0
    X=(-b+- (b*b-4ac))/(2a)    where a can`t be 0       root we do it as math.sqrt

    Root1=-b+ (b*b-4ac))/(2a)
    Root2=-b- (b*b-4ac))/(2a)
    Determinant=b*b-4a*c     if > 0 -> Root Real & Different
    Determinant=b*b-4a*c     if < 0 -> Root Complex & Different
    Determinant=b*b-4a*c     if = 0 -> Root Are Real & Equal
    */

public class FindRootsofAquadraticEquation {
    public static void main(String[] args) {

        double A=2.3,B=4,C=5.6,Root1,Root2,Real,Image,Determinant;
        Determinant=B*B-4*A*C;
        if(Determinant>0){
            Root1=(-B+Math.sqrt(Determinant))/(2*A);
            Root2=(-B-Math.sqrt(Determinant))/(2*A);
            System.out.println("Root1 is /n Root2 is"+Root1+Root2);
            
        } else if (Determinant<0) {
            Real=-B/(2*A);
                    Image=Math.sqrt(-Determinant)/(2*A);
            System.out.println("Real is /n Image is "+Real+Image);
            
        }
        else {

            Root1=Root2=-B/(2*A);
            System.out.println("Root is "+Root1);

        }


    }
}
