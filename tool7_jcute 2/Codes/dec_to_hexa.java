import cute.Cute;

public class dec_to_hexa {
    public static void main(String[] args) {
        int decimal = generateRandomDecimal();

        System.out.println("Decimal number: " + decimal);

        String hexadecimal = convertToHexadecimal(decimal);

        System.out.println("Hexadecimal equivalent: " + hexadecimal);
    }

    // Method to generate a random decimal number
    public static int generateRandomDecimal() {
        return (int) (Math.random() * 1000); // Generates a random integer between 0 and 999
    }

    // Method to convert decimal to hexadecimal
    public static String convertToHexadecimal(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder hexadecimal = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 16;
            if (remainder < 10) {
                hexadecimal.insert(0, (char) ('0' + remainder));
            } else {
                hexadecimal.insert(0, (char) ('A' + remainder - 10));
            }
            decimal /= 16;
        }
        return hexadecimal.toString();
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
