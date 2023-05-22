public class BankAccount {
    /**
     * Escribe una clase que represente una cuenta bancaria, con un saldo y un número de cuenta. La clase debe tener un método para retirar que reciba una cantidad de dinero y
     * lance una excepción de tipo SaldoInsuficienteException si el saldo es menor que la cantidad a retirar.
     * La excepción SaldoInsuficienteException debe ser una clase personalizada que herede de Exception y tenga un constructor que reciba un mensaje de error.
     */

    double balance;
    int ID;

    public BankAccount()
    {
        int ID = 1;
        balance = 10000;
    }

    public double extract(double moneyToExtract) throws SaldoInsuficienteException
    {
        if(moneyToExtract > balance)
        {
            throw new SaldoInsuficienteException("Sorry, not enough money.");
        }
        else {
            balance -=moneyToExtract;
        }
        return balance;
    }

}
