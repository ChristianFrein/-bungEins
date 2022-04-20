public class Studenten {
	private String name;
	
	public Studenten(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int choose(ArrayList<Termin> termine) {
		return (int) Math.random()*termine.size();
	}
}