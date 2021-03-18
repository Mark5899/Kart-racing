package project3;

public class Light_Cart extends Cart {
    public Light_Cart(int maxSpeed, int acceleration, int brakeSpeed) {
        super(maxSpeed - 2, acceleration + 2, brakeSpeed + 2);
    }
}
    
