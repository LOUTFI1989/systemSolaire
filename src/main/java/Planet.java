import java.util.ArrayList;
import java.util.List;

/**
 * Représente une planète, qui est un type de corps céleste pouvant avoir des satellites et pouvant être affiché.
 */
public class Planet extends Astre implements IOrbiteAutour, IAffichable, IAjouterSatellite {
    private List<Astre> satellites;

    public Planet(String nom) {
        super(nom);
        satellites = new ArrayList<>();
    }

    @Override
    public void ajouterSatellite(Astre astre) {
        satellites.add(astre);
    }

    @Override
    public void Afficher() {
        System.out.println("Planète: " + getNom());
        if (!satellites.isEmpty()) {
            System.out.println("Satellites:");
            for (Astre satellite : satellites) {
                System.out.println(" - " + satellite.getNom());
            }
        }
    }

    @Override
    public void Orbiter(Astre astre) {
        System.out.println(getNom() + " orbite autour de " + astre.getNom());
    }
}
