package strategyPattern.Project;

import java.util.Optional;

public class PaymentDecide {

    public static final ConditionClass conditionClass=new ConditionClass();
    static int validate(String choice)
    {
        try {
            PaymentStrategy paymentStrategy= conditionClass.conditionName(choice).orElseThrow(IllegalArgumentException::new);

            return  paymentStrategy.pay(500);


        }
        catch (IllegalArgumentException ex)
        {
            ex.printStackTrace();
            return 0;
        }
    }
    public static void main(String []args)
    {
        validate("Paytm");
    }
}
