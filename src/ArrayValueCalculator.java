import Exception.ArraySizeException;
import Exception.ArrayDataException;

import java.util.Arrays;

public class ArrayValueCalculator {

    static int doCalc(String[][] str) throws ArraySizeException, ArrayDataException {
        int sum =0;
//        String sumStr ="";
        int[] beg ={0,0};

        if (str.length == 4 && str[0].length == 4) {
            try {
                for (int i = 0; i < str.length; i++) {
                    beg[0] = i;
                    for (int j = 0; j < str[0].length; j++) {
                        beg[1] = j;
                        sum += Integer.parseInt(str[i][j]);
//                        sumStr += str[i][j] + ", ";
                    }
                }
            }catch (NumberFormatException e) {
                throw new ArrayDataException("(ArrayDataException) Error on line " + Arrays.toString(str));
            }
        } else {
            throw new ArraySizeException(String.format("(ArraySizeException) Error size. Your array is %dx%d", str.length, str[0].length));
        }

        return  sum;
    }
}
