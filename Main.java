
public class Main 
{
   
public static void main(String[] args)
   {  
	   System.out.println("Hello App");
	   
	   
	   
	   
	   
	   
	   //take product from client and produce (create it)
	   
	   ProductFactory productFactory = ProductFactoryProducer.getFactory("Food");
	   
	   IFood food1 = productFactory.getIFood("FrozenFood");
	   
	   System.out.println("Product Type:"+food1.getProductType());
	   
	   
	   /*  //Give product type to packaging step 

	   String productType = "FrozenFood", packet;

	   if(productType == "FrozenFood") {
		   PacketDepartment pd = new PacketDepartment(new PerishablePackaging());
		   packet = pd.makeDecision(productType);
	   }else if(productType == "Drama" || productType == "Adventure" || productType == "ScienceFiction" || productType == "FreshFood") {
		   PacketDepartment pd = new PacketDepartment(new StandartPackaging());
		   packet = pd.makeDecision(productType);
	   }else {
		   PacketDepartment pd = new PacketDepartment(new BreakablePackaging());
		   packet = pd.makeDecision(productType);
	   }

	   System.out.println("Your packet is in "+packet);
	   
	    */
   }
   
}