public class Users {
     private String Login;
     private String Password;
     private Basket Basket;

     public Users (String Login, String Password){
         this.Login = Login;
         this.Password = Password;
         this.Basket = new Basket();
     }
    public Basket GetBasket() {
        return Basket;
    }

}
