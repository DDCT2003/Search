import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Busquedaform extends JFrame {
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JButton buscarButton;
    private JTextArea textArea1;

    public Busquedaform() {
        super ("holii");
        setContentPane(panel1);
        Busqueda a=new Busqueda();
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(a.Tiempo());
            }
        });
    }
}
