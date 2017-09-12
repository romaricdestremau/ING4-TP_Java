package Zoo;

public class Animal {
	private int poids;
	private String nom;
	
	
	// constructeurs par défaut, à 2 paramètres
	public Animal(int poids, String nom) {
		super();
		this.poids = poids;
		this.nom = nom;
	}
	
	// les 2 accesseurs en lecture et écriture pour tous les attributs
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	
	
	// les méthodes toString, equals
	@Override
	public String toString() {
		return "Animal [poids=" + poids + ", nom=" + nom + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (poids != other.poids)
			return false;
		return true;
	}
	
}
