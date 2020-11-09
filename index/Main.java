public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 80;
        double tall = 1.7;
        double imt = service.calculate(tall,weight);
        System.out.println(imt);
    }
}

