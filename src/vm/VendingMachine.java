package vm;

/**
 * Created by nmenego on 9/6/16.
 */
public class VendingMachine {

   private static final int FW_PRICE = 10;
   private static final int SP_PRICE = 20;
   private static final int L_PRICE = 30;

   private int freshwaterCount;
   private int sodapopCount;
   private int lemonadeCount;

   private int money;
   private double revenue;

   public VendingMachine() {

   }

   public VendingMachine(int x, int y, int z) {
      this.freshwaterCount = x;
      this.sodapopCount = y;
      this.lemonadeCount = z;
   }

   public void insertMoney(int money) {
      // DO SOMETHING
      if(money < 0) {
         // error!
         throw new IllegalArgumentException("Negative money not allowed!");
      }
      this.money += money;
   }

   public void insertMoney(int moneyBills, int moneyCoins) {
      insertMoney(moneyBills + moneyCoins);
   }

   // return change
   public int selectItem(int choice) {

      int change = 0;
      switch(choice) {
         case 1:
            if (money >= FW_PRICE && freshwaterCount > 0) {
               System.out.println("here's your freshwater! refreshing!");
               change = computeChange(FW_PRICE);
               revenue += FW_PRICE;
               freshwaterCount--;
            }
            break;
         case 2:
            if (money >= SP_PRICE && sodapopCount > 0) {
               System.out.println("here's your soda pop! refreshing!");
               change = computeChange(SP_PRICE);
               revenue += SP_PRICE;
               sodapopCount--;
            }
            break;
         case 3:
            if (money >= L_PRICE && lemonadeCount > 0) {
               System.out.println("here's your lemonade! refreshing!");
               change = computeChange(L_PRICE);
               revenue += L_PRICE;
               lemonadeCount--;

            }
            break;
         default:
            change = computeChange(0);
      }

      money = 0;
      return change;
   }

   private int computeChange(int price) {
      return this.money - price;
   }

   public void printInventory() {
      System.out.println("=== vm1 ===");
      // System.out.println("freshwater: " + this.freshwaterCount);
      // System.out.println("sodapop: " + this.sodapopCount);
      // System.out.println("lemonade: " + this.lemonadeCount);
      System.out.printf("freshwater: %02d\n", this.freshwaterCount);
      System.out.printf("sodapop: %02d\n", this.sodapopCount);
      System.out.printf("lemonade: %02d\n", this.lemonadeCount);

      // format the string to include 2 decimal points
      String formattedRevenue = String.format("%.2f", this.revenue);
      System.out.println("revenue: Php" + formattedRevenue);
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
