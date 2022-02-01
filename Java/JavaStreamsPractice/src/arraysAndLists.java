import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraysAndLists {
    String[] thingsArray = {"mouse", "pitcher", "microphone", "laptop", "monitor", "webcam", "pencil", "pen", "paper", "desk"};
    String[] thingsArray2 = new String[5];

    ArrayList<String> thingsArrayList = new ArrayList<>();
    ArrayList<String> thingsArrayList2 = new ArrayList<>(Arrays.asList("desktop", "wristrest", "keyboard", "headphones"));
    ArrayList<Integer> numberArrayList = new ArrayList<>(Arrays.asList(1, 5, 10, 20));


    public static void printArrayValue(int a, String[] arr) {
        System.out.println(arr[a]);
    }
}
