package chapter4.solid.basic.dependency.inversion.bad;


public class ClassifiedPaymentIntegrator implements PaymentIntegrator {

	// Tightly coupled Dependecy!
	private IyzicoPaymentSystem iyzicoPaymentSystem;
	
	public ClassifiedPaymentIntegrator(IyzicoPaymentSystem iyzicoPaymentSystem) {
		
		this.iyzicoPaymentSystem = iyzicoPaymentSystem;
	}
	
	@Override
	public void makePayment(double totalPrice) {
		
		this.iyzicoPaymentSystem.charge(totalPrice);
	}
	
}
