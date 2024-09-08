package newfeatures;
//Enhanced switch introduced in Java12 & stabilized in Java14
public class EnhancedSwitch {

    public static void main(String[] args) {
        //Eg-1
        String test="amar";
        switch (test){
            case "amar","seshu","venkat"->System.out.println("my name");
            case "akbar"->System.out.println("not my name");
            default -> System.out.println("different name");
        }

        // Eg-2
        //The yield keyword is used to return a value from a multi-statement block inside the switch expression.
        int month = 2;
        int year = 2024;

        int daysInMonth = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                if (year>2000) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            default -> throw new IllegalArgumentException("Invalid month");
        };

        //Eg-3
        // Enhanced switch handles null unlike regular ones

        String fruit = null;

        String result = switch (fruit) {
            case null -> "No fruit selected!";
            case "Apple", "Banana", "Orange" -> "Fruit selected";
            default -> "Unknown selection";
        };
    }
}
