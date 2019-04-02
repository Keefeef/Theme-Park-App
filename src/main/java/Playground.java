public class Playground extends Attraction implements ITicketed {
    public Playground(String name){
        super(name);
    }
    public double defaultPrice(){
        return 7;
    }
    public double priceFor(){
        return 4;
    }
}

