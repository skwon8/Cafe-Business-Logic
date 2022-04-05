import java.util.ArrayList;

public class CafeUtilTest {
    public static void main(String [] args)
    {
        CafeUtil utilTest = new CafeUtil();

    ArrayList<String> menuItems = new ArrayList<String>();
    menuItems.add("drip coffee");
    menuItems.add("cappuccino");
    menuItems.add("latte");
    menuItems.add("mocha");

    utilTest.dispplayMenu(menuItems);

    ArrayList<String> customers = new ArrayList<String>();

    utilTest.addCustomer(customers);


    }
}