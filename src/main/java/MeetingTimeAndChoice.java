import java.util.ArrayList;

public class MeetingTimeAndChoice {

    public boolean MeetingTimeAndChoice(ArrayList<String> list, String time, String choice){
        if (list.isEmpty()) {
            list.add(time);
            return true;
        } else {
            if (list.contains(time)) {
                System.out.println("Participant already has a meeting scheduled at this time.");
                return false;
            } else {
                if (choice.equals("yes")) {
                    list.add(time);
                    System.out.println("Meeting at " + time + " has been added to this participants schedule. The participant will review this and either accept or decline");
                    return true;
                } else if (choice.equals("no")) {
                    return false;
                }
            }

        }
        return false;
    }
}
