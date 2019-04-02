public class Rollercoaster extends Attraction implements ITicketed implements ISecurity {

    public Rollercoaster(String name){
        super(name);
    }
    public double defaultPrice(){
        return 10;
    }
    public double priceFor(){
        return 7;
    }
}
