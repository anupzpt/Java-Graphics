import javax.swing.*;

public class Graphics {
    JFrame frame=new JFrame();
    Box box=new Box();
    Graphics(){
        frame.add(box);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
