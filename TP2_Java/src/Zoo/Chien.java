package Zoo;

public class Chien extends Animal{
	private String maitre;

	public Chien(int poids, String nom, String maitre) {
		super(poids, nom);
		this.maitre = maitre;
		// TODO Auto-generated constructor stub
	}

	public String getMaitre() {
		return maitre;
	}

	public void setMaitre(String maitre) {
		this.maitre = maitre;
	}

	@Override
	public String toString() {
		return "Chien [maitre=" + maitre + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chien other = (Chien) obj;
		if (maitre == null) {
			if (other.maitre != null)
				return false;
		} else if (!maitre.equals(other.maitre))
			return false;
		return true;
	}
	
	
	
}
