public class Category {
    private String Name;
    private Cost[] Costs;

    public Category (String Name, Cost[] Costs) {
        this.Name = Name;
        this.Costs = Costs;
    }

    public Cost[] GetCost() {
        return Costs;
    }

}
