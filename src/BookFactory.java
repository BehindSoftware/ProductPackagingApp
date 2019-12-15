package src;


public class BookFactory extends ProductFactory {

	private static BookFactory instance = new BookFactory();
	
	private BookFactory() {	}
	
	public static BookFactory getInstance() {
		return instance;
	}
	
	
	@Override
	IBook getIBook(String productType) {
	
		if(productType.equalsIgnoreCase("DramaBook")) {
			return new DramaBook();
		}else if(productType.equalsIgnoreCase("AdventureBook")) {
			return new AdventureBook();
		}else if(productType.equalsIgnoreCase("ScienceFictionBook")) {
			return new ScienceFictionBook();
		}
		
		return null;
	}
	
	@Override
	IFood getIFood(String productType) {
		
		return null;
	}
	
	@Override
	IMusicInstrument getIMusicInstrument(String productType) {
		
		return null;
	}
}
