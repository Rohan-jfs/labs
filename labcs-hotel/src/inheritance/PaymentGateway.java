package inheritance;

public interface PaymentGateway extends Paytm,GooglePay {

public void cash();

//public void googlePayUPI();
}
class PaymentGatewayimpl implements PaymentGateway{

	@Override
	public void paytmCash() {
	
		System.out.println("Paid through Paytm wallet!!");
	}

	@Override
	public void googlePayUPI() {
	
		System.out.println("Paid from UPI bank");
	}

	@Override
	public void cash() {
	
		System.out.println("Paid cash directly");
	}
}
	