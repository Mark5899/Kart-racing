package project3;

public abstract class Cart {

    private int maxSpeed;
    private int acceleration;
    private int currentSpeed;
    private int breakSpeed;
    protected Item item;

    public Cart(int maxSpeed, int acceleration, int breakSpeed)
    {
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.breakSpeed = breakSpeed;
    }

    public void enterBend(Bend bend){

    }

    public void accelerate(){
        this.currentSpeed += acceleration;
    }

    public void useItem(){

    }

    public void addItem(Item item){
        this.item = item;
    }

    public void brake(){
        currentSpeed -= breakSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getBreakSpeed() {
        return breakSpeed;
    }

    public Item getItem() {
        return item;
    }
}

