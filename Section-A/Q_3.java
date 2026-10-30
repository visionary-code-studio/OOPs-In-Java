public class StringComparisonDemo {
    public static void main(String[] args) {
        // 1. String Literals (Stored in String Constant Pool / SCP)
        String literal1 = "Java";
        String literal2 = "Java"; // Points to the same object in SCP as literal1

        // 2. String Objects created using the 'new' keyword (Stored in Heap Memory)
        String obj1 = new String("Java"); // Creates a new object in Heap
        String obj2 = new String("Java"); // Creates another distinct object in Heap

        System.out.println("==================================================");
        System.out.println("           JAVA STRING COMPARISON DEMO            ");
        System.out.println("==================================================");

        // Displaying String Values
        System.out.println("Literal 1: \"" + literal1 + "\"");
        System.out.println("Literal 2: \"" + literal2 + "\"");
        System.out.println("Object 1:  \"" + obj1 + "\"");
        System.out.println("Object 2:  \"" + obj2 + "\"");
        System.out.println("--------------------------------------------------");

        // Reference Comparison using '=='
        System.out.println("\n--- REFERENCE COMPARISON (==) ---");
        System.out.println("literal1 == literal2 : " + (literal1 == literal2) 
            + " -> Both literals point to the exact same reference in the String Constant Pool.");
        
        System.out.println("literal1 == obj1     : " + (literal1 == obj1) 
            + " -> One is in the String Pool, the other is a separate object in Heap Memory.");
        
        System.out.println("obj1 == obj2         : " + (obj1 == obj2) 
            + " -> Two distinct 'new String()' calls allocate separate memory blocks in Heap.");

        // Content Comparison using 'equals()'
        System.out.println("\n--- CONTENT COMPARISON (.equals()) ---");
        System.out.println("literal1.equals(literal2) : " + literal1.equals(literal2) 
            + " -> Identical character sequence.");
        System.out.println("literal1.equals(obj1)     : " + literal1.equals(obj1) 
            + " -> Identical character sequence.");
        System.out.println("obj1.equals(obj2)         : " + obj1.equals(obj2) 
            + " -> Identical character sequence.");

        // Detailed Character & Memory Analysis
        System.out.println("\n--- CHARACTER ANALYSIS & MEMORY INSPECTION ---");
        analyzeString("literal1", literal1);
        analyzeString("literal2", literal2);
        analyzeString("obj1", obj1);
        analyzeString("obj2", obj2);
    }

    // Helper method to display character array and identity hash code (memory proxy)
    public static void analyzeString(String name, String str) {
        System.out.print(name + " | Value: \"" + str + "\" | HashCode (Ref): " + System.identityHashCode(str) + " | Chars: [");
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print("'" + chars[i] + "' (ASCII: " + (int) chars[i] + ")");
            if (i < chars.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
