import java.util.Scanner;

class StringCompare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String s1 = str;
        String s2 = str;
        String s3 = new String(str);

        System.out.println("\nComparison Results:");

        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1 == s3 : " + (s1 == s3));
        System.out.println("s1.equals(s3) : " + s1.equals(s3));

        System.out.println("\nConclusion:");
        System.out.println("s1 and s2 refer to the same object.");
        System.out.println("s1 and s3 refer to different objects.");
        System.out.println("Both have the same string content.");

        sc.close();
    }
}
