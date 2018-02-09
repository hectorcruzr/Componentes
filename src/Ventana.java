import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Ventana extends JFrame {
    //entrada

    private JLabel jLabel;
    private JLabel jLabeltitulo1;

    private JButton jButton;
    private JTextField jTextField;
    private JPasswordField jPasswordField;
    private JRadioButton jRadioButtonDVD;
    private JRadioButton jRadioButtonHD720;
    private JCheckBox jCheckBox;
    private JComboBox jComboBoxcomboBox;
    private JTextArea jTextAreaextArea;
    private JColorChooser jColorChooser;
    //salida
    private JProgressBar jProgressBar;

    public Ventana() {
        super.setTitle("COMPONENTES COMUNES EN JAVASWING v 1.0");
        setSize(300, 300);
        setLayout(new FlowLayout());

        //creacion
        jLabel = new JLabel("JLabel");
        jButton = new JButton("JButton");
        jTextField = new JTextField(15);
        jTextField.setText("JTextField");
        jPasswordField=new JPasswordField(15);
        jPasswordField.setText("JPasswordField");
        jTextField.setText("JPasswordField");
        jProgressBar = new JProgressBar();
        jRadioButtonDVD = new JRadioButton("854*480");
        jRadioButtonDVD.setBounds(10,20,100,30);
        jRadioButtonHD720 = new JRadioButton("1280*720");
        jRadioButtonHD720.setBounds(10,20,100,30);
        jCheckBox=new JCheckBox("JCheckBox",false);
        //agregar componentes
        add(jButton);
        add(jLabel);
        add(jTextField);
        add(jPasswordField);
        add(jRadioButtonDVD);
        add(jRadioButtonHD720);
        add(jCheckBox);
        //eventos
        jRadioButtonDVD.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                jRadioButtonHD720.setSelected(false);

                setSize(854,480);
            }
        });
        jRadioButtonHD720.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                jRadioButtonDVD.setSelected(false);
                setSize(1280,720);
            }
        });
        setVisible(true);
    }

}
