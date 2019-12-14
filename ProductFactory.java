
public abstract class ProductFactory {
	abstract IFood getIFood(String productType);
	abstract IBook getIBook(String productType);
	abstract IMusicInstrument getIMusicInstrument(String productType);
}
