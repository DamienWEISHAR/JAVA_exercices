package entite;

public class Telephone {
    private String marque;
    private String modele;
    
    public Telephone(String ma, String mo) {
        this.setMarque(ma);
        this.setModele(mo);
    }
    
    //METHODES
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Marque: " +this.marque + " || Modele: " +this.modele;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }
}