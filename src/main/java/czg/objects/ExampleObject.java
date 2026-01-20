package czg.objects;

import czg.util.Input;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Beispiel-Objekt mit einem Sprite, welches auf Maus- und Tasteneingaben reagiert sowie
 * die draw()-Funktion über das Zeichnen des Sprites hinaus erweitert.
 */
public class ExampleObject extends BaseObject{

    public ExampleObject() {
        super("/assets/characters/example.png");
    }

    @Override
    public void update() {
        if(isClicked())
            System.out.println("KLICK!");

        if(Input.INSTANCE.getKeyState(KeyEvent.VK_UP).isDown()) {
            y -= 10;
        }

        if (Input.INSTANCE.getKeyState(KeyEvent.VK_DOWN).isDown()) {
            y += 10;
        }

        if (Input.INSTANCE.getKeyState(KeyEvent.VK_LEFT).isDown()) {
            x -= 10;
        }

        if (Input.INSTANCE.getKeyState(KeyEvent.VK_RIGHT).isDown()) {
            x += 10;
        }
    }

    @Override
    public void draw(Graphics2D g) {
        super.draw(g);

        // Hitbox in rot zeichnen
        g.setColor(Color.RED);
        g.drawRect(x, y, width, height);
    }
}
