public class VarArgs {

    public static void main(String[] args) {
        printNumbers();                  // zero arguments
        printNumbers(1);                 // one argument
        printNumbers(1, 2, 3, 4, 5);     // multiple arguments
        printNumbers(new int[]{1, 2, 3}); // can directly pass array also
        // Custom logger
        log("INFO", "App started", "DB connected", "User logged in");
    }

    public static void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void log(String level, String... messages) {
        for (String msg : messages) {
            System.out.println("[" + level + "] " + msg);
        }
    }


}
