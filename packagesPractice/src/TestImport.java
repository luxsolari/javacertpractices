//import garden.vegetable.VineVegetable; // Single-type import declaration.
//import garden.*; // Using this will import the classes from this package level ONLY (not the nested packages types).
import garden.vegetable.*;// On-demand-type import declaration.
import nursery.vegetable.*;

public class TestImport {
    public static void main(String[] args) {
        // String lass is in the java.lang package, no need to qualify or import
        String s = "Testing import statements";
        System.out.println(s);

        // Using simple name here because we have imported the type
        VineVegetable.main(args);
        nursery.vegetable.VineVegetable.main(args); // Same class but different package.
                                                    // Works because is referenced with the fully qualified name.
    }
}

// Classes cannot have the same names as imported types using the single-type declaration, but will be used when
// the import statement is of the on-demand type (*)
class VineVegetable {
    public static void main(String[] args) {
        System.out.println("I am a local vine vegetable");
    }
}
