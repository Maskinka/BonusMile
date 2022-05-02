import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int price = 30_000;
        int miles = service.calculate(price);

        System.out.println("ОР: 1500 " + "ФР: " + miles);

    }
}

