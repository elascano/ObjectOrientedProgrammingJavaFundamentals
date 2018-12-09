
import java.util.Scanner;


/** Copyright ESPE-DECC
 */

/**
 *
 * @author edisonlascano
 */
public class Event {

    int date;
    String principalPlace;
    String secondaryPlace;
    int people = 50;
    String promotion = "2x1";
    String presentedby = "company";
    
    Scanner scanner;

    public void create() {
        System.out.println("The zoo have an event : " + date);
    }

    public void placeEvent() {
        if (people > 40) {
            System.out.println("The event will be in " + principalPlace);
        } else {
            System.out.println("The event will be in " + secondaryPlace);
        }
    }

    public void sponsor() {
        System.out.println("The event is thanks to " + presentedby);
    }

    public void makePromotion() {
        System.out.println("Today the promotion is: " + promotion);
    }

}
