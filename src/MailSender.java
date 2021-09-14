public abstract class MailSender {

    public abstract void doBeforeSend();

    public abstract void doAfterSend();

    public abstract void send(String message);
}
