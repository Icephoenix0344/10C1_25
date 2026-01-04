package assets.actors;

import assets.GameAsset;
import assets.objects.Item;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class Player extends GameAsset {
    
    List<Item> inventory = new ArrayList<Item>();
    
    public Player(int x, int y, Image img, String name) {
        super(x, y, img, name);
    }

    public void walk(int direction) {}
    
    public void jump(int direction) {}
    
    public void addItem (Item item) {}
    
    public Item getIteam (int pos) {
        return inventory.get(pos);
    }
    
}
