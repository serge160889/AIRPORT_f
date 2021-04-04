package academy.belhard.entity;

public class Pilot {
    private int id;
    private String firstName;
    private String lastName;
    private RangPilot pilotRank;
    private String codePilot;


    public Pilot(int id, String firstName, String lastName, RangPilot pilotRank, String codePilot) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pilotRank = pilotRank;
        this.codePilot = codePilot;
    }

    public int getId() { return id; }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public RangPilot getPilotRank() { return pilotRank; }

    public String getCodePilot() { return codePilot; }

    @Override
    public String toString() {
        return "Pilot{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pilotRank=" + pilotRank +
                ", codePilot='" + codePilot + '\'' +
                '}';
    }
}
