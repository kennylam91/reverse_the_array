import java.util.Scanner;

public class reverse_array {
    static Scanner scanner = new Scanner(System.in);
    static int sizeOfArray;
    static double[] myArray;
    static double[] myReverseArray;

    public static void main(String[] args) {
        sizeOfArray = inputSizeOfArray();
        myArray = new double[sizeOfArray];
        inputElementsToArray(myArray);
        showArrayElements(myArray);
        myReverseArray = reverseArray(myArray);
        showArrayElements(myReverseArray);

    }

    public static int inputSizeOfArray() {
        System.out.println("Input size of Array: ");
        return scanner.nextInt();
    }

    public static void inputElementsToArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input element: ");
            array[i] = scanner.nextDouble();
        }

    }

    public static void showArrayElements(double[] array) {
        for (double element : array) {
            System.out.print(element+"\t");
        }
        System.out.println();
    }

    public static double[] reverseArray(double[] array) {
        double[] reverseArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length - 1 - i];
        }
        return reverseArray;
    }

}
