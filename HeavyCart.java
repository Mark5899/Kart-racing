package project3;

public class HeavyCart extends Cart{

    private Item secondItem;

    public HeavyCart(int maxSpeed, int acceleration, int breakSpeed) {
        super(maxSpeed + 2, acceleration - 2, breakSpeed - 2);
    }

    public void addItem(Item item1, Item item2){
        super.addItem(item1);
        secondItem = item2;

    }
}
