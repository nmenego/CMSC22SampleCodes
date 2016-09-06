package vm;

/**
 * Created by nmenego on 9/6/16.
 */
public class VendingMachineTester {

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine(100, 50, 50);


        vm.insertMoney(1000);
        vm.selectItem(2);
        vm.printInventory();
        vm.setFreshwaterCount(vm.getFreshwaterCount() + 20);





    }
}
