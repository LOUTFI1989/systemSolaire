/**
 * Représente un corps céleste.
 */
public class Astre {
    private String nom;

    /**
     * Constructeur pour créer un corps céleste avec un nom.
     *
     * @param nom le nom du corps céleste
     */
    public Astre(String nom) {
        this.nom = nom;
    }

    /**
     * Obtient le nom du corps céleste.
     *
     * @return le nom du corps céleste
     */
    public String getNom() {
        return nom;
    }
}
