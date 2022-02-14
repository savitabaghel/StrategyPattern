package strategyPattern.Project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PaymentByPaytm implements PaymentStrategy
{
    private static final Logger logger= LogManager.getLogger(PaymentByPaytm.class);


    @Override
    public int pay(int amount)
    {
       return amount;
    }
}
