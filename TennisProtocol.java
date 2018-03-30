
public class TennisProtocol {
    private States state = States.WAITING;

    private enum States {
        WAITING, SENT
    }

    public String processInput(String theInput) {
        if (state == States.WAITING) {
            if (theInput.equals("Table!")) {
                state = States.SENT;
                return "Tennis!";
            } else {
                return "Bye!";
            }
        }
        return "";
    }
}