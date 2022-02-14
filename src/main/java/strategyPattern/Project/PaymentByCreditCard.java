package strategyPattern.Project;

public class PaymentByCreditCard implements PaymentStrategy
{
    @Override
    public int pay(int amount)
    {
        return amount;
    }
}
