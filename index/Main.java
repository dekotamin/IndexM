public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 56;
        double tall = 1.6;
        double imt = service.calculate(tall);
        System.out.println(imt);
    }
}

