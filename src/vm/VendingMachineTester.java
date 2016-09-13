package vm;

/**
 * Created by nmenego on 9/6/16.
 */
public class VendingMachineTester {

    public static void main(String[] args) {

        VendingMachine vm = new VendingMachine(10, 30, 20);

        // jc
        vm.insertMoney(1000);
        int jcChange = vm.selectItem(1);
        System.out.println("jc's change: " + jcChange);

        // vince
        vm.insertMoney(100);
        vm.selectItem(3);

        vm.printInventory();


        // code review
        // exceptions
        // class diagrams

    }
}
