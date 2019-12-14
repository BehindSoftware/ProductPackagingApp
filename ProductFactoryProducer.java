
public class ProductFactoryProducer {

	public static ProductFactory getFactory(String product) {
		if(product.equalsIgnoreCase("Food")) {
			return new FoodFactory();
		}else if (product.equalsIgnoreCase("Book")) {
			return new BookFactory();
		}else if(product.equalsIgnoreCase("MusicInstrument")) {
			return new MusicInstrumentFactory();
		}
		
		return null;
	}
	
}
