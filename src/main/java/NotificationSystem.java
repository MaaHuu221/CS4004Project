/*
@author Andy Whelan
 */

public class NotificationSystem {
    public String notificationType(double time){
        //Time runs on a 24-hour clock
        if(time >= 8 && time <= 12){
            return "Good morning! Time for your meetup with Friends!";
        }
        else if(time > 12 && time <= 15){
            return "Afternoon! Ready to hangout with Colleagues?";
        }
        else if(time > 15 && time <= 20){
            return "Good Evening! Meetup with Family is underway!";
        }
        else if(time > 20 && time <= 24){
            return "Late Night huh? The Bro-Zone Lair is waiting!";
        }
        return null;
    }
}
