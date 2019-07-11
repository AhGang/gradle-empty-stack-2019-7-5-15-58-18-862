public class IPhoneRobot {
    public void makeACall(Mobile mobile, String msg) {
        if(mobile.getClass().toString() != "class Iphone"){
            System.out.println(" IPhoneRobot can not use the other Mobiles");
        }else{
            mobile.makeACall(msg);
        }

    }
}
