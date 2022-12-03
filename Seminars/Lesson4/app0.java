import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class app0 {
    public static void main(String[] args) {
        ArrayList<Integer> dq = new ArrayList<>();
        ArrayList<Integer> linkl = new ArrayList<>();
        LocalTime timeStart = LocalTime.now();

        for (int i = 0; i < Math.pow(1000000,10); i++) {
            dq.add(i);
        }
        LocalTime timeStop = LocalTime.now();
        Duration diff = Duration.between(timeStart, timeStop);
        System.out.println("Время Deque: "+diff);

        timeStart = LocalTime.now();

        for (int i = 0; i < Math.pow(1000000,10); i++) {
            linkl.add(i);
        }
        timeStop = LocalTime.now();
        diff = Duration.between(timeStart, timeStop);
        System.out.println("Время LinkedList: "+diff);
    }
}
