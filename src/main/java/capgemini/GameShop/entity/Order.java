package capgemini.GameShop.entity;

public class Order {

    long id;
    User user;
    String date; //change later for LocalDate or smth like that
    double totalValue;
    OrderStatus orderStatus;
}
