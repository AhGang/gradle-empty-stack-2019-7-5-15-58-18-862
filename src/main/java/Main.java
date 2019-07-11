import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**Story 1**/
        Mobile mobile = new Mobile("Mobile","red","apple");
        IPhone iphone = new IPhone("Iphone","red","apple");
        Android androidMobile = new Android("Android","red","apple");
        String msg = scan.nextLine();
//        mobile.makeACall(msg);
//        iphone.makeACall(msg);
//        androidMobile.makeACall(msg);

        /**Story 2**/
//        mobile.printInfo();

        /**Story 3**/
//        Person person = new Person();
//        person.makeACall(mobile,msg);

        IPhoneRobot iPhoneRobot = new IPhoneRobot();
        iPhoneRobot.makeACall(androidMobile,msg);



        /**Story 4**/
//        Person person = new Person();
//        person.makeACall(mobile,msg);
//        person.makeACall(androidMobile,msg);



    }
}
