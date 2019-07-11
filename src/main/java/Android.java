public class Android extends Mobile{

    public Android(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void makeACall(String msg) {
        if(msg.length() > 10){
            System.out.println("<Andriod> Message cannot be sent");
        }else{
            System.out.println("<Andriod>Message  : " + msg);
        }
    }
}

