
public class Program {

    public static void main(String[] args) {

        // Object of Parent
        Parent p = new Parent();

        // Object of Child
        Child c = new Child();

        // 1. Parent method using Parent object
        p.parentMethod();

        // 2. Child method using Child object
        c.childMethod();

        // 3. Parent method using Child object
        c.parentMethod();
    }
}

