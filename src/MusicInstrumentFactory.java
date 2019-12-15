package src;


public class MusicInstrumentFactory extends ProductFactory{

	
	private static MusicInstrumentFactory instance = new MusicInstrumentFactory();
	
	private MusicInstrumentFactory() {	}
	
	public static MusicInstrumentFactory getInstance() {
		return instance;
	}
	
	
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
