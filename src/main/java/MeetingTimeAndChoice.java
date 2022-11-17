import java.util.ArrayList;

public class MeetingTimeAndChoice {

    public boolean MeetingTimeAndChoice(ArrayList<String> list, String time, String choice){
            if (list.contains(time)) {
                System.out.println("Participant already has a meeting scheduled at this time.");
                return false;
            } else if (list.isEmpty() || !list.contains(time)){
                if (choice.equals("yes")) {
                    list.add(time);
                    System.out.println("Meeting has been added to this participants schedule.");
                    return true;
                } else if (choice.equals("no")) {
                    return false;
                }
            }
            return false;
    }
}
