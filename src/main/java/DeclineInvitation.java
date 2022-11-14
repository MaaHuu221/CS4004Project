public class DeclineInvitation {
    public String acceptOrDecline(String acceptOrDecline) throws InvalidStringException {
        if (acceptOrDecline == "accept") {
            return "Invitation accepted";
        } else if (acceptOrDecline == "decline") {
            return "Invitation declined";
        } else {
            throw new InvalidStringException("Please enter \"accept\" or \"decline\"");
        }
    }
}
