package UI.Panels;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import UI.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mauerPanel extends JPanel implements ActionListener {
    private BurgGUI burgGUI;
    private JButton mauer_Button;

    public mauerPanel( BurgGUI burgGUI){
        this.burgGUI = burgGUI;

        this.setLayout(new BorderLayout());
        this.mauer_Button = new JButton("Mauer");
        this.add(mauer_Button, BorderLayout.CENTER);
        mauer_Button.setIcon(new StretchIcon("./Pictures/MauerIcon1.jpg", true));

        mauer_Button.addActionListener(this); 
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mauer_Button){
            burgGUI.setLabelText("Mauer");
        }
    }
}