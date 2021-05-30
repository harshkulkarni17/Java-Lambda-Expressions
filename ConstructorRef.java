interface Messenger
{
    void getmsg(String s);

}
class Message
{
    Message(String msg)
    {
        System.out.println("Message is : " + msg);
    }
}
public class ConstructorRef {
    public static void main(String[] args) {
        Messenger refer = msg -> new Message(msg);
        refer.getmsg("Search the candle rather than cursing the darkness !");
    }
}
