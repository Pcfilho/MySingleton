import java.util.Stack;

public class Message {
    private final Stack<String> message;

    public Message(String newUserName, String newMessage) {
        message = new Stack<>();
        message.add(newUserName);
        message.add(newMessage);
    };

    public Stack<String> getMessage() {
        return message;
    }
}
