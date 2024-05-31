public class Cost {
    private String Name;
    private int Price;
    private float Rating;

    public Cost (String Name, int Price, float Rating){

        this.Name = Name;
        this.Price = Price;
        this.Rating = Rating;

    }

    public String GetName() {
        return Name;
    }

    public int GetPrice() {
        return Price;
    }

    public float GetRatting() {
        return Rating;
    }

}