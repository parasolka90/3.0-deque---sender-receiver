import java.util.Deque;

public class Receiver {
    Deque<Integer> q;

    public Receiver(Deque<Integer> q) {
        this.q = q;
    }

    public Integer receive() {
        return q.pop();
    }
}
