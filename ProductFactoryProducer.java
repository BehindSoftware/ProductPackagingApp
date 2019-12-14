
public class ProductFactoryProducer {

	public static ProductFactory getFactory(String product) {
		
		if(product.equalsIgnoreCase("Food")) {
			return FoodFactory.getInstance();
		}else if (product.equalsIgnoreCase("Book")) {
			return BookFactory.getInstance();
		}else if(product.equalsIgnoreCase("MusicInstrument")) {
			return MusicInstrumentFactory.getInstance();
		}
		
		return null;
	}
	
}
