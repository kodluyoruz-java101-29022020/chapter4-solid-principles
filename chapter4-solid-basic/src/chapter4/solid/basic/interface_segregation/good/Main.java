package chapter4.solid.basic.interface_segregation.good;

import chapter4.solid.basic.interface_segregation.bad.BoynerGiftCard;
import chapter4.solid.basic.interface_segregation.bad.CreditCard;
import chapter4.solid.basic.interface_segregation.bad.ShoppingCard;
import chapter4.solid.basic.interface_segregation.bad.SodexoCard;

public class Main {

	public static void main(String[] args) {
		
		ShoppingCard creditCard = new CreditCard();
		ShoppingCard sodexoCard = new SodexoCard();
		ShoppingCard giftCard = new BoynerGiftCard();
		
		creditCard.loadMoney(100000);
		sodexoCard.loadMoney(750);
		giftCard.loadMoney(1000);
		
		
		
		((MarketShoppingCard)sodexoCard).makeMarketShopping(100);
		
		((OnlineShoppingCard)creditCard).makeOnlineShopping(100);
		
		giftCard.withDrawMoney(100);
	}

}
