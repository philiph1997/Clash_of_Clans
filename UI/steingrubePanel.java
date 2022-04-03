package UI;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class steingrubePanel extends JPanel{
    //private Goldmine mine;

    public steingrubePanel(){
        this.setLayout(new BorderLayout());
        JButton steingrube_Button = new JButton("Steingrube");
        this.add(steingrube_Button, BorderLayout.CENTER);
        steingrube_Button.setIcon(new StretchIcon("./SteingrubeIcon1.jpg", true));
    }
}