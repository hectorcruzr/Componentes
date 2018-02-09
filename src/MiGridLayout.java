import javax.swing.*;
import java.awt.*;

public class MiGridLayout extends JFrame{
    private JLabel jLabelNorth;
    private JButton jButtonCenter;
    private JButton jButtonWest;
    private JButton jButtonEast;
    private JButton jButtonSouth;
    public MiGridLayout(){
        jLabelNorth =new JLabel("new GridLayout(2,3)");
        jButtonCenter=new JButton("new GridLayout(2,3)");
        jButtonWest =new JButton("new GridLayout(2,3)");
        jButtonEast =new JButton("new GridLayout(2,3)");
        jButtonSouth =new JButton("new GridLayout(2,3)");

        setLayout(new GridLayout(2,3));
        setBounds(600,0,300,300);
        add(jLabelNorth);
        add(jButtonCenter);
        add(jButtonWest);
        add(jButtonEast);
        add(jButtonSouth);
        setVisible(true);
    }
}
