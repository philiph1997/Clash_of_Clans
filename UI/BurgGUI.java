package UI;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import logic.Game;
import logic.steingrube;
import logic.mauer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import UI.Panels.*;
import data.GameData;
import logic.*;

public class BurgGUI extends JFrame{
    // Variablen deklarieren
    private GameData gamedata = new GameData();
    
    private mauer mauer = new mauer(gamedata);
    private steingrube steingrube = new steingrube(gamedata);
    private goldmine goldmine = new goldmine(gamedata);

    private Game game = new Game(gamedata, mauer, steingrube, goldmine);
    private BorderLayout alpha_Layout = new BorderLayout();
    
    //NORTH
    private JPanel north_Panel = new JPanel();
    private GridLayout north_Layout = new GridLayout(1,2);
   
    private JLabel titel_Label = new JLabel("Clash of Clans");
   
    private JPanel statistik_Panel = new JPanel();
    private GridLayout statistik_Layout = new GridLayout(4,2);

    private JLabel stein_Label = new JLabel("Stein");
    private JLabel reichtum_Label = new JLabel("Reichtum");
    private JLabel verteidigung_Label = new JLabel("Verteidigung");
    private JLabel total_Label = new JLabel("Total-Level");

    private JButton stein_Button = new JButton("0");
    private JButton reichtum_Button = new JButton("0");
    private JButton verteidigung_Button = new JButton("0");
    private JButton total_Button = new JButton("0");

   //CENTER
    private JPanel center_Panel = new JPanel();

    //SOUTH
    private JPanel south_Panel = new JPanel();
    private GridLayout south_Layout = new GridLayout(1,3);
    private JLabel benutzer_Label = new JLabel(System.getProperty("user.name"));
    private JButton zurWeltkarte_Button = new JButton("Zur Weltkarte");
    private JButton exit_Button= new JButton("Exit");
    
    // Konstruktor 
    public BurgGUI(){
        // Fenster definieren
        setSize(800,500);
		setLayout(alpha_Layout);
		setTitle("Clash_of_Clans");

        // alle Panels, Buttons... dem Fenster hinzufügen
        //NORTH 
        add(north_Panel, BorderLayout.NORTH);
        north_Panel.setLayout(north_Layout);
        north_Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        north_Panel.add(titel_Label);

        north_Panel.add(statistik_Panel);
        statistik_Panel.setLayout(statistik_Layout);
        statistik_Panel.add(stein_Label);
        statistik_Panel.add(stein_Button);
        stein_Button.setEnabled(false);
        stein_Button.setText("0");

        statistik_Panel.add(reichtum_Label);
        statistik_Panel.add(reichtum_Button);
        reichtum_Button.setEnabled(false);
        reichtum_Button.setText("0");

        statistik_Panel.add(verteidigung_Label);
        statistik_Panel.add(verteidigung_Button);
        verteidigung_Button.setEnabled(false);
        verteidigung_Button.setText("0"); 

        statistik_Panel.add(total_Label);
        statistik_Panel.add(total_Button);
        total_Button.setEnabled(false);
        total_Button.setText("0"); 

        //CENTER
        add(center_Panel, BorderLayout.CENTER);
        int x = game.getGebaeudeLength();
        GridLayout center_Layout = new GridLayout(1,x);
        center_Panel.setLayout(center_Layout);
        ArrayList<String> gebaeudeListStrings = game.getGebaeudeListStrings();
        
        // panels der einzelnen Gebäude erstellen
        for (String gebaeudeObject: gebaeudeListStrings){
            if(gebaeudeObject.equals("mauer")){
                center_Panel.add(new mauerPanel(this));        
            }
            else if (gebaeudeObject.equals("steingrube")){
                center_Panel.add(new steingrubePanel(this));
            }
            else if (gebaeudeObject.equals("goldmine")){
                center_Panel.add(new goldPanel(this));
            }
            else{
                JButton error_Button = new JButton("Error");
                error_Button.setEnabled(false);
                center_Panel.add(error_Button);
            }
        }

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

    // total eröhen, wenn auf eines Bilder geklickt wird
    public void setLabelText(String labelName){
        System.out.println("Wird ausgeführt" + labelName);
        
        if (labelName.equals("Steingrube")){
            steingrube.increaseTotal();
            stein_Button.setText(String.valueOf(steingrube.getTotal()));
        }
        if (labelName.equals("Mauer")){
            mauer.increaseTotal();
            steingrube.decreaseTotal();
            goldmine.decreaseTotal();
            verteidigung_Button.setText(String.valueOf(mauer.getTotal()));
            reichtum_Button.setText(String.valueOf(goldmine.getTotal()));
        }
        if (labelName.equals("Goldmine")){
            goldmine.increaseTotal();
            steingrube.decreaseTotal();
            reichtum_Button.setText(String.valueOf(goldmine.getTotal()));
            stein_Button.setText(String.valueOf(steingrube.getTotal()));
        }
        // total anzeigen
        total_Button.setText(String.valueOf(game.getTotal()));

        // produktionsgeschwindigkeit jenach total erhöhen
        if(total_Button.getText().equals("25")){
            steingrube.setProduktionsgeschwindigkeit(1);
            goldmine.setProduktionsgeschwindigkeit(1);
        }
        if(total_Button.getText().equals("50")){
            steingrube.setProduktionsgeschwindigkeit(1);
            goldmine.setProduktionsgeschwindigkeit(1);
        }
        if(total_Button.getText().equals("75")){
            steingrube.setProduktionsgeschwindigkeit(1);
            goldmine.setProduktionsgeschwindigkeit(1);
        }
        if(total_Button.getText().equals("100")){
            System.exit(0);
        }

    }

}