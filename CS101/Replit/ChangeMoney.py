def calculate(amount, currency, percent):
    exchange_rates = {
        "EUR": 1.06953,
        "JPY": 0.00745435,
        "INR": 0.0120838
    }
    
    if currency not in exchange_rates:
        return 0
    
    dollars = amount * exchange_rates[currency]
    fee = dollars * percent / 100
    dollars_remaining = dollars - fee
    
    return int(dollars_remaining)