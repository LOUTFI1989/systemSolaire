/**
 * La classe principale pour exécuter le programme.
 */
public class Main {
    /**
     * La méthode principale pour exécuter le programme.
     *
     * @param args les arguments de la ligne de commande
     */
    public static void main(String[] args) {
        Soleil soleil = Soleil.getInstance();

        Terre terre = new Terre();
        Mars mars = new Mars();

        soleil.ajouterSatellite(terre);
        soleil.ajouterSatellite(mars);

        terre.Orbiter(soleil);
        mars.Orbiter(soleil);

        soleil.Afficher();
        terre.Afficher();
        mars.Afficher();
    }
}
