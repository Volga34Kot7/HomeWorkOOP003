import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hotdrink cappuccino = new Hotdrink("cappuccino", 550, 330);
        Hotdrink macchiato = new Hotdrink("macchiato", 750, 290);
        Hotdrink gingerTea = new Hotdrink("ginger tea", 340, 250);
        Hotdrink cacao = new Hotdrink("cacao", 250, 250);
        List<Hotdrink> mainGoods = new ArrayList<>();
        mainGoods.add(cappuccino);
        mainGoods.add(macchiato);
        mainGoods.add(gingerTea);
        mainGoods.add(cacao);

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.getProduct((ArrayList<Hotdrink>) mainGoods);

        Drinktea hotDrinkTea = new Drinktea("green tea", 500, 250, 65);
        System.out.println(hotDrinkTea.getInfo());

        vendingMachine.getProduct("green tea", 250, 65);




    }

}
