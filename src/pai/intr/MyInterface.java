package pai.intr;

public interface MyInterface {

    int DEFAULT_INT = 1;
    // implicitly public abstract, no need to write.
    String foo(int x);

    // interface methods can not have a body!
//    public void bar() {
//
//    }
}
