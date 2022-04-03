package UI.Panels;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import logic.mauer;
import UI.*;

public class mauerPanel extends JPanel{
    private mauer mauer = null;

    public mauerPanel(){
        this.setLayout(new BorderLayout());
        JButton mauer_Button = new JButton("Mauer");
        this.add(mauer_Button, BorderLayout.CENTER);
        mauer_Button.setIcon(new StretchIcon("./Pictures/MauerIcon1.jpg", true));
    }
}