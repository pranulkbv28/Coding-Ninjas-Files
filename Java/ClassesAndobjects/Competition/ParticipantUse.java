package ClassesAndobjects.Competition;

public class ParticipantUse {
    public static void main(String[] args) {
        Participant par = new Participant();
        // Participant par1 = new Participant("Pranaav");
        Participant par2 = new Participant("Vaisnavi", 1);
        Participant par3 = new Participant("Test", -20);
        par.print();
        // par1.print();
        par2.print();
        par3.print();
        
        // here the lines have been commented because "participantID" has been given the "final" keyword
    }
}
