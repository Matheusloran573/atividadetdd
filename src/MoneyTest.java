public class MoneyTest {
    public static void main(String[] args) {
        testMultiplication();
    }

    static void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assert five.amount == 10 : "Erro: 5 * 2 deveria ser 10";
    }
}