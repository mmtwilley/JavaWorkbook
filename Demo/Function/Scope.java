package Demo.Function;

public class Scope {
    // Global scope
    static int oranges  = 6;
    public static void main(String[] args){
        
        System.out.println(oranges);
        // local scope
        int apples = 5;
        someFunction();
    }

    public static void someFunction(){
        System.out.println(apples);
    }
}
