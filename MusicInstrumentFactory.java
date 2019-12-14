
public class MusicInstrumentFactory extends ProductFactory{

	@Override
	IMusicInstrument getIMusicInstrument(String productType) {
		if(productType.equalsIgnoreCase("StringMusicInstrument")) {
			return new StringMusicInstrument();
		}else if(productType.equalsIgnoreCase("VocalMusicInstrument")) {
			return new VocalMusicInstrument();
		}
		return null;
	}
	
	@Override
	IBook getIBook(String productType) {
		
		return null;
	}
	
	@Override
	IFood getIFood(String productType) {
		
		return null;
	}
}
