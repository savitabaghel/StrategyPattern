package strategyPattern.Project;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ConditionClass {

    private final Map<String,PaymentStrategy>condition=new HashMap<>();

    public ConditionClass()
    {
        condition.put("CreditCard",new PaymentByCreditCard());
        condition.put("Paytm",new PaymentByPaytm());
    }
    public Optional<PaymentStrategy> conditionName(String method)
    {
        return Optional.ofNullable(condition.get(method));
    }
}
