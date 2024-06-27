import java.util.ArrayList;
import java.util.List;

/**
 * Représente le soleil, qui est un type de corps céleste pouvant avoir des satellites et pouvant être affiché.
 */
public class Soleil extends Astre implements IAjouterSatellite, IAffichable {
    private static Soleil instance;
    private List<Astre> satellites;

    private Soleil() {
        super("Soleil");
        satellites = new ArrayList<>();
    }

    /**
     * Obtient l'unique instance de la classe Soleil.
     *
     * @return l'instance de Soleil
     */
    public static Soleil getInstance() {
        if (instance == null) {
            instance = new Soleil();
        }
        return instance;
    }

    @Override
    public void ajouterSatellite(Astre astre) {
        satellites.add(astre);
    }

    @Override
    public void Afficher() {
        System.out.println("Soleil: " + getNom());
        if (!satellites.isEmpty()) {
            System.out.println("Satellites:");
            for (Astre satellite : satellites) {
                System.out.println(" - " + satellite.getNom());
            }
        }
    }
}
