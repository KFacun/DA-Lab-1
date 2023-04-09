# DA-Lab-1
Data and Algo Lab 1: Bank Account and Account

Write a class to keep track of a balance in a bank account with a varying annual interest rate. The constructor will set both the balance and the interest rate to some initial values (with defaults of zero).

The class should have member functions to change or retrieve the current balance or interest rate. There should also be functions to make a deposit (add to the balance) or withdrawal (subtract from the balance). You should not allow more money to be withdrawn than what is available in the account, nor should you allow for negative deposits.

Finally, there should be a function that adds interest to the balance (interest accrual) at the current interest rate. This function should have a parameter indicating how many months’ worth of interest are to be added (for example, 6 indicate the account should have 6 months’ added). Interest is accrued from an annual rate. The month is representative of 1/12 that amount. Each month should be calculated and added to the total separately.

For example:

            1 month accrued at 5% APR is Balance = ((Balance * 0.05)/12) + Balance;

            For 3 months the calculations you repeat the statement above 3 times.
