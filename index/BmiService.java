public class
BmiService {
    public double calculate(double tall,double weight) {
        double imt = weight /( tall * tall) ;
        return imt;
    }
}
