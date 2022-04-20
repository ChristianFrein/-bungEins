public class Termin {
    private String datum;
    private String uhrzeit;
    private ArrayList<Gruppe> gruppen;

    public Termin(String datum, String uhrzeit) {
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        gruppen = new ArrayList<Gruppe>();
    }
    
    public void generiereGruppen(int anzahl, int maxAnzahl) {
    	for(int i = 0; i < anzahl; i++) {
    		gruppen.add(new Gruppe(maxAnzahl));
    	}
    }
}