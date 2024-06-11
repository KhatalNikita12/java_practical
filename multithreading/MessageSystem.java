import java.util.Scanner;

class Message {
     String message;
     boolean flag = false;

    // Sender thread calls this method
    public synchronized void send(String message) {
        while (flag) {
            // Wait for the message to be processed
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Interrupted while waiting to send message.");
            }
        }
        this.message = message;
        flag = true;
        notifyAll(); // Notify the receiver that the message is ready
    }

    // Receiver thread calls this method
    public synchronized String receive() {
        while (!flag) {
            // Wait for the sender to send a message
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Interrupted while waiting to receive message.");
            }
        }
        flag = false;
        notifyAll(); // Notify the sender that the message has been received
        return message;
    }
}

class Sender extends Thread {
    private final Message message;

    public Sender(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String text;
        boolean input;
        do {
            input = true;
            System.out.println("Enter message: ");
            text = scanner.nextLine();
            message.send(text);
        } while (!text.equals("Good Bye Corona"));
        scanner.close();

        if (input) {
            System.out.println("Enter message: ");
        }
    }
}

class Receiver extends Thread {
    private final Message message;

    public Receiver(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String latestMessage;
        do {
            latestMessage = message.receive();
            System.out.println("Received: " + latestMessage);
        } while (!latestMessage.equals("Good Bye Corona"));
    }
}

public class MessageSystem {
    public static void main(String[] args) {
        Message sharedMessage = new Message();
        Sender sender = new Sender(sharedMessage);
        Receiver receiver = new Receiver(sharedMessage);
        sender.start();
        receiver.start();
    }
}
