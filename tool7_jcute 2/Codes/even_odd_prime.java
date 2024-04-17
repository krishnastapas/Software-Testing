import cute.Cute;

public class even_odd_prime {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int number = Cute.input.Integer();

        String result = checkNumber(number);

        System.out.println(result);
    }

    // Method to check if a number is prime, even, or odd
    public static String checkNumber(int number) {
        StringBuilder result = new StringBuilder();

        if (number <= 1) {
            result.append(number).append(" is not a prime number.\n");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                result.append(number).append(" is a prime number.\n");
            } else {
                result.append(number).append(" is not a prime number.\n");
            }
        }

        if (number % 2 == 0) {
            result.append(number).append(" is an even number.\n");
        } else {
            result.append(number).append(" is not an even number.\n");
        }

        if (number % 2 != 0) {
            result.append(number).append(" is an odd number.\n");
        } else {
            result.append(number).append(" is not an odd number.\n");
        }

        return result.toString();
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
