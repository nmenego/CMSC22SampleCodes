package exception;

/**
 * Created by nmenego on 11/7/16.
 */
public class CheckedVsUnchecked {
    public static void main(String[] args) {
        CheckedVsUnchecked test = new CheckedVsUnchecked();
//        test.checkedException();
        test.uncheckedException();
    }

    private void uncheckedException() {
        int[] arr = {0, 1, 2};
        System.out.println(arr[3]); //OOPS!!! ArrayIndexOutOfBoundsException
    }

    private void checkedException() throws Exception {
        throw new Exception("this is a checked exception.");
    }
}
