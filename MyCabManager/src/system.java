import java.util.ArrayList;
import java.util.List;

public class system {
    List<user>users = new ArrayList<>();
    List<Driver>drivers = new ArrayList<>();

    public void add_user(String name, char gender, int age){
        user user1 = new user(name, age, gender);
        users.add(user1);
    }

    public void add_driver(String name, char gender, int age, String car, String numberPlate, int x, int y) {
        Driver driver1 = new Driver(name, age, gender, car, numberPlate,x,y);
        drivers.add(driver1);
    }

    public void update_userLocation(String name, int x, int y){
        for(user user1 : users){
            if(user1.name == name){
                user1.x = x;
                user1.y = y;
            }
        }
    }

    public void update_driverLocation(String name, int x, int y){
        for(Driver driver : drivers){
            if(driver.name == name){
                driver.x = x;
                driver.y = y;
            }
        }
    }

    public void change_driver_status(String name, boolean status){
        for(Driver driver : drivers){
            if(driver.name == name){
                driver.isAvailable = status;
            }
        }
    }

    public List<Driver> find_ride(String name, int sourceX, int sourceY, int destX, int destY){
        List<Driver> availableDrivers = new ArrayList<Driver>();
        user user2 = null;
        for(user user1 : users){
            if(user1.name == name){
                user2 = user1;
            }
        }

        if(user2 != null){
            user2.destX = destX;
            user2.destY = destY;
        }

        for(Driver driver : drivers){
//            if(driver.name == name){
                int distance = (driver.x - sourceX) * (driver.x - sourceX) +
                        (driver.y - sourceY) * (driver.y - sourceY);
                if(distance <= 25 && driver.isAvailable){
                    availableDrivers.add(driver);
                }
//            }
        }
        return availableDrivers;
    }

    public Driver choose_ride(String name, String driver_name){
        user user1 = null;
        for(user user : users){
            if(user.name == name){
                user1 = user;
            }
        }

        for(Driver driver : drivers){
            if(driver.name == driver_name){
                if(user1 != null){
                    rides ride = new rides(user1.x,user1.y,user1.destX,user1.destY,driver);
                    user1.rides.add(ride);
                }
                driver.isAvailable = false;
                return driver;
            }
        }
        return null;
    }

    public int calculateBill(String name){
        user user1 = null;
        for(user user : users){
            if(user.name == name){
                user1 = user;
            }
        }

        if(user1 == null){return 0;}

        rides ride = user1.rides.get(0);
        int dist = (user1.destX - user1.x) * (user1.destX - user1.x) +
                (user1.destY - user1.y) * (user1.destY - user1.y);
        int amount = dist * 10;
        Driver driver = ride.driver;
        driver.isAvailable = true;
        find_total_earning(driver,amount);

        return amount;
    }

    public int find_total_earning(Driver driver, int amount) {
        driver.total_earning = driver.total_earning + amount;
        return driver.total_earning;
    }
}
