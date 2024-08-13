import java.util.List;

public class Main {
    public static void main(String[] args) {
//        user user1 = new user("Abhay", 23,'M');
        system system1 = new system();
        system1.add_user("Abhay",'M',23);
        system1.update_userLocation("Abhay",0,0);

        system1.add_user("Vikram",'M',29);
        system1.update_userLocation("Vikram",10,0);

        system1.add_user("Kriti",'F',22);
        system1.update_userLocation("Kriti",15,6);

        system1.add_driver("Driver1",'M', 22, "Swift", "KA-011-12345",0,0);
        system1.add_driver("Driver2",'M', 29, "Swift", "KA-011-12345",0,0);
        system1.add_driver("Driver3",'M', 24, "Swift", "KA-011-12345",0,0);

        List<Driver> driver1 = system1.find_ride("Abhay",0,0,20,1);
        for (Driver d : driver1) {
            System.out.println(d.name);
        }

        System.out.println(1);

        List<Driver> driver2 = system1.find_ride("Vikram",10,0,15,3);
        for (Driver d : driver2) {
            System.out.println(d.name);
        }

        system1.choose_ride("Vikram", "Driver1");
        List<Driver> driver3 = system1.find_ride("Kriti",0,0,15,3);
        for (Driver d : driver3) {
            System.out.println(d.name);
        }

        System.out.println(system1.calculateBill("Vikram"));

        system1.update_userLocation("Vikram", 15,3);

//        System.out.println(system1.find_total_earning());

    }
}