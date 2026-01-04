
package assets.actors;

import assets.GameAsset;
import java.awt.Image;

public class NPC extends GameAsset{
    
    public NPC(int x, int y, Image img, String name) {
        super(x, y, img, name);
    }
 
    public void talk() {}
}
