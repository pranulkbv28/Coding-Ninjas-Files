package ClassesAndobjects.Competition;

public class Participant {
    String name;
    final private int participantID;
    final String division="Bangalore"; //the final keywords makes this variable immutable

    public Participant(String name, int participantID){
        this.name = name;
        this.participantID = participantID;
    }
    // public Participant(String name){
    //     this.name=name;
    // }
    public Participant(){
        this.name="default";
        this.participantID=0;
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
}
