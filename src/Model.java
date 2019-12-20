package src;


public class Model {

	private String boxTypeMessage;
 
    public void setValue(String value) {
        this.boxTypeMessage = value;
    }

    public String getValue() {
        return boxTypeMessage;
    }
    
    public String createProduct(String productType, String productSpecificType){

    	ProductFactory productFactory=null;

    	if(productType.equalsIgnoreCase("Food")) {
    		productFactory = ProductFactoryProducer.getFactory(productType);
    		IFood food1 = productFactory.getIFood(productSpecificType);
    		return food1.getProductType();
    	}else if (productType.equalsIgnoreCase("Book")) {
    		productFactory = ProductFactoryProducer.getFactory(productType);
    		IBook book1 = productFactory.getIBook(productSpecificType);
    		return book1.getProductType();
    	}else if(productType.equalsIgnoreCase("MusicInstrument")) {
    		productFactory = ProductFactoryProducer.getFactory(productType);
    		IMusicInstrument musicinstrument1 = productFactory.getIMusicInstrument(productSpecificType);
    		return musicinstrument1.getProductType();
    	}

    	return null;
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