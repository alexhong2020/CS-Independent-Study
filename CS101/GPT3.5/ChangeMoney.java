/*
Esmerelda lives in the U.S. but travels a lot to three specific countries or regions. She travels to european countries that use the Euro, and she travels to Japan and India. When she returns to the U.S. she uses a Currency Exchange Booth to have her money from her travels converted to U.S. dollars. They charge a percent fee after exchanging the money and they only give dollar bills, no cents. The exchange rates (and three letter codes) they use are:

One Euro (EUR) is 1.06953 US Dollars
One Japanese Yen (JPY) is 0.00745435 US Dollars
One Indian Rupee (INR) is 0.0120838 US Dollars
Write function calculate that has three parameters. The first parameter is the float amount , the amount of money she has left over from her visit. The second parameter is the string currency, a three letter code for the currency from her travels. She only uses the three currencies defined above. The third parameter is the integer percent, the percent fee the booth takes after the conversion. This function converts amount to US Dollars, substracts the percent fee and returns the integer dollar amount remaining. If there is not enough funds to take a fee, or the fee takes all the funds, the amount returned is 0.

For example, suppose the amount is 7580.00, currency is "INR", and the percent is 5. The equivalent US Dollars for 7580.00 Rupees is 7580.00 times the exchange rate 0.0120838, which is 91.595204 US Dollars. After subtracting a 5 percent fee of 4.5797602, the integer dollar amount returned is 87.
*/

public class ChangeMoney
{
    public int calculate(double amount, String currency, int percent)
    {
        double exchangeRate = 0.0;
        
        // Determine the exchange rate based on the given currency
        switch (currency) {
            case "EUR":
                exchangeRate = 1.06953;
                break;
            case "JPY":
                exchangeRate = 0.00745435;
                break;
            case "INR":
                exchangeRate = 0.0120838;
                break;
            default:
                // Handle unsupported currencies here if needed
                break;
        }
        
        // Convert the amount to US Dollars
        double usdAmount = amount * exchangeRate;

        // Calculate the fee
        double fee = (percent / 100.0) * usdAmount;

        // Calculate the remaining dollar amount
        double remainingAmount = usdAmount - fee;

        // Ensure remainingAmount is non-negative and round it to the nearest dollar
        int roundedAmount = (int) Math.round(remainingAmount);
        
        // Make sure the result is non-negative and return it
        return Math.max(roundedAmount, 0);
    }
}
