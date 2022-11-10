import java.util.ArrayList;

public class CheckMeetingTimes {


        public boolean CheckMeetingTimes(ArrayList<Double> list, Double time) {
            if (list.contains(time)) {
                System.out.println("Participant already has a meeting scheduled at this time.");
                return false;
            } else {
                list.add(time);
                System.out.println("Meeting at " + time + " has been added to this participants schedule. The participant will review this and either accept or decline");
                return true;
            }
        }



}
