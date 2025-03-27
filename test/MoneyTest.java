public class MoneyTest {
    public static void main(String[] args) {
        testMultiplication();
    }

    static void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        if (five.amount != 10) {
            throw new AssertionError("Falha no teste: 5 * 2 deveria ser 10");
        }
        System.out.println("Todos os testes passaram!");
    }
}