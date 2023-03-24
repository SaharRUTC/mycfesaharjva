
/**
 * Write a description of class MenuItem here.
 *
 * @author (sahar)
 * @version (a version number or a date)
 */
public abstract class MenuItem {
    int price;
    private String name;
    MenuItem(String name, int price){
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ", Price: " + price + "£";
    }

}