
import java.util.ArrayList;
import java.util.Iterator;
public class VendingMachine {
    public void getProduct(ArrayList<Hotdrink> hotDrinks) {
        System.out.println("On sale: ");
        Iterator<Hotdrink> iterator = hotDrinks.iterator();
        while (iterator.hasNext())
        {
            Hotdrink item = iterator.next();
            System.out.println(item.getName());
        }
    }

    public void getProduct(String name, int volume, int temperature) {
        System.out.printf("Be careful, the hottest drink: " + name + ", his temperature  " + temperature + ", beverage volume: " + volume);
    }
}
