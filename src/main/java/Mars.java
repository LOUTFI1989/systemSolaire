/**
 * Représente Mars, qui est un type de planète.
 */
public class Mars extends Planet {
    public Mars() {
        super("Mars");
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
