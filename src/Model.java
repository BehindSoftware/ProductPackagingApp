package src;


public class Model {

	private String boxTypeMessage;
 
    public void setValue(String value) {
        this.boxTypeMessage = value;
    }

    public String getValue() {
        return boxTypeMessage;
    }
    
	public PacketDepartment determinePacketType(String productType) {
		   if(productType == "FrozenFood") {
			   PacketDepartment pd = new PacketDepartment(new PerishablePackaging());
			   pd.setPacketType(pd.makeDecision());
			   return pd;
		   }else if(productType == "DramaBook" || productType == "AdventureBook" || productType == "ScienceFictionBook" || productType == "FreshFood") {
			   PacketDepartment pd = new PacketDepartment(new StandartPackaging());
			   pd.setPacketType(pd.makeDecision());
			   return pd;
		   }else {
			   PacketDepartment pd = new PacketDepartment(new BreakablePackaging());
			   pd.setPacketType(pd.makeDecision());
			   return pd;
		   }
		   
	}
}