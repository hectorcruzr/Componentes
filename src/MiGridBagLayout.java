import javax.swing.*;
import java.awt.*;

public class MiGridBagLayout extends JFrame{



    private JLabel jLabelFIRST_LINE_START;
    private JButton jButtonPAGE_START;
    private JButton jButtonFIRST_LINE_END;
    private JButton jButtonLINE_START;
    private JButton jButtonCENTER;
    private JButton jButtonLINE_END;
    private JButton jButtonLAST_LINE_START;
    private JButton jButtonPAGE_END;
    private JButton jButtonLAST_LINE_END;

    public MiGridBagLayout(){
        jLabelFIRST_LINE_START =new JLabel("FIRST_LINE_START");
        jButtonPAGE_START=new JButton("PAGE_START");
        jButtonFIRST_LINE_END =new JButton("FIRST_LINE_END");
        jButtonLINE_START =new JButton("LINE_START");
        jButtonCENTER =new JButton("CENTER");
        jButtonLINE_END =new JButton("LINE_END");
        jButtonLAST_LINE_START =new JButton("LAST_LINE_START");
        jButtonPAGE_END =new JButton("PAGE_END");
        jButtonLAST_LINE_END =new JButton("LAST_LINE_END");

        setLayout(new GridBagLayout());
        setBounds(900,0,300,300);
        add(jLabelFIRST_LINE_START);
        add(jButtonPAGE_START);
        add(jButtonLINE_START);
        add(jButtonCENTER);
        add(jButtonLINE_END);
        add(jButtonLAST_LINE_START);
        add(jButtonLAST_LINE_END);

        setVisible(true);
    }
}
