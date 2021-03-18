package project3;

public class Heavy_Cart extends Cart{
    public Heavy_Cart(int maxSpeed, int acceleration, int brakeSpeed) {
        super(maxSpeed + 2, acceleration - 2, brakeSpeed - 2);
}
}
