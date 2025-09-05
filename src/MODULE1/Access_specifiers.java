package MODULE1;

class Access_specifiers {
    
    // public variable - can be accessed anywhere
    public String publicVar = "I am PUBLIC";
    
    // protected variable - can be accessed in the same package or subclasses
    protected String protectedVar = "I am PROTECTED";
    
    // private variable - can be accessed only within this class
    private String privateVar = "I am PRIVATE";

    // public method - can be accessed anywhere
    public void showPublic() {
        System.out.println("Public method: " + publicVar);
    }

    // protected method - can be accessed in same package or subclass
    protected void showProtected() {
        System.out.println("Protected method: " + protectedVar);
    }

    // private method - can be accessed only inside this class
    private void showPrivate() {
        System.out.println("Private method: " + privateVar);
    }

    // method inside the same class can access all
    public void accessAll() {
        System.out.println("Accessing all inside same class:");
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(privateVar);
        showPrivate(); // calling private method inside same class
    }
}

public class main{
    public static void main(String[] args) {
        Access_specifiers obj = new Access_specifiers ();

        // Accessing public members
        System.out.println(obj.publicVar);
        obj.showPublic();

        // Accessing protected members (same package - allowed)
        System.out.println(obj.protectedVar);
        obj.showProtected();

        // ❌ Accessing private members directly will give error
        // System.out.println(obj.privateVar); // Not allowed
        // obj.showPrivate(); // Not allowed

        // But we can still access private members via public method
        obj.accessAll();
    }
}

