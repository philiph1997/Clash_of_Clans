import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BurgGUI extends JFrame implements ActionListener{
    BorderLayout alpha_Layout = new BorderLayout();
    
    //NORTH
    JPanel north_Panel = new JPanel();
    GridLayout north_Layout = new GridLayout(1,2);
    
    JLabel titel_Label = new JLabel("Clash of Clans");
    
    JPanel statistik_Panel = new JPanel();
    GridLayout statistik_Layout = new GridLayout(3,2);
    JLabel glueck_Label = new JLabel("Glück");
    JLabel reichtum_Label = new JLabel("Reichtum");
    JLabel verteidigung_Label = new JLabel("Verteidigung");
    JButton glueck_Button = new JButton("0");
    JButton reichtum_Button = new JButton("0");
    JButton verteidigung_Button = new JButton("0");


    //CENTER
    JPanel center_Panel = new JPanel();
    GridLayout center_Layout = new GridLayout(1,3);
    JPanel steingrube_Panel = new JPanel();
    JButton steingrube_Button = new JButton("Steingrube");
    JPanel goldmine_Panel = new JPanel();
    JButton goldmine_Button = new JButton("Goldmine");
    JPanel mauer_Panel = new JPanel();
    JButton mauer_Button = new JButton("Mauer");
    

    //SOUTH
    JPanel south_Panel = new JPanel();
    GridLayout south_Layout = new GridLayout(1,3);
    JLabel benutzer_Label = new JLabel("Benutzername");
    JButton zurWeltkarte_Button = new JButton("Zur Weltkarte");
    JButton exit_Button= new JButton("Exit");
    

    

    public BurgGUI(){
        setSize(800,500);
		setLayout(alpha_Layout);
		setTitle("Clash_of_Clans");

        //NORTH 
        add(north_Panel, BorderLayout.NORTH);
        north_Panel.setLayout(north_Layout);
        north_Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        north_Panel.add(titel_Label);
        north_Panel.add(statistik_Panel);
        statistik_Panel.setLayout(statistik_Layout);
        //Vererbung??
        statistik_Panel.add(glueck_Label);
        statistik_Panel.add(glueck_Button);//getPunkte
        glueck_Button.setEnabled(false);
        statistik_Panel.add(reichtum_Label);
        statistik_Panel.add(reichtum_Button);//getPunkte
        reichtum_Button.setEnabled(false);
        statistik_Panel.add(verteidigung_Label);
        statistik_Panel.add(verteidigung_Button);//getPunkte
        verteidigung_Button.setEnabled(false);   

        //CENTER
        add(center_Panel, BorderLayout.CENTER);
        center_Panel.setLayout(center_Layout);
        center_Panel.add(goldmine_Panel);
        goldmine_Panel.setLayout(new BorderLayout());
        goldmine_Panel.add(goldmine_Button, BorderLayout.CENTER);
        goldmine_Button.setIcon(new StretchIcon("./Goldmine1.jpg", true));
        goldmine_Button.addActionListener(this);
        center_Panel.add(steingrube_Panel);
        steingrube_Panel.setLayout(new BorderLayout());
        steingrube_Panel.add(steingrube_Button, BorderLayout.CENTER);
        steingrube_Button.setIcon(new StretchIcon("./SteingrubeIcon1.jpg", true));
        steingrube_Button.addActionListener(this);
        center_Panel.add(mauer_Panel);
        mauer_Panel.setLayout(new BorderLayout());
        mauer_Panel.add(mauer_Button, BorderLayout.CENTER);
        mauer_Button.setIcon(new StretchIcon("./MauerIcon1.jpg", true));
        mauer_Button.addActionListener(this);

        //SOUTH
        add(south_Panel, BorderLayout.SOUTH);
        south_Panel.setLayout(south_Layout);
        south_Panel.add(benutzer_Label);
        south_Panel.add(zurWeltkarte_Button);
        zurWeltkarte_Button.setEnabled(false);
        south_Panel.add(exit_Button);
        exit_Button.setEnabled(false);

        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        // TODO Auto-generated method stub
        if (event.getSource()==goldmine_Button) {
            //reichtum_Label.setText();;
        }
        if (event.getSource()==steingrube_Button) {

        }
        if (event.getSource()==mauer_Button){

        }
    }
}