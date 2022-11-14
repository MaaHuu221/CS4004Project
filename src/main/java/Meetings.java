import java.util.ArrayList;

public class Meetings {

    public ArrayList<String> getMeetings() {
        meetingList.add("Meeting 1");
        meetingList.add("Meeting 2");
        meetingList.add("Meeting 3");
        meetingList.add("Meeting 4");
        meetingList.add("Meeting 5");
        return meetingList;
    }

    public void setMeetings(ArrayList<String> meetings) {
        this.meetingList = meetings;
    }

    ArrayList<String> meetingList = new ArrayList<String>();

}

