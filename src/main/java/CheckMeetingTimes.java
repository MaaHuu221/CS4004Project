import java.util.ArrayList;

public class CheckMeetingTimes {


        public boolean CheckMeetingTimes(ArrayList<Double> list, Double time) {
            if (list.contains(time)) {
                return false;
            } else {
                list.add(time);
                return true;
            }
        }



}
