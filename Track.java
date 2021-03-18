package project3;

import java.util.ArrayList;
import java.util.HashMap;

public class Track {
    private ArrayList<Cart> carts;
    private ArrayList<Integer> cartPositions;
    private int totalDistance;

    private ArrayList<Bend> bends;

    private ArrayList<Item> itemsToPickup;
    private ArrayList<Integer> itemPositions;

    public void dropObstacleAtLocation(Cart cart)
    {
        // find the position of the cart from the lists, drop obstacle
    }

    public int distanceToNextBend(int cartPosition){
        for (Bend bend : bends){
            if (bend.getPositionOnTrack() >= cartPosition){
                return bend.getPositionOnTrack() - cartPosition;
            }
        }
        return 0;
    }

    public int getMaxSpeedOfNextBend(int cartPosition){
        for (Bend bend : bends){
            if(bend.getPositionOnTrack() >= cartPosition){
                return bend.getMaxSpeed();
            }
        }
        return 0;
    }

    public void assignItem(int cartPosition){
        if(cartPosition >= 5){
            int randomItem = (int) ((Math.random() * (3 - 1)) + 1);
            Cart cart = carts.get(cartPosition);

            if (randomItem == 1){
                cart.addItem(new Mushroom());
            }
            else if(randomItem == 2){
                cart.addItem(new BananaPeel());
            }
            else{
                cart.addItem(new Banana());
            }
        }
    }
}
