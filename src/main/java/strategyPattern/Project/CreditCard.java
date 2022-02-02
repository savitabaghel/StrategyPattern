package strategyPattern.Project;

import lombok.Data;

@Data
public class CreditCard {

    private int amount=1_000;
    private final String number;
    private final String date;
    private final String cvv;
}
