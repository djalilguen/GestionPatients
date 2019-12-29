/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import org.hibernate.Session;
import controle.HibernateUtil;
import dao.Categorie;
import dao.Consultation;
import dao.Docteur;
import dao.Dossierpatient;
import dao.Medicament;
import dao.Ordonnance;
import dao.Ordonnancechirurgie;
import dao.Ordonnancemedicaments;
import dao.Specialite;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.dialect.Oracle9Dialect;

/**
 *
 * @author 1995156
 */
public class Utilitaire {

    static Session session = null;

    //Insertion, modification et suppression pour la table Catégorie
    public static void insertCategorie(Categorie cat) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();
        session.save(cat);
        tx.commit();
        Connect.finishTransaction();
    }

    public static void updateNomCategorie(Categorie cat, String nom) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();
        cat.setNom(nom);
        session.update(cat);
        tx.commit();
        Connect.finishTransaction();
    }

    public static void deleteCategorie(Categorie cat) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();

        session.delete(cat);

        tx.commit();
        Connect.finishTransaction();
    }

    //Insertion, modification et suppression pour la table Spécialité
    public static void insertSpecialite(Specialite spec) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();
        session.save(spec);
        tx.commit();
        Connect.finishTransaction();
    }

    public static void updateTitreSpecialite(Specialite spec, String titre) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();
        spec.setTitre(titre);
        session.update(spec);
        tx.commit();
        Connect.finishTransaction();
    }

    public static void deleteSpecialite(Specialite spec) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();

        session.delete(spec);

        tx.commit();
        Connect.finishTransaction();
    }

    //Insertion, modification et suppression pour la table Médicament
    public static void insertMedicament(Medicament med) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();
        session.save(med);
        tx.commit();
        Connect.finishTransaction();
    }

    public static void updateNomMedicament(Medicament med, String nom) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();
        med.setNommed(nom);
        session.update(med);
        tx.commit();
        Connect.finishTransaction();
    }

    public static void deleteMedicament(Medicament med) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();

        session.delete(med);

        tx.commit();
        Connect.finishTransaction();
    }

    //Insertion, modification et suppression pour la table Ordonnance
    public static void insertOrdonnance(Ordonnance ord) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();
        session.save(ord);
        tx.commit();
        Connect.finishTransaction();
    }

    public static void updateRecommendationOrdonnance(Ordonnance ord,
            String rec) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();
        ord.setRecommandations(rec);
        session.update(ord);
        tx.commit();
        Connect.finishTransaction();
    }

    public static void deleteOrdonnance(Ordonnance ord) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();

        session.delete(ord);

        tx.commit();
        Connect.finishTransaction();
    }

    //Insertion, modification et suppression pour la table Docteur
    public static void insertDoctor(Docteur doc) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();
        session.save(doc);
        tx.commit();
        Connect.finishTransaction();
    }

    public static void updateAdresseDoctor(Docteur doc, String adresse) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();
        doc.setAdresse(adresse);
        session.update(doc);
        tx.commit();
        Connect.finishTransaction();
    }

    public static void deleteDoctor(Docteur doc) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();

        session.delete(doc);

        tx.commit();
        Connect.finishTransaction();
    }

    //Insertion, modification et suppression pour la table Consultation
    public static void insertConsultation(Consultation consult) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();
        session.save(consult);
        tx.commit();
        Connect.finishTransaction();
    }

    public static void updateDiagnosticConsultation(Consultation consult,
            String diagnostic) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();
        consult.setDiagnostic(diagnostic);
        session.update(consult);
        tx.commit();
        Connect.finishTransaction();
    }

    public static void deleteConsultation(Consultation consult) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();

        session.delete(consult);

        tx.commit();
        Connect.finishTransaction();
    }

    //Insertion, modification et suppression pour la table Ordonnancemedicaments
    public static void insertOrdonnanceMedicaments(Ordonnancemedicaments om) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();
        session.save(om);
        tx.commit();
        Connect.finishTransaction();
    }

    public static void updateDiagnosticOrdonnanceMedicaments(
            Ordonnancemedicaments om, Byte nbBoites) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();
        om.setNbboites(nbBoites);
        session.update(om);
        tx.commit();
        Connect.finishTransaction();
    }

    public static void deleteOrdonnanceMedicaments(Ordonnancemedicaments om) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();

        session.delete(om);

        tx.commit();
        Connect.finishTransaction();
    }

    //Insertion, modification et suppression pour la table Ordonnancechirurgie
    public static void insertOrdonnanceChirurgie(Ordonnancechirurgie oc) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();
        session.save(oc);
        tx.commit();
        Connect.finishTransaction();
    }

    public static void updateTitreOrdonnanceChirurgie(Ordonnancechirurgie oc,
            String titre) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();
        oc.setNomchirurgie(titre);
        session.update(oc);
        tx.commit();
        Connect.finishTransaction();
    }

    public static void deleteOrdonnanceChirurgie(Ordonnancechirurgie oc) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();

        session.delete(oc);

        tx.commit();
        Connect.finishTransaction();
    }

    //Insertion, modification et suppression pour la table Dossierpatient
    public static void insertDossierpatient(Dossierpatient patient) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();
        session.save(patient);
        tx.commit();
        Connect.finishTransaction();
    }

    public static void updateGenreDossierpatient(Dossierpatient patient,
            String genre) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();
        patient.setGenre(genre);
        session.update(patient);
        tx.commit();
        Connect.finishTransaction();
    }

    public static void deleteDossierpatient(Dossierpatient patient) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);

        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();

        session.delete(patient);

        tx.commit();
        Connect.finishTransaction();
    }

    //Question1 : méthode pour afficher le nombre de chirurgies par Docteur 
    //ayant des consultations.
    public static void showNbChirurgiesDoctor() {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();
        
        // version 1

//        Query query = session.createQuery("SELECT d.matricule,d.prenomm,d.nomm, "
//                + "SUM(CASE "
//                + "WHEN c.ordonnance.typeo = 'CHIRURGIE' THEN 1 "
//                + "ELSE 0 END) AS somme FROM Docteur d LEFT JOIN "
//                + "d.consultations c"
//                + " GROUP BY d.matricule,d.prenomm,d.nomm ");

// version 2
        
        Query query = session.createQuery("SELECT d.matricule,d.prenomm,d.nomm, "
                + "(select count (*) FROM d.consultations c inner join c.ordonnance.ordonnancechirurgies  ) "
                + "from Docteur d ");

        List<Object[]> results = query.list();

        for (Object[] line : results) {
            System.out.print("Le nombre de chirurgies pour le Docteur : "
                    + line[2] + " " + line[1] + " est  : " + line[3]);
            System.out.println();
            System.out.println("----------------------------------------------"
                    + "--------------------------------");
        }
        tx.commit();
        Connect.finishTransaction();
    }

    //Question2 : méthode pour afficher le nombre de consultations par Docteur
    //ayant fait des consultations.
    public static void showNbConsultationsDoctor() {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();

        // version 1 de la requette
//        Query query = session.createQuery("SELECT d.matricule,d.prenomm,d.nomm,"
//                + "NVL(COUNT(*),0) FROM Consultation c LEFT JOIN c.docteur d  "
//                + "GROUP BY d.matricule,d.prenomm,d.nomm ");
//        SELECT tc.description, count(cl.type)

// version 2 de la requette
        Query query = session.createQuery("SELECT d.matricule,d.prenomm,d.nomm,"
                + " (select count (*) FROM d.consultations) FROM Docteur d");

        List<Object[]> results = query.list();

        for (Object[] line : results) {
            System.out.print("Le nombre de consultations pour le Docteur : "
                    + line[2] + " " + line[1] + " est  : " + line[3]);
            System.out.println();
            System.out.println("----------------------------------------------"
                    + "--------------------------------");
        }
        tx.commit();
        Connect.finishTransaction();
    }

    //Question3 : méthode pour afficher le nombre de consultations par 
    //année.
    public static void showNbConsultationsYear() {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        session = Connect.startTransaction();
        Transaction tx = session.beginTransaction();

        Query query = session.createQuery("SELECT TO_CHAR(c.id.datec,'yyyy') , "
                + "COUNT(*) FROM Consultation c "
                + "GROUP BY TO_char(c.id.datec,'yyyy') "
                + "ORDER BY TO_CHAR(c.id.datec,'yyyy') "
        );

        List<Object[]> results = query.list();

        for (Object[] line : results) {
            System.out.println("Le nombre de consultations pour l'année "
                    + line[0] + " est : " + line[1]);
            System.out.println("----------------------------------------------"
                    + "--------------------------------");
        }
        tx.commit();
        Connect.finishTransaction();
    }
}
