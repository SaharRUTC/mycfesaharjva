
/**
 * Write a description of class OrderList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class OrderList {
    private int totalPrice = 0;
    private int discount = 0;
    private ArrayList<OrderItem> items = new ArrayList<>();

    void addItem(MenuItem item, int count){
        items.add(new OrderItem(item, count));
        totalPrice += item.price * count;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        String str = "OrderList:\n";

        for(OrderItem item: items){
            str += item + "\n";
        }
        str += "\nTotal:\n";
        str += "Total price: " + totalPrice + "£\n";
        str += "Discount: " + ((totalPrice * discount)/100) + "£\n";
        str += "Net price: " + (totalPrice - (totalPrice*discount)/100) + "£\n";
        return str;
    }

}