package rent.lv.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuBuilder {

    public void mainManu(){
        System.out.println("Menu :> ");
        System.out.println(" 1 :> Show all rent positions ");
        System.out.println(" 2 :> Show all by rent is active  >>> ");
        System.out.println(" 3 :> Find rent by price >>> ");
        System.out.println(" 4 :> Find rent by price and distance to school >>> ");
        System.out.println(" 5 :> Find rent by price and distance to kindergarden >>> ");
        System.out.println(" 6 :> Find rent by price and distance to hospital >>> ");
        System.out.println(" 7 :> Sort by price >>> ");
        System.out.println(" 8 :> Exit ");

        System.out.println("Enter position :> ");
    }

    public void priceEnter(){
        System.out.println("Enter your money :");
    }
    public void distEnter(){
        System.out.println("Enter distance :");
    }

    public int menuTotalPriceEnter(){
        int visitorPrice = 0;

        try {
            while (visitorPrice <= 0 ){
                
                try {
                    BufferedReader inPrice = new BufferedReader(new InputStreamReader(System.in));
                    visitorPrice = Integer.parseInt(inPrice.readLine());
                }catch (NumberFormatException c){}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return visitorPrice;
    }
}
