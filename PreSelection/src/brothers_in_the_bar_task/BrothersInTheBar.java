package brothers_in_the_bar_task;

import java.util.Arrays;

public class BrothersInTheBar {
    public static int brothersInTheBar(int[] glasses) {
        int[] copyOfGlasses = Arrays.copyOf(glasses, glasses.length);

        int counter = 0;
        while (true) {
            int oldLength = copyOfGlasses.length;

            for (int i = 0; i <= copyOfGlasses.length - 3; i++) {
                if (copyOfGlasses[i] == copyOfGlasses[i + 1] && copyOfGlasses[i + 1] == copyOfGlasses[i + 2]) {
                    counter++;
                    copyOfGlasses = removeElements(copyOfGlasses, i, i + 3);
                    break;
                }
            }

            if (copyOfGlasses.length < 3 || oldLength == copyOfGlasses.length) {
                break;
            }
        }

        return counter;
    }

    private static int[] removeElements(int[] array, int fromIndex, int toIndex) {
        int[] leftSubArray = Arrays.copyOfRange(array, 0, fromIndex);
        int[] rightSubArray = Arrays.copyOfRange(array, toIndex, array.length);

        array = new int[array.length - 3];
        for (int j = 0; j < leftSubArray.length; j++) {
            array[j] = leftSubArray[j];
        }

        for (int j = 0; j < rightSubArray.length; j++) {
            array[j + leftSubArray.length] = rightSubArray[j];
        }

        return array;
    }
}
