package dao;
// Generated 2019-10-09 13:52:18 by Hibernate Tools 4.3.1



/**
 * Ordonnancemedicaments generated by hbm2java
 */
public class Ordonnancemedicaments  implements java.io.Serializable {


     private OrdonnancemedicamentsId id;
     private Medicament medicament;
     private Ordonnance ordonnance;
     private byte nbboites;

    public Ordonnancemedicaments() {
    }

    public Ordonnancemedicaments(OrdonnancemedicamentsId id, Medicament medicament, Ordonnance ordonnance, byte nbboites) {
       this.id = id;
       this.medicament = medicament;
       this.ordonnance = ordonnance;
       this.nbboites = nbboites;
    }
   
    public OrdonnancemedicamentsId getId() {
        return this.id;
    }
    
    public void setId(OrdonnancemedicamentsId id) {
        this.id = id;
    }
    public Medicament getMedicament() {
        return this.medicament;
    }
    
    public void setMedicament(Medicament medicament) {
        this.medicament = medicament;
    }
    public Ordonnance getOrdonnance() {
        return this.ordonnance;
    }
    
    public void setOrdonnance(Ordonnance ordonnance) {
        this.ordonnance = ordonnance;
    }
    public byte getNbboites() {
        return this.nbboites;
    }
    
    public void setNbboites(byte nbboites) {
        this.nbboites = nbboites;
    }




}


