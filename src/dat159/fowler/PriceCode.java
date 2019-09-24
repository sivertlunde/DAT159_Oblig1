package dat159.fowler;

abstract class PriceCode {

	int pricecode;
	abstract double getPrice();

	class REGULAR extends PriceCode {
		double getPrice() {
			return getPrice() ;
		}
	}

	class NEW_RELEASE extends PriceCode {
		double getPrice() {
			return getPrice();
		}
	}

	class CHILDRENS extends PriceCode {
		double getPrice() {
			return getPrice();
		}
	}

}
