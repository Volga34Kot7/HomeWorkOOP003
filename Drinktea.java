public class Drinktea extends Hotdrink {

    public Integer temperature;


    public Drinktea(String name, Integer cost, Integer volume, Integer temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }


}