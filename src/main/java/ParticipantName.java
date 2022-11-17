public class ParticipantName {

    /**
     * Checks if name is equal to the name inputted.
     * @param name input
     * @return Found or Not Found
     */
    public String ParticipantName(String name){
        String participants = "CaoimheCahill";
        if(participants.toLowerCase().equals(name.toLowerCase())){
            return "Found";
        }else {
            return "Not Found";
        }

    }
}


