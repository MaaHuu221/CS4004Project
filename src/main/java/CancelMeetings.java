import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CancelMeetings {

    Meetings meetings;

    public CancelMeetings(Meetings meetings){
        this.meetings = meetings;
    }

    public String removeMeeting(String meetingChoice){
        ArrayList<String> meetingList = meetings.meetingList;
        meetings.getMeetings();
        if (meetingList.contains(meetingChoice)) {
            meetingList.remove(meetingChoice);
            return "Meeting has been removed";
        } else
            return "Meeting does not exist";
    }
}
