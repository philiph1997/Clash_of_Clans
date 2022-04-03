package UI.Panels;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import logic.Game;
import logic.steingrube;
import UI.*;

public class steingrubePanel extends JPanel{
    private steingrube grube = null;

    public steingrubePanel(){
        this.setLayout(new BorderLayout());
        JButton steingrube_Button = new JButton("Steingrube");
        this.add(steingrube_Button, BorderLayout.CENTER);
        steingrube_Button.setIcon(new StretchIcon("./Pictures/SteingrubeIcon1.jpg", true));
    }
}