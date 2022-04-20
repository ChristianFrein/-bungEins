import java.util.ArrayList;

public class Gruppe {
	
	private int maxAnzahl;
	private Tutor tutor;
	private ArrayList<Studenten> studenten = new ArrayList<Studenten>();
	private Termin termin;
	
	public Gruppe(int maxAnzahl, Tutor tutor) {
		this.maxAnzahl = maxAnzahl;
		this.tutor = tutor;
	}
	
	public Gruppe(int maxAnzahl) {
		this.maxAnzahl = maxAnzahl;
	}
	
	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}
}