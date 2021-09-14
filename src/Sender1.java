public class Sender1 extends MailSender {

    @Override
    public void doBeforeSend() {
        System.out.println("Hello!");
    }

    @Override
    public void doAfterSend() {
        System.out.println("The message was deleted.");
    }

    @Override
    public void send(String message) {
        doBeforeSend();
        System.out.println(message);  //"отправка" сообщения
        doAfterSend();
    }
}
