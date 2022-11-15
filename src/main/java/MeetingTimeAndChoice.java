import java.util.ArrayList;

public class MeetingTimeAndChoice {

    /**
     * Arraylist 'list' of times of scheduled meetings, the new meeting 'time' and an accept or decline 'choice' is passed in.
     * If nothing is passed in, return false;
     * If list is empty, then time is added and returns true
     * If list is not empty and list already contains that time, then overlapping occurs, time is not added to list and returns false.
     * If list is not empty but list does not contain that time, and the user accepts it, the time is added to the list and returns true.
     * If list is not empty but list does not contain that time, and the user declines it, the time is not added to the list and returns false.
     * @param list
     * @param time
     * @param choice
     * @return true or false
     */

    public boolean MeetingTimeAndChoice(ArrayList<String> list, String time, String choice){
            if (list.contains(time)) {
                System.out.println("Participant already has a meeting scheduled at this time.");
                return false;
            } else if (!list.contains(time) || list.isEmpty()){
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
