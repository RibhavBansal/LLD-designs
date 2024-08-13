package models;

import java.util.List;

public class MeetingScheduler {
    private Calendar calendar;
    private List<MeetingRoom> rooms;
    private User organizer;

    private static MeetingScheduler meetingSchedulerInstance;
    private MeetingScheduler(){}
    public static MeetingScheduler getInstance(){
        if(meetingSchedulerInstance == null){
            meetingSchedulerInstance = new MeetingScheduler();
        }
        return meetingSchedulerInstance;
    }


    public boolean scheduleMeeting(List<User> users, Interval interval){
        return true;
    }

    public boolean cancelMeeting(List<User> users, Interval interval){
        return true;
    }

    public boolean bookRoom(MeetingRoom room, int noOfPersons, Interval interval){
        return true;
    }

    public boolean releaseRoom(MeetingRoom room, Interval interval){
        return true;
    }
}
