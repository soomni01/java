package ch09.exercise.p7;

public class Chatting {
    // @formatter:off
    class Chat {
        void start() {}
        void sendMessage(String message) {}
    }
    // @formatter:on

    void startChat(String chatId) {
        String nickName = chatId;

        class NestedChat extends Chat {
            @Override
            void start() {
                while (true) {
                    String input = "안녕하세요";
                    String message = "[" + nickName + "]" + input;
                    sendMessage(message);
                }
            }
        }

        Chat chat = new NestedChat();

        chat.start();
    }
}