package models;

import java.util.List;

public class MeetingSchedulingSystem {
    private MeetingScheduler meetingScheduler;
    private List<User> users;
    private List<MeetingRoom> rooms;

    private static MeetingSchedulingSystem schedulingSystemInstance = null;
    private MeetingSchedulingSystem(){}
    public static MeetingSchedulingSystem getInstance(){
        if(schedulingSystemInstance == null){
            schedulingSystemInstance = new MeetingSchedulingSystem();
        }
        return schedulingSystemInstance;
    }

    public void addRoom(){}
    public void removeRoom(){}

    public void scheduleMeeting(List<User> users, Interval interval){
        meetingScheduler.scheduleMeeting(users, interval);
    }

    public void cancelMeeting(Meeting meeting){}
}
