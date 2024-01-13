package ClassesAndobjects.Competition;

public class ParticipantUse {
    public static void main(String[] args) {
        Participant par = new Participant();
        // Participant par1 = new Participant("Pranaav");
        Participant par2 = new Participant("Vaisnavi");
        Participant par3 = new Participant("Pranaav");
        par.print();
        // par1.print();
        par2.print();
        par3.print();
        System.out.println(Participant.getNumParticipants());
        // System.out.println(Participant.numParticipants); 
        //the making of numParticipants private creates an error in this line
        
        // here the lines have been commented because "participantID" has been given the "final" keyword
    }
}
