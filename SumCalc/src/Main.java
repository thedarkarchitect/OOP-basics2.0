public class Main {
    public static void main(String[] args) {
        SimpleCalculator Cal = new SimpleCalculator();
        Cal.setFirstNumber(5.0);
        Cal.setSecondNumber(4.0);
        System.out.println("add= "+Cal.getAdditionResult());
        System.out.println("subtract= "+Cal.getSubtractionResult());
        Cal.setFirstNumber(5.25);
        Cal.setSecondNumber(0.0);
        System.out.println("multiply= "+Cal.getMultiplicationResult());
        System.out.println("Division= "+Cal.getDivisionResult());
    }
}
