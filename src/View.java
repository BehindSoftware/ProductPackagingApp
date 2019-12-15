package src;


import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class View extends JPanel 
{
 
	private static final long serialVersionUID = 1L;
	private JComboBox<String> mainComboBox;
    private JComboBox<String> subComboBox;
    private JButton deliverButton;
    private Hashtable<String, String[]> subItems = new Hashtable<String, String[]>();
    
    public View()
    {
        String[] items = { "Select Product", "Book", "Food", "MusicInstrument" };
        mainComboBox = new JComboBox<String>( items );

        JFrame frame = new JFrame("ProductPackagingApp");
        deliverButton = new JButton("Deliver");
        
        mainComboBox.putClientProperty("JComboBox.isTableCellEditor", Boolean.TRUE);
        add( mainComboBox );

        subComboBox = new JComboBox<String>();
        subComboBox.setPrototypeDisplayValue("XXXXXXXXXX"); 
        add( subComboBox );

        String[] subItems1 = { "Select Book", "DramaBook", "AdventureBook", "ScienceFictionBook" };
        subItems.put(items[1], subItems1);

        String[] subItems2 = { "Select Food", "FreshFood", "FrozenFood" };
        subItems.put(items[2], subItems2);

        String[] subItems3 = { "Select Music Instrument", "StringMusicInstrument", "VocalMusicInstrument" };
        subItems.put(items[3], subItems3);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add( mainComboBox );
        frame.add( subComboBox );
        frame.setLayout(new FlowLayout());
        frame.add(deliverButton);     
        frame.setLocationByPlatform( true );
        frame.pack();
        frame.setVisible( true );
    }
    
    public JComboBox<String> getMainComboBox() {
		return mainComboBox;
	}
    
    public JComboBox<String> getSubComboBox() {
		return subComboBox;
	}
    
    public Hashtable<String, String[]> getSubItems() {
		return subItems;
	}
    
    void addMainComboBoxListener(ActionListener in) {
    	mainComboBox.addActionListener(in);
    }

    void addButtonListener(ActionListener e) {
    	deliverButton.addActionListener(e);
    }

}
