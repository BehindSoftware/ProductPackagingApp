package src;


public class PacketDepartment {
	private IPacketManager packetManager;
	
	public PacketDepartment(IPacketManager packetManager) {
		this.packetManager = packetManager;
	}
	
	public String makeDecision(String productType) {
		return packetManager.packagingOperation(productType);
	}

}
