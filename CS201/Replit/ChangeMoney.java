public class ChangeMoney {

	public int calculate(double amount, String currency, int percent) {
		double usdAmount = 0;
		switch (currency) {
			case "EUR":
				usdAmount = amount * 1.06953;
				break;
			case "JPY":
				usdAmount = amount * 0.00745435;
				break;
			case "INR":
				usdAmount = amount * 0.0120838;
				break;
		}
		double fee = usdAmount * (percent / 100.0);
		usdAmount -= fee;
		if (usdAmount <= 0) {
			return 0;
	}
	return (int) usdAmount;
	}
}