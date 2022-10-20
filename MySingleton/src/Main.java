public class Main {
    public static void main(String[] args) {
        WebSocket.getInstance();
        User user1 = new User("pc");
        User user2 = new User("shao");
        User user3 = new User("japs");

        user1.sendMessage("hey");
        user2.sendMessage("yo");
        user3.sendMessage("let's go");

        System.out.println(WebSocket.getInstance().showMessages());

//        Nesse codigo a utilização do WebSocket como Singleton tem enorme importancia uma vez que assim,
//        eu consigo criar um bate-papo que referencia a mesma base, ou seja, cada user criado,
//        enviara a mensagem para o mesmo WebSocket, sendo possivel depois retornar todas as mensagens criadas,
//        como pode ser observado ao rodar esse codigo ou observar a estrutura dele. Esse metodo evita a utilização de
//        varias instanciações websocket pelo meu codigo, uma vez que a intenção é possuir apenas uma instancia do mesmo.
    }
}
