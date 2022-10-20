import java.util.Stack;

public class WebSocket {
    static WebSocket webSocketInstance;
    private final Stack<Message> messages;

    public Stack<Message> getMessages() {
        return messages;
    }

    private WebSocket() {
        messages = new Stack<>();
    }

    public static WebSocket getInstance() {
        if (webSocketInstance == null) {
            webSocketInstance = new WebSocket();
        }
        return webSocketInstance;
    }

    public void sendMessage(String userName, String message) {
        Message newMessage = new Message(userName, message);
        getMessages().push(newMessage);
    };

    public StringBuilder showMessages() {
        StringBuilder finalString = new StringBuilder();
        for (Message message : messages) {
            String thisUser = message.getMessage().get(0);
            String thisMessage = message.getMessage().get(1);
            finalString.append(thisUser).append(": ").append(thisMessage).append("\n");
        }
        return finalString;
    };
}
