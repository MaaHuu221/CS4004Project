import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CancelMeetings {


    public CancelMeetings(){
        addMeetings();
    }

    private final ArrayList<String> meetingList = new ArrayList<String>();

    public void addMeetings(){
        meetingList.add("Meeting 1");
        meetingList.addAll(Arrays.asList("Meeting 2", "Meeting 3", "Meeting 4", "Meeting 5", "Meeting 6"));
    }

    public String removeMeeting(String meetingChoice){
        if (meetingList.contains(meetingChoice)) {
            meetingList.remove(meetingChoice);
            return "Meeting has been removed";
        } else
            return "Meeting does not exist";
    }
}
