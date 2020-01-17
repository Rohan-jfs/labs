package inheritance;

public class App {
public static void main(String[] args) {
	Room room;
	room=new Premium();
	room.actype();
	room.beds();
	room.breakfast();
	System.out.println("*******");
	room=new Deluxe();
	room.actype();
	room.beds();
	room.breakfast();
	System.out.println("*******");
	
	PaymentGateway paymentgateway;
	paymentgateway=new PaymentGatewayimpl();
	paymentgateway.paytmCash();
	//paymentgateway.
}
}

