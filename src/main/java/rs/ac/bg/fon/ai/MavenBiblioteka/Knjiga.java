package rs.ac.bg.fon.ai.MavenBiblioteka;

public class Knjiga {

	
	
	private String naslov;
	
	public Knjiga() {
		this.naslov= null;
	}
	
	public String getNaslov() {
		return this.naslov;
	}
	
	public void setNaslov(String naslov) {
		if(naslov==null)
			throw new NullPointerException("Naslov ne sme biti null");
		
		this.naslov = naslov;
	}
}
