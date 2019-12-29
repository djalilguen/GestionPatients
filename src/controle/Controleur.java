/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.Categorie;
import dao.Consultation;
import dao.ConsultationId;
import dao.Docteur;
import dao.Dossierpatient;
import dao.Medicament;
import dao.Ordonnance;
import dao.Ordonnancechirurgie;
import dao.OrdonnancechirurgieId;
import dao.Ordonnancemedicaments;
import dao.OrdonnancemedicamentsId;
import dao.Specialite;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.Utilitaire;

/**
 *
 * @author 1995089
 */
public class Controleur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Categorie categorie = new Categorie("5","Forte importance","l''heure actuelle les antimicrobiens de cette catégorie ne sont pas utilisés en médecine humaine");
        Specialite spec = new Specialite("11","1Chirurgie orthopédique","1Les racines grecques du mot « orthopédie » réunissent deux mots, « ortho » qui signifie « droit » et « paidos » qui signifie « enfant »");
        Medicament med=new Medicament( "30",categorie,"sssss",new BigDecimal(10),null);
        Ordonnance ord =null;
        
        try {
            ord = new Ordonnance("10", "sss", "MÉDICAMENTS", new SimpleDateFormat("yyyy-mm-dd").parse("2019-05-25"));
        } catch (ParseException ex) {
            Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        Ordonnancemedicaments ordMedi = new Ordonnancemedicaments(new OrdonnancemedicamentsId("10", "30"), med,ord,(byte)2);
        
        Ordonnancechirurgie ordMediordChir= new Ordonnancechirurgie(new OrdonnancechirurgieId("10", (short)1),ord, "dddddddd");
        
        Docteur doc = new Docteur("12", "nom docteur", "prenom docteur", "ville docteur", "adresse docteur", "interne", 0);
        
        Dossierpatient patient=null;
        try {
            patient = new Dossierpatient("55","nom patient","prenom patient", "F", "ffffffff", new SimpleDateFormat("yyyy-mm-dd").parse("2000-05-25"),  new SimpleDateFormat("yyyy-mm-dd").parse("2000-05-25"));
        } catch (ParseException ex) {
            Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Consultation consult=null;
        try {
            consult = new Consultation(new ConsultationId("12", "55", new SimpleDateFormat("yyyy-mm-dd").parse("2019-05-25")), doc, patient, "gg");
        } catch (ParseException ex) {
            Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
        }

// ----------------------- insertion -------------------------------      
         // insertion categorie
//          Utilitaire.insertCategorie(categorie);
      
        //insertion specialité        
        //Utilitaire.insertSpecialite(spec);

        //insertion medicament
//        Utilitaire.insertMedicament(med);

        //insertion ordonnance
//          Utilitaire.insertOrdonnance(ord);

        // insertion Ordonnance Mmedicaments  
//            Utilitaire.insertOrdonnanceMedicaments(ordMedi);
         
         // insertion Ordonnance chirurgie
//            Utilitaire.insertOrdonnanceChirurgie(ordMediordChir);

            
         // insertion Docteur
//            Utilitaire.insertDoctor(doc);
            
         // insertion Dossier patient
//            Utilitaire.insertDossierpatient(patient);
                    
         // insertion consultation
//            Utilitaire.insertConsultation(consult);


 //-----------------------------------  Les suppressions --------------    
 
         // supprimer Ordonnance Mmedicaments  
//           Utilitaire.deleteOrdonnanceMedicaments(ordMedi);
         
         // supprimer Ordonnance chirurgie
//         Utilitaire.deleteOrdonnanceChirurgie(ordMediordChir);      
        //supprimer ordonnance
//          Utilitaire.deleteOrdonnance(ord);                    
         // supprimer consultation
//            Utilitaire.deleteConsultation(consult);   
        // supprimer Dossier patient
//           Utilitaire.deleteDossierpatient(patient);
       // insertion Docteur
//            Utilitaire.deleteDoctor(doc);
       //supprimer medicament
//        Utilitaire.deleteMedicament(med);

        // supprimer categorie
//          Utilitaire.deleteCategorie(categorie);
      
        //supprimer specialité        
//        Utilitaire.deleteSpecialite(spec);
               
        Utilitaire.showNbConsultationsDoctor();
        //Utilitaire.showNbConsultationsYear();
//        Utilitaire.showNbChirurgiesDoctor(); 
        
    }

}
