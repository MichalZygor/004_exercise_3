//import static java.lang.Math.*;
public class Math {

    boolean isEven(int numberIn){
        return ((numberIn % 2)==0); // true jeżeli parzysta
    }

    boolean isOdd(int numberIn){
        return ((numberIn % 2)>0); // true jezeli nieparzysta
    }

    double circleField(double radiusIn){
        return (3.14 * (radiusIn * radiusIn));
    }

    int power(int numberIn){
        return (numberIn * numberIn);
    }
}
