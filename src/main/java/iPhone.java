public class IPhone extends Mobile {

    public IPhone(String name, String color, String brand) {
        super(name, color, brand);
    }
    @Override
    public void makeACall(String msg) {
        if(msg.length() > 20){
            System.out.println("<IPhone> Message cannot be sent");
        }else{
            System.out.println("<IPhone>Message : " + msg);
        }

    }

}
