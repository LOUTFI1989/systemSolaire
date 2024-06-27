/**
 * Représente la Terre, qui est un type de planète.
 */
public class Terre extends Planet {
    public Terre() {
        super("Terre");
    }

    @Override
    public void Orbiter(Astre astre) {
        System.out.println(getNom() + " orbite autour de " + astre.getNom());
    }

    @Override
    public void Afficher() {
        System.out.println("Planète: " + getNom());
        super.Afficher();
    }
}
