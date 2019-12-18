package src;


public class PacketDepartment {
	private IPacketManager packetManager;
	private String packetType;
	
	public PacketDepartment(IPacketManager packetManager) {
		this.packetManager = packetManager;
	}
	
	public String makeDecision() {
		return packetManager.packagingOperation();
	}
	
	public String getPacketType() {
		return packetType;
	}
	
	public void setPacketType(String packetType) {
		this.packetType = packetType;
	}

}
