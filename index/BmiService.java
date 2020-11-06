public class BmiService {
    public double calculate(double tall) {
        int  weight = 1;
        double imt = (weight / (tall * tall)) * 100;
        return imt;
    }
}
