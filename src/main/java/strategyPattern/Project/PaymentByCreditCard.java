package strategyPattern.Project;

public class PaymentByCreditCard implements PaymentStrategy{

    private  CreditCard card;
    @Override
    public void collectPaymentDetails()
    {
        card = new CreditCard("cardnumber", "expiryDate", "cvv");
        System.out.println("Collecting Card details...");

    }

    @Override
    public boolean validatePaymentDetails()
    {
        System.out.println("Validating Card info:"+card);
        return true;
    }

    @Override
    public void pay(int amount)
    {
        System.out.println("Paying"+amount+"using Credit Card");
        card.setAmount(card.getAmount()-amount);
    }
}
