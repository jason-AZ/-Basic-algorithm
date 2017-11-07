package sort;

public class TestArray {

    public static int[] array = {49, 38, 65, 97, 76, 13, 27, 49};

    public static void print() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
