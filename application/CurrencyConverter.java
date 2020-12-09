package application;

public class CurrencyConverter {

	public static final double IMPOST = 0.06;

	public static double calc(double price, double quantity) {
		return price * quantity * (1.0 + IMPOST);
	}
}
