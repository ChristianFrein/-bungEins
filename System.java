public class System {
	private ArrayList<Termin> termine = new ArrayList<Termin>();
	private ArrayList<Studenten> studenten = new ArrayList<Studenten>();
	private int maxTeilnehmerZahl = 6;

    public static void main(String[] args) {
    	
    }
    
    public void generiereTermine() {
    	termine.add("21.04.22","10:30");
    	termine.get(0).generiereGruppen(4,maxTeilnehmerZahl);
    	termine.get(0).gruppen.get(0).setTutor(new Tutor("Herr Schwarz"));
    	termine.get(0).gruppen.get(1).setTutor(new Tutor("Herr Weiß"));
    	termine.get(0).gruppen.get(2).setTutor(new Tutor("Herr Gelb"));
    	termine.get(0).gruppen.get(3).setTutor(new Tutor("Herr Braun"));
    	termine.add("21.04.22","11:30");
    	termine.get(1).generiereGruppen(4,maxTeilnehmerZahl);
    	termine.get(1).gruppen.get(0).setTutor(new Tutor("Herr Berlin Code of Conduct"));
    	termine.get(1).gruppen.get(1).setTutor(new Tutor("Herr Nadja Valentin"));
    	termine.get(1).gruppen.get(2).setTutor(new Tutor("Herr Göbbels"));
    	termine.get(1).gruppen.get(3).setTutor(new Tutor("Herr Rot"));
    	termine.add("21.04.22","12:30");
    	termine.get(2).generiereGruppen(3,maxTeilnehmerZahl);
    	termine.get(2).gruppen.get(0).setTutor(new Tutor("Herr Schwup"));
    	termine.get(2).gruppen.get(1).setTutor(new Tutor("Herr Wup"));
    	termine.get(2).gruppen.get(2).setTutor(new Tutor("Herr Dup"));
    }
    
    public void generiereStudenten() {
    	for(int i = 0; i < Math.random()*60) {
    		studenten.add(new Studenten(null));
    	}
    }
    
    public void waehleTermine() {
    	
    }
}