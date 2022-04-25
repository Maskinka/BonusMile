public class Main {
    public static void main(String[] args) {

        int priceTiket = 30_000;
        int oneMile = 20;
        int mile = priceTiket / oneMile;

        System.out.println("Стоимость билета: " + priceTiket + " рублей");
        System.out.println("Количество начисленных миль: " + mile);
    }
}
