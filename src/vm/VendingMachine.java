package vm;

/**
 * Created by nmenego on 9/6/16.
 */
public class VendingMachine {

    final static int FW_PRICE = 10;
    final static int SP_PRICE = 20;
    final static int L_PRICE = 30;


    private int freshwaterCount; //10
    private int sodapopCount; //20
    private int lemonadeCount; //30

    // current money inserted by user
    private int money;
    // total money inside the machine
    private int balance;

    VendingMachine() {

    }

    VendingMachine(int x, int y, int z) {
        this.freshwaterCount = x;
        this.sodapopCount = y;
        this.lemonadeCount = z;
    }

    /**
     * something something
     */
    public void insertMoney(int money) {
        this.money += money;
    }

    public void selectItem(int choice) {
        int change = 0;
        switch (choice) {
            case 1:
                if(freshwaterCount > 0 && money >= FW_PRICE) {
                    System.out.println("here's your freshwater!");
                    freshwaterCount--;
                    change = giveChange(FW_PRICE);
                }
                break;
            case 2:
                if(sodapopCount > 0 && money >= SP_PRICE) {
                    System.out.println("here's your soda!");
                    sodapopCount--;
                    change = giveChange(SP_PRICE);
                }
                break;
            case 3:
                if(lemonadeCount > 0 && money >= L_PRICE) {
                    System.out.println("here's your lemonade!");
                    lemonadeCount--;
                    change = giveChange(L_PRICE);
                }
                break;
            default:
                // do nothing
        }

        System.out.println("your change is: " + change);
        balance += money - change;
        money = 0;
    }

    public void printInventory () {
        System.out.println("Freshwater: " + freshwaterCount);
        System.out.println("Soda Pop: " + sodapopCount);
        System.out.println("Lemonade: " + lemonadeCount);
        System.out.println("$$$: " + balance);
    }

    private int giveChange(int price) {
        return money - price;
    }


    public int getFreshwaterCount() {
        return freshwaterCount;
    }

    public void setFreshwaterCount(int freshwaterCount) {
        this.freshwaterCount = freshwaterCount;
    }

    public int getSodapopCount() {
        return sodapopCount;
    }

    public void setSodapopCount(int sodapopCount) {
        this.sodapopCount = sodapopCount;
    }

    public int getLemonadeCount() {
        return lemonadeCount;
    }

    public void setLemonadeCount(int lemonadeCount) {
        this.lemonadeCount = lemonadeCount;
    }
}
