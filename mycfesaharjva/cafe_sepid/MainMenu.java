
/**
 * Write a description of class MainMenu here.
 *
 * @author (sahar)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {

    private static Scanner scanner = new Scanner(System.in);
    private static int selection = 0;
    private static OrderList orderList = new OrderList();
    private static ArrayList<MenuItem> starters = new ArrayList<>();
    private static ArrayList<MenuItem> mainMeals = new ArrayList<>();
    private static ArrayList<MenuItem> deserts = new ArrayList<>();

    public static void main(String[] args) {
        initMenu();
        showMainMenu();
        System.out.println("Do you have a club card?[1: yes, 2: no]");
        selection = scanner.nextInt();
        if(selection == 1){
            orderList.setDiscount(15);
        }
        System.out.println("\n-----------------------------\n");
        System.out.println(orderList);
    }

    private static void initMenu() {
        starters.add(new Starter("Cheese Balls", 5));
        starters.add(new Starter("Chicken Satay", 8));
        mainMeals.add(new MainMeal("Chicken Biryani", 18));
        mainMeals.add(new MainMeal("Creamy Courgette Lasagne", 21));
        deserts.add(new Desert("Classic Vanilla Cheesecake", 12));
        deserts.add(new Desert("British Chalet Funnel Fries", 10));
    }

    private static void showMainMenu(){
        System.out.println("Main menu:");
        System.out.println();
        System.out.println("1. Starter ");
        System.out.println("2. Main meal");
        System.out.println("3. Desert");
        System.out.println("4. End");
        System.out.println();
        System.out.println("Please choose your option number and press enter:");
        selection = scanner.nextInt();
        System.out.println("\n-----------------------------\n");
        switch (selection){
            case 1:
                System.out.println("Starters:");
                showListMenu(starters);
                break;
            case 2:
                System.out.println("Main meals:");
                showListMenu(mainMeals);
                break;
            case 3:
                System.out.println("Deserts:");
                showListMenu(deserts);
                break;
        }
    }

    private static void showListMenu(ArrayList<MenuItem> list){
        System.out.println();
        for(int i = 0; i < list.size(); i++){
            System.out.println((i+1) + ". " + list.get(i));
        }
        System.out.println((list.size()+1) + ". " + "Go back");
        System.out.println();
        System.out.println("Please choose your option number and press enter:");
        selection = scanner.nextInt();
        if(selection != list.size()+1){
            MenuItem item = list.get(selection-1);
            System.out.println("Please enter the amount:");
            selection = scanner.nextInt();
            orderList.addItem(item, selection);
            System.out.println("Item added to orderList!");
        }
        System.out.println("\n-----------------------------\n");
        showMainMenu();
    }
}
