import java.util.Deque;

public class Sender {
    Deque<Integer> q;

    public Sender(Deque<Integer> q) {
        this.q = q;
    }

    public boolean send(int x) {
        return q.add(x);
    }
}
