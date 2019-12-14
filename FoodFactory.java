
public class FoodFactory extends ProductFactory {

	@Override
	public IFood getIFood(String productType) {
		
		if(productType.equalsIgnoreCase("FreshFood")) {
			return new FreshFood();
		}else if(productType.equalsIgnoreCase("FrozenFood")) {
			return new FrozenFood();
		}
		
		
		return null;
	}
}
