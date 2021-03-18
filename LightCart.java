package project3;

public class LightCart extends Cart{
    public LightCart(int maxSpeed, int acceleration, int breakSpeed) {
        super(maxSpeed - 2, acceleration + 2, breakSpeed + 2);
    }
}
