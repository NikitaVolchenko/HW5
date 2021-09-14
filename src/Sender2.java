public class Sender2 extends MailSender {
    @Override
    public void doBeforeSend() {
        System.out.println("!!!");
    }

    @Override
    public void doAfterSend() {
    }

    @Override
    public void send(String message) {
        System.out.println(message); //"отправка" сообщения
        doBeforeSend();
        doAfterSend();
    }
}
