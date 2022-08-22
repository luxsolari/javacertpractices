public class TestFQCN {
    public static void main(String[] args) {
        // It is not required to fully qualify any class inside the java.lang package.
        // Also, it is not required to use import statements for any classes inside the java.lang.package.
        java.lang.String s = "Testing ways to import classes with fully qualified class names.";
        System.out.println(s);

        String anotherString = "Another String without java.lang qualifier";
        System.out.println(anotherString);

        // Any class on any other packages must be qualified or imported
        garden.vegetable.VineVegetable.main(args);
    }
}
