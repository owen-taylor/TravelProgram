import java.util.Scanner;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.text.DecimalFormat;
public class MainMenu implements ActionListener
{
    static JFrame mainFrame;
    static JPanel mainPanel;
    static JLabel mainBackground;
    static JButton france;
    static JButton disneyland;
    static JButton coronado;
    static JButton cancun;
    static JButton seattle;
    static JButton chicago;
    static JButton taos;
    static JButton tucson;
    static JButton denver;
    static double finalDistance;
    
    private static DecimalFormat df2 = new DecimalFormat("#####.##");
    
    static int location1 = -1;
    static int location2 = -1;
    public void mainMenu()
    {
	mainFrame = new JFrame("Select the starting location then the ending location.");
	mainFrame.setSize(1200, 715);
	mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	mainPanel = new JPanel();
	mainPanel.setSize(1200, 715);
	
	mainBackground = new JLabel(new ImageIcon("world-map.png"));
	
	france = new JButton(new ImageIcon("france.png"));
	mainFrame.add(france);
	france.setBounds(561, 281, 30, 20);
	france.addActionListener(this);
	
	disneyland = new JButton(new ImageIcon("mickey.jpg"));
	mainFrame.add(disneyland);
	disneyland.setBounds(110, 333, 30, 20);
	disneyland.addActionListener(this);
	
	coronado = new JButton(new ImageIcon("coronadoFlag.gif"));
	mainFrame.add(coronado);
	coronado.setBounds(120, 395, 30, 20);
	coronado.addActionListener(this);
	
	cancun = new JButton(new ImageIcon("MexFlag.jpg"));
	mainFrame.add(cancun);
	cancun.setBounds(237, 394, 30, 20);
	cancun.addActionListener(this);
	
	seattle = new JButton(new ImageIcon("WashFlag.jpg"));
	mainFrame.add(seattle);
	seattle.setBounds(161, 284, 30, 20);
	seattle.addActionListener(this);
	
	chicago = new JButton(new ImageIcon("ILFlag.jpg"));
	mainFrame.add(chicago);
	chicago.setBounds(266, 300, 30, 20);
	chicago.addActionListener(this);
	
	taos = new JButton(new ImageIcon("NMFlag.gif"));
	mainFrame.add(taos);
	taos.setBounds(200, 341, 30, 20);
	taos.addActionListener(this);
	
	tucson = new JButton(new ImageIcon("zonaFlag.jpg"));
	mainFrame.add(tucson);
	tucson.setBounds(170, 341, 30, 20);
	tucson.addActionListener(this);
	
	denver = new JButton(new ImageIcon("coFlag.png"));
	mainFrame.add(denver);
	denver.setBounds(198, 320, 30, 20);
	denver.addActionListener(this);
	
	mainPanel.add(mainBackground);
	mainFrame.add(mainPanel);
	
	mainFrame.setVisible(true);
    }
    
    public void addButtons()
    {
	
    }
    
    public void actionPerformed(ActionEvent e)
    {
	if(e.getSource() == france)
	{
	    if(location1 == -1)
	    {
	    	location1 = 0;
	    	System.out.println("Locaition 1 " + DestinationDataBase.destinationList.get(location1).getName());
	    	
	    }
	    else
	    {
		location2 = 0;
		System.out.println("Locaition 2 " + DestinationDataBase.destinationList.get(location2).getName());
	    }
	}
	else if(e.getSource() == disneyland)
	{
	    if(location1 == -1)
	    {
	    	location1 = 1;
	    	System.out.println("Locaition 1 " + DestinationDataBase.destinationList.get(location1).getName());
	    }
	    else
	    {
		location2 = 1;
		System.out.println("Locaition 2 " + DestinationDataBase.destinationList.get(location2).getName());
	    }
	}
	
	else if(e.getSource() == coronado)
	{
	    if(location1 == -1)
	    {
	    	location1 = 2;
	    	System.out.println("Locaition 1 " + DestinationDataBase.destinationList.get(location1).getName());
	    }
	    else
	    {
		location2 = 2;
		System.out.println("Locaition 2 " + DestinationDataBase.destinationList.get(location2).getName());
	    }
	}
	else if(e.getSource() == cancun)
	{
	    if(location1 == -1)
	    {
	    	location1 = 3;
	    	System.out.println("Locaition 1 " + DestinationDataBase.destinationList.get(location1).getName());
	    }
	    else
	    {
		location2 = 3;
		System.out.println("Locaition 2 " + DestinationDataBase.destinationList.get(location2).getName());
	    }
	}
	else if(e.getSource() == seattle)
	{
	    if(location1 == -1)
	    {
	    	location1 = 4;
	    	System.out.println("Locaition 1 " + DestinationDataBase.destinationList.get(location1).getName());
	    }
	    else
	    {
		location2 = 4;
		System.out.println("Locaition 2 " + DestinationDataBase.destinationList.get(location2).getName());
	    }
	}
	else if(e.getSource() == chicago)
	{
	    if(location1 == -1)
	    {
	    	location1 = 5;
	    	System.out.println("Locaition 1 " + DestinationDataBase.destinationList.get(location1).getName());
	    }
	    else
	    {
		location2 = 5;
		System.out.println("Locaition 2 " + DestinationDataBase.destinationList.get(location2).getName());
	    }
	}
	
	else if(e.getSource() == taos)
	{
	    if(location1 == -1)
	    {
	    	location1 = 6;
	    	System.out.println("Locaition 1 " + DestinationDataBase.destinationList.get(location1).getName());
	    }
	    else
	    {
		location2 = 6;
		System.out.println("Locaition 2 " + DestinationDataBase.destinationList.get(location2).getName());
	    }
	}
	else if(e.getSource() == tucson)
	{
	    if(location1 == -1)
	    {
	    	location1 = 7;
	    	System.out.println("Locaition 1 " + DestinationDataBase.destinationList.get(location1).getName());
	    }
	    else
	    {
		location2 = 7;
		System.out.println("Locaition 2 " + DestinationDataBase.destinationList.get(location2).getName());
	    }
	}
	else if(e.getSource() == denver)
	{
	    if(location1 == -1)
	    {
	    	location1 = 8;
	    	System.out.println("Locaition 1 " + DestinationDataBase.destinationList.get(location1).getName());
	    }
	    else
	    {
		location2 = 8;
		System.out.println("Locaition 2 " + DestinationDataBase.destinationList.get(location2).getName());
	    }
	}
	
	if(location1 != -1 && location2 != -1)
	{
	    finalDistance = distanceCalulator(DestinationDataBase.destinationList.get(location1).getLatitude(),DestinationDataBase.destinationList.get(location1).getLongitude(), DestinationDataBase.destinationList.get(location2).getLatitude(), DestinationDataBase.destinationList.get(location2).getLongitude());
		
	    System.out.println("The distance between " +  DestinationDataBase.destinationList.get(location1).getName() + " and " + DestinationDataBase.destinationList.get(location2).getName() + " is about " + df2.format(finalDistance) + " miles");
	    distancePanel();
	}
	
    }
    
    public static void distancePanel()
    {
	JFrame distanceFrame = new JFrame();
	distanceFrame.setSize(600, 100);
	JPanel viewDistance = new JPanel();
	JLabel distance = new JLabel("The distance between " +  DestinationDataBase.destinationList.get(location1).getName() + " and " + DestinationDataBase.destinationList.get(location2).getName() + " is about " + df2.format(finalDistance) + " miles");
	
	viewDistance.add(distance);
	distanceFrame.add(viewDistance);
	
	distanceFrame.setVisible(true);
	
    }
    
    
    public double distanceCalulator(double lat1, double long1, double lat2, double long2)
    {
	double distance = 0;
	double latDifference = 0;
	double longDifference = 0;
	
	latDifference = Math.abs(lat1 - lat2);
	longDifference = Math.abs(long1 - long2);
	
	latDifference = latDifference * 69;
	longDifference = longDifference * 55;
	
	distance = Math.sqrt((latDifference * latDifference) + (longDifference * longDifference));
	
	return distance;
    }
    
   
}

