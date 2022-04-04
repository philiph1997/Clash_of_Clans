package UI.Panels;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import UI.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class steingrubePanel extends JPanel implements ActionListener{
    private BurgGUI burgGUI;
    private JButton steingrube_Button;

    public steingrubePanel(BurgGUI burgGUI){
        this.burgGUI = burgGUI;

        // Panel erstellen
        this.setLayout(new BorderLayout());
        this.steingrube_Button = new JButton("Steingrube");
        this.add(steingrube_Button, BorderLayout.CENTER);
        this.steingrube_Button.setIcon(new StretchIcon("./Pictures/SteingrubeIcon1.jpg", true));
        this.steingrube_Button.addActionListener(this); 
    }

    // wenn Bild geklickt, ruft es die Logik in der BurgGUI Klasse auf, um die totalen Werte zu erhöhen
    @Override
    public void actionPerformed(ActionEvent g) {
        if (g.getSource() == steingrube_Button){
            burgGUI.setLabelText("Steingrube");
        }
    }
}
