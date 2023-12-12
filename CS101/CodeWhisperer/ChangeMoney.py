'''
Esmerelda lives in the U.S. but travels a lot to three specific countries or regions. She travels to european countries that use the Euro, and she travels to Japan and India. When she returns to the U.S. she uses a Currency Exchange Booth to have her money from her travels converted to U.S. dollars. They charge a percent fee after exchanging the money and they only give dollar bills, no cents. The exchange rates (and three letter codes) they use are:

One Euro (EUR) is 1.06953 US Dollars
One Japanese Yen (JPY) is 0.00745435 US Dollars
One Indian Rupee (INR) is 0.0120838 US Dollars
Write function calculate that has three parameters. The first parameter is the float amount , the amount of money she has left over from her visit. The second parameter is the string currency, a three letter code for the currency from her travels. She only uses the three currencies defined above. The third parameter is the integer percent, the percent fee the booth takes after the conversion. This function converts amount to US Dollars, substracts the percent fee and returns the integer dollar amount remaining. If there is not enough funds to take a fee, or the fee takes all the funds, the amount returned is 0.

For example, suppose the amount is 7580.00, currency is "INR", and the percent is 5. The equivalent US Dollars for 7580.00 Rupees is 7580.00 times the exchange rate 0.0120838, which is 91.595204 US Dollars. After subtracting a 5 percent fee of 4.5797602, the integer dollar amount returned is 87.

amount is a float greater than 0.0
currency is one of three choices: "EUR", "INR" or "JPY"
Assume one Euro (EUR) is 1.06953 US Dollars
Assume one Japanese Yen (JPY) is 0.00745435 US Dollars
Assume one Indian Rupee (INR) is 0.0120838 US Dollars
percent is an integer greater than or equal to 0 and less than 100
'''

def calculate(amount, currency, percent):
    """
    There are three parameters. The first
  parameter amount is a float, representing 
  the amount of money in some currency. The
  second parameter currency is a string of three 
  letters representing one of three currencies: 
  "EUR", "JPY", or "INR". The third parameter 
  percent is an integer representing a percent,
  5 would represent 5 percent. 
  This function converts the amount given to US 
  Dollars, then substracts a fee that is the 
  percent given, and then returns the US Dollar 
  amount in whole dollars. The exchange rates are
  fixed amounts given in the writeup. 
    """
    if currency == "EUR":
        amount = amount * 1.06953
    elif currency == "JPY":
        amount = amount * 0.00745435
    elif currency == "INR":
        amount = amount * 0.0120838
    amount = amount - (amount * (percent/100))
    if amount < 0:
        return 0
    else:
        return int(amount)
       
