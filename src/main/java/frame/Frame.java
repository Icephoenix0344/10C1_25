
package frame;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Frame extends JFrame implements ActionListener{

    JPanel canva;
    Timer t;
            
    public Frame(String title) throws HeadlessException {
        super(title);
        this.setLayout(new FlowLayout());
        this.setPreferredSize(new Dimension(800,600));
        this.setSize(new Dimension(800,600));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        
        canva  = new Canva(this.getWidth(), this.getHeight());
        this.add(canva);
        
        this.setVisible(true);
        this.pack();
        
        t = new Timer(30, this);
        t.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        canva.repaint();
    }
    
    
}
