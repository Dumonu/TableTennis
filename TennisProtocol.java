
public class TennisProtcol {
    private int state = WAITING;
    private enum States{
        WAITING, SENT
    }
    public String processInput(String theInput){
        if(state == WAITING){
        if(theInput == "Table!"){
            state = SENT;
            return "Tennis!";
        }else{
            return "Bye!";
        }
    }
    }
}