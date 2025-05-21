public class Main {
    public static void main(String[] args) {
        Order validOrder = new Order("123", "Alice", 5);
        Order nullOrder = null;

        OrderProcessor.handleOrder(validOrder, true, true,true);
        OrderProcessor.handleOrder(validOrder, false, false,true);
    }
}