public class Main {
    public static void main(String[] args) {

        Users Dima = new Users("Dima","123");
        Users Andrey = new Users("Andrey","111");
        Users Lexa = new Users("Lexa","222");
        Users Levik = new Users("Levik","333");
        Users Egor = new Users("Egor","555");

        Cost cost1 = new Cost("Молоко", 150, 76.7f);
        Cost cost2 = new Cost("Мука", 120, 98.7f);
        Cost cost3 = new Cost("Яйца", 170, 100f);
        Cost cost4 = new Cost("Разрыхлитель", 50, 75.4f);
        Cost cost5 = new Cost("Масло Подсолнечное", 89, 89f);

        Dima.GetBasket().addCosts(cost1);
        Andrey.GetBasket().addCosts(cost2);
        Lexa.GetBasket().addCosts(cost3);
        Levik.GetBasket().addCosts(cost4);
        Egor.GetBasket().addCosts(cost5);

        Category vilage = new Category("Сельхоз", new Cost[]{cost2, cost3, cost1, cost5});
        Category spieces = new Category("Специи", new Cost[]{cost4});

        System.out.println("Каталог продуктов:");

        System.out.println("Сельхоз:");
        for (Cost cost : vilage.GetCost()){
            System.out.println(cost.GetName() + "\nPrice: " + cost.GetPrice() + " руб. \nRating: " + cost.GetRatting());
        }

        System.out.println("Специи:");
        for (Cost cost : spieces.GetCost()){
            System.out.println(cost.GetName() + "\nPrice: " + cost.GetPrice() + " руб. \nRating: " + cost.GetRatting());
        }

        System.out.println("Корзина пользователей:");

        System.out.println("Dima");
        for (Cost cost : Dima.GetBasket().getCosts()) {
            System.out.println(cost.GetName());
        }

        System.out.println("Andrey");
        for (Cost cost : Andrey.GetBasket().getCosts()) {
            System.out.println(cost.GetName());
        }

        System.out.println("Lexa");
        for (Cost cost : Lexa.GetBasket().getCosts()) {
            System.out.println(cost.GetName());
        }

        System.out.println("Levik");
        for (Cost cost : Levik.GetBasket().getCosts()) {
            System.out.println(cost.GetName());
        }

        System.out.println("Egor");
        for (Cost cost : Egor.GetBasket().getCosts()) {
            System.out.println(cost.GetName());
        }

    }
}