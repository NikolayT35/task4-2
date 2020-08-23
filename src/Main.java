public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMassIndex = service.calculate(65, 1.95);

        System.out.println(bodyMassIndex);

    }
}

