public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name){
        super(name);
    }
    public double defaultPrice(){
        return 5;
    }
    public double priceFor(){
        return 3;
    }
}
