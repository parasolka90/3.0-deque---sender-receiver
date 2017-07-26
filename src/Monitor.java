import java.util.Deque;

public class Monitor {
    Deque<Integer> q;

    public Monitor(Deque<Integer> q) {
        this.q = q;
    }

    public String showStatus() {
        return "dlugosc kolejki: " + q.size();
    }
}
