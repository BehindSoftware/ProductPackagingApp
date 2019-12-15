package src;


public class FoodFactory extends ProductFactory {

	private static FoodFactory instance = new FoodFactory();
	
	private FoodFactory() {	}
	
	public static FoodFactory getInstance() {
		return instance;
	}
	
	@Override
	public IFood getIFood(String productType) {
		
		if(productType.equalsIgnoreCase("FreshFood")) {
			return new FreshFood();
		}else if(productType.equalsIgnoreCase("FrozenFood")) {
			return new FrozenFood();
		}
		
		
		return null;
	}
	
	@Override
	IBook getIBook(String productType) {
		
		return null;
	}
	
	@Override
	IMusicInstrument getIMusicInstrument(String productType) {
		
		return null;
	}
}
