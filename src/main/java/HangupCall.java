public class HangupCall {
    public boolean stillOnCall = true;

    public boolean leaveCall(boolean leave) {
        if (leave) {
            System.out.println("You have successfully left the call!");
            stillOnCall = false;
        } else {
            System.out.println("You are still on the call!");
            stillOnCall = true;
        }
        return stillOnCall;
    }
}
