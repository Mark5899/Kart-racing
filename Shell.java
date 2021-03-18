package project3;

public abstract class Shell implements Item{
    
    @Override
    public void use(Cart cart, Track track) {
        track.dropObstacleAtLocation(cart);
    }
}
