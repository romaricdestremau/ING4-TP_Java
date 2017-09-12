package Zoo;

public class Utilisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// définir une instance de Chien
		Chien chien1 = new Chien(10, "rex", "Sasha");
		
		// afficher le nom du chien, son poids et le nom de maître
		System.out.println("Le nom du chien est " + chien1.getNom());
		System.out.println("Le poids du chien est de " + chien1.getPoids() + " kg");
		System.out.println("Le maitre du chien est " + chien1.getMaitre());
		
		// définir une instance d’Animal
		// définir deux autres instances de Chien
		// définir un tableau contenant les 4 instances ci-dessus
		// Faire afficher les noms des 4 animaux dans une boucle 
	}

}
