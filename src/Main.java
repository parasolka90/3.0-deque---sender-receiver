import java.util.ArrayDeque;
        import java.util.Deque;
        import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Deque<Integer> q = new ArrayDeque<>();
        Sender s = new Sender(q);
        Receiver r = new Receiver(q);
        Monitor m = new Monitor(q);

        while (q.size() < 10) {
            int x = random.nextInt(30);
            int direction = random.nextInt(100);
            if (direction < 50) {
                s.send(x);
                System.out.print("wstawione: " + x + " ");
            } else {
                if (q.size() == 0) {
                    System.out.print("deque empty ");
                } else {
                    int receive = r.receive();
                    System.out.print("odebrane: " + receive + " ");
                }
            }
            System.out.print( m.showStatus() + "\n");
        }

    }
}