import javax.swing.*;
import java.awt.*;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Box extends JPanel implements ActionListener {
    int Box2X=250;
    int Box2Y= 10;
    JButton right=new JButton("Move Out");
    JButton left=new JButton("Move In");

    Box(){
        right.addActionListener(this);
        add(right);

        left.addActionListener(this);
        add(left);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.cyan);
        g.fillRect(10,10,100,100);

        g.setColor(Color.PINK);
        g.fillRect(Box2X,Box2Y,100,100);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == right){
            this.Box2X+=10;
            this.repaint();
        }
        if(e.getSource() == left){
            this.Box2X-=10;
            this.repaint();
        }


    }
}
