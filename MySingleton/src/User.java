public class User {
    private String userName;

    public User(String newUserName) {
        userName = newUserName;
    }

    public void sendMessage(String message) {
        WebSocket websocket = WebSocket.getInstance();
        websocket.sendMessage(userName, message);
    }
}
