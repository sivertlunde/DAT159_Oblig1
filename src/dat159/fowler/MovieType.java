package dat159.fowler;

abstract class MovieType {
	
	abstract double getAmountOwed(int days);

	class REGULAR extends MovieType {
		
		double getAmountOwed(int days) {
			double amount = 0.0;
			amount += 2;
			if (days > 2) {
				amount += (days - 2) * 1.5;
			}
			return amount;
		}
	}

	class NEW_RELEASE extends MovieType {
		
		double getAmountOwed(int days) {
			double amount = 0.0;
			amount += days * 3;
			return amount;
		}
	}

	class CHILDRENS extends MovieType {
		
		double getAmountOwed(int days) {
			double amount = 0.0;
			amount += 2;
			if (days > 3) {
                amount += (days - 3) * 1.5;
			}
			return amount;
		}
	}

}
