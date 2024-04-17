import cute.Cute;

public class floating_point {
    public static void main(String[] args) {
        float num1 = generateRandomFloat();
        float num2 = generateRandomFloat();

        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        int choice = generateRandomChoice();

        System.out.println("\nOperation chosen: " + choice);

        float result = performOperation(num1, num2, choice);

        System.out.println("Result: " + result);
    }

    // Method to generate random float numbers
    public static float generateRandomFloat() {
        return (float) (Math.random() * 100); // Generates a float between 0 and 100
    }

    // Method to generate random choice between 1 and 4
    public static int generateRandomChoice() {
        return (int) (Math.random() * 4) + 1; // Generates an integer between 1 and 4
    }

    // Method to perform the chosen operation
    public static float performOperation(float num1, float num2, int choice) {
        float result = 0.0f;
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: Division by zero.");
                    return Float.NaN;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        return result;
    }
}
//@The following comments are auto-generated to save options for testing the current file
//@jcute.optionPrintOutput=true
//@jcute.optionLogPath=true
//@jcute.optionLogTraceAndInput=true
//@jcute.optionGenerateJUnit=true
//@jcute.optionExtraOptions=
//@jcute.optionJUnitOutputFolderName=C:\jcute
//@jcute.optionJUnitPkgName=
//@jcute.optionNumberOfPaths=10000
//@jcute.optionLogLevel=3
//@jcute.optionDepthForDFS=0
//@jcute.optionSearchStrategy=0
//@jcute.optionSequential=true
//@jcute.optionQuickSearchThreshold=100
//@jcute.optionLogRace=true
//@jcute.optionLogDeadlock=true
//@jcute.optionLogException=true
//@jcute.optionLogAssertion=true
//@jcute.optionUseRandomInputs=false
