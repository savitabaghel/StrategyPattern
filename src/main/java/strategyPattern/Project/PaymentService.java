package strategyPattern.Project;

import lombok.Setter;

@Setter
public class PaymentService {
    private int cost;

    private boolean includeDelivery=true;

    private PaymentStrategy strategy;

    public void processOrder(int cost)
    {
        this.cost=cost;
        strategy.collectPaymentDetails();
        if(strategy.validatePaymentDetails())
        {
            strategy.pay(getTotal());
        }

    }
    private int getTotal()
    {
        return includeDelivery?cost+20:cost;
    }
}
