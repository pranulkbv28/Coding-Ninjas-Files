package ClassesAndobjects.Competition;

public class Participant {
    String name;
    final private int participantID;
    final static String division="Bangalore"; 
    //the final keywords makes this variable immutable 
    //the static keyword makes sure that it belongs to the Class and also reduces the copies that are created
    private static int numParticipants; 
    // the reason for the addition of the private keyword is because we do not want anyone changing the value of the number of participants

    public Participant(String name){
        this.name = name;
        numParticipants++;
        this.participantID = numParticipants;
    }
    // public Participant(String name){
    //     this.name=name;
    // }
    public Participant(){
        this.name="default";
        numParticipants++;
        this.participantID = numParticipants;
    }

    // public void setParticipantID(int participantID){
    //     this.participantID=participantID;
    // }
    // public int printParticipantID(){
    //     return participantID;
    // }
    public void print(){
        if(participantID<0){
            return;
        }
        System.out.println(name+" "+participantID+" "+division);
    }
    public static int getNumParticipants(){
        return numParticipants;
    }
}
