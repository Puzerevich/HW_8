import java.util.Arrays;
import Exception.ArraySizeException;
import Exception.ArrayDataException;

public class Application {
    public static void main(String[] args) throws ArraySizeException, ArrayDataException {
        String[][] arrCorrect = {{"1", "2", "3", "4"},
                {"5", "6",  "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};
        String[][] arrWrong = {{"1", "3", "6", "9"}, {"2", "4", "6", "8"},
                {"10", "20", "30", "40"}, {"11", "22", "test", "33"}};
        String[][] arrWrongSize = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}};

        ArrayValueCalculator calc = new ArrayValueCalculator();

        calc.doCalc(arrCorrect);
        System.out.println(calc.doCalc(arrCorrect));

        try {
//            System.out.println(calc.doCalc(arrCorrect));
//            System.out.println(calc.doCalc(arrWrong));
            System.out.println(calc.doCalc(arrWrongSize));
        } catch (ArraySizeException e) {
            System.err.println(e.getMessage());
            System.err.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
