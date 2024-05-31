import java.lang.reflect.Array;
import java.util.Arrays;

public class Basket {

    private Cost[] Costs;
    public Basket() {
        Costs = new Cost[0];
    }

    public void addCosts(Cost cost){
        Costs = Arrays.copyOf(Costs, Costs.length + 1);
        Costs[Costs.length - 1] = cost;
    }

    public Cost[] getCosts() {
        return Costs;
    }

}

