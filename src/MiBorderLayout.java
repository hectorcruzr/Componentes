import javax.swing.*;
import java.awt.*;

public class MiBorderLayout extends JFrame{
    private JLabel jLabelNorth;
    private JButton jButtonCenter;
    private JButton jButtonWest;
    private JButton jButtonEast;
    private JButton jButtonSouth;
    public MiBorderLayout(){
        jLabelNorth =new JLabel("BorderLayout.NORTH");
        jButtonCenter=new JButton("BorderLayout.CENTER");
        jButtonWest =new JButton("BorderLayout.WEST");
        jButtonEast =new JButton("BorderLayout.EAST");
        jButtonSouth =new JButton("BorderLayout.SOUTH");

        setLayout(new BorderLayout());
        setBounds(300,0,300,300);
        add(jLabelNorth,BorderLayout.NORTH);
        add(jButtonCenter,BorderLayout.CENTER);
        add(jButtonWest,BorderLayout.WEST);
        add(jButtonEast,BorderLayout.EAST);
        add(jButtonSouth,BorderLayout.SOUTH);
        setVisible(true);
    }
}
