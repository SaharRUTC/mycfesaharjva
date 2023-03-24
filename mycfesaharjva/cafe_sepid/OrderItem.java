
/**
 * Write a description of class OrderItem here.
 *
 * @author (sahar )
 * @version (a version number or a date)
 */

public class OrderItem {
    private MenuItem item;
    private int count;
    OrderItem(MenuItem item, int count){
        this.item = item;
        this.count = count;
    }

    @Override
    public String toString() {
        return item + ", Count: " + count + ", Total Price: " + (count * item.price) + "£";
    }
}
