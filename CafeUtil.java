import java.util.ArrayList;

public class CafeUtil {

    // Method #1
    public int getStreakGoal() {
        System.out.println("getting streak");

        int totalVisitCount = 0;

        for (int visitCount = 1; visitCount <= 10; visitCount++) {
            totalVisitCount += visitCount;
        }
        return totalVisitCount;
    }

    // Method #2
    public double getOrderTotal(double [] prices) {
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
            total += prices[i];
        }
        return total;
    }

    // Method #3 - Using Dynamic Array to add & remove elements in Array.
    public void dispplayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i +" " + menuItems.get(i));
        }
    }

    // Method #4
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("There are " + customers.size() + " people in front of you.");
        customers.add(userName);
        System.out.println(customers);
    }
}
