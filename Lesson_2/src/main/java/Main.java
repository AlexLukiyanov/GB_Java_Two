
public class Main {

    public static void main(String[] args) {

        String[][] stringArray = new String[4][4];

        stringArray[0][0] = "1";
        stringArray[0][1] = "2";
        stringArray[0][2] = "3";
        stringArray[0][3] = "4";
        stringArray[1][0] = "5";
        stringArray[1][1] = "6";
        stringArray[1][2] = "7";
        stringArray[1][3] = "8";
        stringArray[2][0] = "9";
        stringArray[2][1] = "10";
        stringArray[2][2] = "11";
        stringArray[2][3] = "12";
        stringArray[3][0] = "13";
        stringArray[3][1] = "14";
        stringArray[3][2] = "15";
        stringArray[3][3] = "16";

        try {
            System.out.println("Сумма элементов массива " + receivingArray(stringArray));
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

    }

    public static int receivingArray(String[][] stringArray) throws MyArraySizeException, MyArrayDataException {
        final int SIZE_ARRAY = 4;
        int summ = 0;

        if (stringArray.length != SIZE_ARRAY) {
            throw new MyArraySizeException("Некорректный размер массива");
        }

        for (String[] arr : stringArray) {
            if (arr.length != SIZE_ARRAY) {
                throw new MyArraySizeException("Некорректный размер массива");
            }
        }

        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray.length; j++) {
                try {
                    summ += Integer.parseInt(stringArray[i][j]);
                } catch (MyArrayDataException e) {
                    System.out.println("Преобразование элемента массива не удалось. Измените элемент массива под номером " + i + " " + j);
                }
            }
        }
        return summ;
    }
}