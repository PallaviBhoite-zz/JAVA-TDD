public class FizzBuzz {

    public static final int FIZZ_NUMBER = 3;
    public static final int BUZZ_NUMBER = 5;


    public String process(Integer inputValue) {
        String outputValue = buildFizzValue(inputValue);
        outputValue += buildBuzzValue(inputValue);
        return buildOutputValue(inputValue, outputValue);
    }

    private String buildOutputValue(Integer inputValue, String outputValue) {
        if ("".equals(outputValue)) {
            outputValue = inputValue.toString();
        }
        return outputValue;
    }

    private String buildBuzzValue(Integer inputValue) {
        String outputValue = "";
        if (inputValue % BUZZ_NUMBER == 0) {
            outputValue = "buzz";
        }
        return outputValue;
    }

    private String buildFizzValue(Integer inputValue) {
        String outputValue = "";
        if (inputValue % FIZZ_NUMBER == 0) {
            outputValue = "fizz";
        }
        return outputValue;
    }
}
