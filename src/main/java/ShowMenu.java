import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShowMenu {

    MenuBuilder menu = new MenuBuilder();
    DataHelper dataHelper = new DataHelper();

    boolean exit = false;

    public ShowMenu() {
        }

    public void show() {
        do {
            int dist = 0;
            int price = 0;

            menu.mainManu();

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            switch (menu.menuTotalPriceEnter()) {
                case 1:
                    dataHelper.showAllData();
                    break;
                case 2:
                    dataHelper.findByRent();
                    break;
                case 3:
                    menu.priceEnter();
                    price = menu.menuTotalPriceEnter();
                    dataHelper.findByPrice(price);
                    break;
                case 4:
                    menu.priceEnter();
                    price = menu.menuTotalPriceEnter();
                    menu.distEnter();
                    dist = menu.menuTotalPriceEnter();
                    dataHelper.findByPriceAndDistToSchool(price, dist);
                    break;
                case 5:
                    menu.priceEnter();
                    menu.menuTotalPriceEnter();
                    menu.distEnter();
                    dist = menu.menuTotalPriceEnter();
                    dataHelper.findByPriceAndDistToKinderGargen(price, dist);
                    break;
                case 6:
                    menu.priceEnter();
                    menu.menuTotalPriceEnter();
                    menu.distEnter();
                    dist = menu.menuTotalPriceEnter();
                    dataHelper.findByPriceAndDistToHospital(price, dist);
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Try again...");
            }

        } while (!exit);
    }
}
