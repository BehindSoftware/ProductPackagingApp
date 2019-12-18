package src;

import java.awt.event.*;

import javax.swing.DefaultComboBoxModel;

public class Controller {
    //... The Controller needs to interact with both the Model and View.
    private Model m_model;
    private View  m_view;

    Controller(Model model, View view) {
        m_model = model;
        m_view  = view;

        //... Add listeners to the view.
        view.addMainComboBoxListener(new ComboBoxListener());
        view.addButtonListener(new ButtonListener());
    }


    class ComboBoxListener implements ActionListener {
    	public void actionPerformed(ActionEvent e)
    	{
    		String item = (String)m_view.getMainComboBox().getSelectedItem();
    		Object o = m_view.getSubItems().get( item );

    		if (o == null)
    		{
    			m_view.getSubComboBox().setModel( new DefaultComboBoxModel<String>() );
    		}
    		else
    		{
    			m_view.getSubComboBox().setModel( new DefaultComboBoxModel<String>( (String[])o ) );
    		}
    	}
    }

    class ButtonListener implements ActionListener {
    		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			m_model.setValue(getSubComboBoxValue());
			PacketDepartment pd  = m_model.determinePacketType(m_model.getValue());
			m_view.showMessage(pd.getPacketType());	
		}
    }
    
    public String getMainComboBoxValue() {
    	return m_view.getMainComboBox().getSelectedItem().toString();
    }
    
    public String getSubComboBoxValue() {
    	return m_view.getSubComboBox().getSelectedItem().toString();
    }
}