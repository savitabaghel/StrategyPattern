package strategyPattern.Project;

public class PaymentByPaytm implements PaymentStrategy{

    private String mobileno;
    private String password;


    @Override
    public void collectPaymentDetails()
    {
        mobileno="9876567";
        password="password";
        System.out.println("Collecting Account details... ");
    }

    @Override
    public boolean validatePaymentDetails()
    {
        System.out.println("Validating info..");
        return true;
    }

    @Override
    public void pay(int amount)
    {
       System.out.println("Paying "+amount+"using paytm");
    }
}
