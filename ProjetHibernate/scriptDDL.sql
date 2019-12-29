-- table categorie
CREATE TABLE categorie (
	idCategorie VARCHAR2(20) CONSTRAINT categorie_idcategorie_PK PRIMARY KEY, 
	nom  VARCHAR2(30) NOT NULL UNIQUE, 
	description VARCHAR2(250) NOT NULL UNIQUE
	);

-- table specialite
CREATE TABLE specialite (
	code VARCHAR2(20) CONSTRAINT specialite_code_PK PRIMARY KEY, 
	titre  VARCHAR2(50) NOT NULL UNIQUE, 
	description VARCHAR2(250) NOT NULL UNIQUE
	);

-- table medicament
CREATE TABLE medicament (
	idMed VARCHAR2(20) CONSTRAINT medicament_idMed_PK PRIMARY KEY, 
	nomMed  VARCHAR2(30) NOT NULL UNIQUE, 
	prix NUMBER(5,2) DEFAULT 0 NOT NULL CONSTRAINT medicament_prix_ck CHECK (prix >= 0),
	categorie VARCHAR2(20) CONSTRAINT medcategorie_idcategorie_FK REFERENCES categorie(idCategorie),
	CONSTRAINT medicament_nommedcateg_u UNIQUE(nomMed,categorie)
	);

-- table ordonnance
CREATE TABLE ordonnance (
	numOrd VARCHAR2(20) CONSTRAINT ordonnance_numOrd_PK PRIMARY KEY, 
	recommandations  VARCHAR2(250) DEFAULT 'AUCUNE' NOT NULL, 
	typeO VARCHAR2(12) NOT NULL CONSTRAINT ordonnance_typeO_ck CHECK (UPPER(typeO) IN ('CHIRURGIE','MÉDICAMENTS')),
	dateC DATE DEFAULT sysdate NOT NULL
	);
	
--table docteur
CREATE TABLE docteur
  (
    matricule VARCHAR2(6) CONSTRAINT docteur_matricule_PK PRIMARY KEY,
    nomm VARCHAR2(20) NOT NULL,
    prenomm VARCHAR2(20) NOT NULL,
    specialite VARCHAR2(20) CONSTRAINT docspecialite_specialite_FK REFERENCES specialite(code),
    ville VARCHAR2(30) NOT NULL,
    adresse VARCHAR2(30) NOT NULL,
    niveau VARCHAR2(9) NOT NULL CONSTRAINT docteur_niveau_CK CHECK (UPPER(niveau) IN ('ÉTUDIANT', 'INTERNE', 'DOCTEUR')),
    nbrPatients number(6) DEFAULT 0 NOT NULL CONSTRAINT docteur_nbrPatients_ck CHECK (nbrPatients >= 0)
  );

--table dossierpatient
CREATE TABLE dossierpatient
  (
    numDos VARCHAR2(10) CONSTRAINT dossierpatient_numdos_PK PRIMARY KEY,
    nomP VARCHAR2(20) NOT NULL,
	prenomP VARCHAR2(20) NOT NULL,
	genre VARCHAR2(1) NOT NULL CONSTRAINT dossierpatient_genre_CK CHECK (UPPER(genre) IN ('F', 'M')),
	numAS VARCHAR2(10) NOT NULL UNIQUE,
	dateNaiss DATE NOT NULL,
	dateC DATE NOT NULL,
	matricule VARCHAR2(6) CONSTRAINT dossierpatientdoc_matricule_FK REFERENCES docteur(matricule),
	CONSTRAINT dossierpatient_datec_CK CHECK (dateC >= dateNaiss)
  );
  
--table consultation
CREATE TABLE consultation
  (
    codeDocteur VARCHAR2(6) CONSTRAINT consult_docteur_codeDoc_FK REFERENCES docteur(matricule) ,
	numDos VARCHAR2(10) CONSTRAINT consult_dospatient_numDos_FK REFERENCES dossierpatient(numDos) ,
	numOrd VARCHAR2(20) UNIQUE CONSTRAINT consult_ordonnance_numOrd_FK REFERENCES ordonnance(numOrd),
	dateC DATE DEFAULT sysdate,
	diagnostic VARCHAR2(50) NOT NULL,
	CONSTRAINT consult_codedocnumdos_datec_pk PRIMARY KEY (codeDocteur,numDos,dateC)
  );
  
--table ordonnancechirurgie
CREATE TABLE ordonnancechirurgie
  (
    numOrd VARCHAR2(20) CONSTRAINT ordonchir_ordonnance_numOrd_FK REFERENCES ordonnance(numOrd),
	rang number(3) DEFAULT 1 CONSTRAINT ordonchir_rang_ck CHECK (rang > 0),
	nomChirurgie VARCHAR2(30) NOT NULL,
	CONSTRAINT ordonchir_numordrang_pk PRIMARY KEY (numOrd, rang)
  );
 
--table ordonnancemedicaments
CREATE TABLE ordonnancemedicaments
  (
    numOrd VARCHAR2(20) CONSTRAINT ordonmed_ordonnance_numOrd_FK REFERENCES ordonnance(numOrd),
	idMed VARCHAR2(20) CONSTRAINT ordonmedic_idMed_FK REFERENCES medicament(idMed),
	nbBoites NUMBER(2) DEFAULT 0 NOT NULL CONSTRAINT ordonmedic_nbBoites_ck CHECK (nbBoites >= 0),
	CONSTRAINT ordonmedic_numOrd_idMed_pk PRIMARY KEY (numOrd,idMed)
  );
