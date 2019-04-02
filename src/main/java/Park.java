public class Park extends Attraction implements ITicketed {
    public Park(String name){
        super(name);
    }
    public double defaultPrice(){
        return 20;
    }
    public double priceFor(){
        return 12;
    }
}

