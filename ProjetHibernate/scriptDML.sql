-- categorie

insert into categorie values ('1','Très haute importance','Ces antimicrobiens sont de très haute importance en médecine humaine parce qu''ils répondent au critère voulant qu''ils soient essentiels dans le traitement de bactérioses graves');
insert into categorie values ('2','Haute importance','Cette catégorie comprend les antimicrobiens qui peuvent être utilisés pour traiter plusieurs types d''infections (infections graves incluses)');
insert into categorie values ('3','Importance moyenne','Les antimicrobiens de cette catégorie sont utilisés pour le traitement de bactérioses pour lesquelles des médicaments de remplacement sont généralement disponibles');
insert into categorie values ('4','Faible importance','A l''heure actuelle les antimicrobiens de cette catégorie ne sont pas utilisés en médecine humaine');

-- specialite 
insert into specialite values ('1','Anatomopathologie','L''anatomopathologie est la branche de la médecine de laboratoire qui s''intéresse à l''étude des aspects morphologiques des maladies');
insert into specialite values ('2','Anesthésiologie','L''anesthésiologie est une spécialité médicale qui comprend l''évaluation du patient et la prestation de services d''assistance cardio-respiratoire');
insert into specialite values ('3','Biochimie médicale','La biochimie médicale est la branche de la médecine qui s''intéresse à l''étude et à la mesure des anomalies biochimiques dans les maladies chez l''humain');
insert into specialite values ('4','Cardiologie','La cardiologie est une spécialité médicale portant sur la prévention le diagnostic la prise en charge et la réadaptation de patients présentant des maladies du système cardiovasculaire');
insert into specialite values ('5','Chirurgie cardiaque','La chirurgie cardiaque est la spécialité de la chirurgie qui s''intéresse aux maladies du péricarde, du cœur et des gros vaisseaux');
insert into specialite values ('6','Chirurgie colorectale','La chirurgie colorectale est une surspécialité chirurgicale qui s''intéresse au dépistage, au diagnostic et aux traitements des pathologies du colon, du rectum et de l''anus chez l''adulte');
insert into specialite values ('7','Chirurgie générale','La chirurgie générale englobe les principes et les techniques chirurgicales sûres et efficaces qui s''appliquent à n''importe quelle partie du corps d''un opéré quel que soit son âge');
insert into specialite values ('8','Chirurgie générale oncologie','La chirurgie générale oncologique est la branche de la chirurgie portant sur l''étude du diagnostic et du traitement du cancer');
insert into specialite values ('9','ChirurgieGénérale pédiatrie','La chirurgie générale pédiatrique est un domaine de la médecine qui se penche sur une vaste gamme de maladies et de malformations, opératoires et non opératoires');
insert into specialite values ('10','Chirurgie orthopédique','Les racines grecques du mot « orthopédie » réunissent deux mots, « ortho » qui signifie « droit » et « paidos » qui signifie « enfant »');

-- table medicament
insert into medicament values( '1','Carbapénèmes',10,'1');
insert into medicament values( '2','Fluoroquinolones',20,'1');
insert into medicament values( '3','Glycopeptides',30,'1');
insert into medicament values( '4','Acide fusidique',24,'2');
insert into medicament values( '5','Lincosamides',55,'2');
insert into medicament values( '6','Macrolides',87,'2');
insert into medicament values( '7','Aminocyclitols',52,'3');
insert into medicament values( '8','Bacitracines',17,'3');
insert into medicament values( '9','Fosfomycine',90,'3');
insert into medicament values( '10','Flavophospholipols',5,'4');
insert into medicament values( '11','Ionophores',21,'4');
insert into medicament values( '12','paracétamol',default,'4');

-- table ordonnance

insert into ordonnance values ( '1','une patiente de 56 ans, diabétique de type 2 depuis cinq ans est traitée par metformine 2 x 1000','MÉDICAMENTS',sysdate );
insert into ordonnance values ( '2','Vous avez traité la patiente avec du paracétamol. Elle revient et se plaint d’une persistance des douleurs et de troubles du sommeil. ','CHIRURGIE','2019-09-14' );
insert into ordonnance values ( '3','En clarifiant les troubles du sommeil de la patiente, vous diagnostiquez un état dépressif discret à modéré ','CHIRURGIE', '2019-06-04' );
insert into ordonnance values ( '4','Une prescription médicamenteuse de qualité requiert des compétences diagnostiques','MÉDICAMENTS', sysdate );
insert into ordonnance values ( '5','Votre pharmacien peut prolonger votre ordonnance au maximum pour la durée de validité de l’ordonnance que votre médecin vous avait prescrite,','MÉDICAMENTS', '2019-05-24' );
insert into ordonnance values ( '6','Votre pharmacien peut prolonger votre ordonnance au maximum pour la durée de validité de l’ordonnance que votre médecin vous avait prescrite,','CHIRURGIE', '2019-05-24' );
insert into ordonnance values ( '7','En clarifiant les troubles du sommeil de la patiente, vous diagnostiquez un état dépressif discret à modéré ','CHIRURGIE', '2019-06-04' );
insert into ordonnance values ( '8','Une prescription médicamenteuse de qualité requiert des compétences diagnostiques','MÉDICAMENTS', sysdate );
insert into ordonnance values ( '9','Votre pharmacien peut prolonger votre ordonnance au maximum pour la durée de validité de l’ordonnance que votre médecin vous avait prescrite,','MÉDICAMENTS', '2019-05-24' );
insert into ordonnance values ( '10','Votre pharmacien peut prolonger votre ordonnance au maximum pour la durée de validité de l’ordonnance que votre médecin vous avait prescrite,','CHIRURGIE', '2019-05-24' );

--table docteur

insert into docteur values( '1','Adgum','Adan','1','montreal','4215 rue darlington','ÉTUDIANT' , default);
insert into docteur values( '2','takfarinas','juba',null,'toronto','1265 rue ontario','INTERNE' , 5);
insert into docteur values( '3','zidane','zinedine','2','quebec','1643 rue hudson','DOCTEUR' , 0);
insert into docteur values( '4',' Boukoussa','Maurétanie',null,'laval','1804 rue bedford','DOCTEUR' , 3);
insert into docteur values( '5',' Juba','moris','7','vancouver','9850 rue plamondon','ÉTUDIANT' , 9);
insert into docteur values( '6',' Gauda',' Hiempsal','5','ottawa','8075 rue goyer','DOCTEUR' , 0);
insert into docteur values( '7','massinissa','Masnsen','4',' Numidie','4215 rue cirta','DOCTEUR' , 10);
insert into docteur values( '8','Hiempsal','Jugurtha','1','alger','4387 rue avinion','ÉTUDIANT' , 7);
insert into docteur values( '9','Mastanabal',' Adherbal','1','montreal','4215 rue darlington','INTERNE' , 12);
insert into docteur values( '10','Micipsa',' Gulussa ','1','calgary','4215 rue regina','ÉTUDIANT' , 3);


--table dossierpatient
insert into dossierpatient values( '1','Firmus',' maure','M','658654789','1980-02-16','2018-02-16','1');
insert into dossierpatient values( '2','Mascezel','Tin Hinan','F','123654789','1970-03-01','2018-02-16','2');
insert into dossierpatient values( '3','Aedemon','Gildon','M','123492789','1990-04-20','2018-02-16','3');
insert into dossierpatient values( '4','Tacfarinas','Apulée','F','123654780','1985-07-07','2018-02-16','4');
insert into dossierpatient values( '5','Florus','Fronton','M','126547889','1937-08-23','2018-02-16',null);
insert into dossierpatient values( '6','Ierna','Carcasan','F','123354789','1995-10-05','2018-02-16','5');
insert into dossierpatient values( '7','Tariq','ibn Ziyad','M','121491465','1966-11-19','2018-02-16','7');
insert into dossierpatient values( '8','Munuza','Abou Qurra','F','124957789','1945-05-30','2018-02-16','8');
insert into dossierpatient values( '9','Yala','Ibn Mohamed','M','123649259','2000-01-25','2018-02-16','9');
insert into dossierpatient values( '10','Hammad','ibn Bologhine','F','165744789','2005-02-27','2018-02-16','10');

--table consultation
insert into consultation values( '1','1','10','2019-02-27','Abcès de la glande de bartholin');
insert into consultation values( '2','2','1','2019-01-15','Absence de domicile fixe');
insert into consultation values( '3','3','2','2019-03-04','Accélération de la vitesse de sédimentation');
insert into consultation values( '4','4','3','2019-04-20','Accouchement normal - sans précision');
insert into consultation values( '5','1','4','2019-05-01','Achalasie et cardiospasme');
insert into consultation values( '9','6','5','2019-06-09','Acte chirurgical ou autre non réalisé ');
insert into consultation values( '6','5',null,'2018-09-10','Actes médicaux non réalisés ');
insert into consultation values( '1','4','7','2019-08-08','Adénopathie due à syphilis secondaire');
insert into consultation values( '2','8','6','2019-07-06','Adhérences de l''iris et du corps ciliaire');
insert into consultation values( '8','9',null,'2019-11-21','Affection due à aberration chromosomique ');

--table ordonnancechirurgie
insert into ordonnancechirurgie values ( '2', 1,' chirurgie vasculaire' );
insert into ordonnancechirurgie values ( '3', 1,' chirurgie digestive' );
insert into ordonnancechirurgie values ( '6', 1,' chirurgie infantile ' );
insert into ordonnancechirurgie values ( '7', 1,' chirurgie plastique' );
insert into ordonnancechirurgie values ( '10', 1,' chirurgie maxillo' );

--table ordonnancemedicaments

insert into ordonnancemedicaments values ( '1', '1' , 4) ;
insert into ordonnancemedicaments values ( '1', '2' , 2) ;
insert into ordonnancemedicaments values ( '1', '3' , 0) ;
insert into ordonnancemedicaments values ( '2', '5' , 3) ;
insert into ordonnancemedicaments values ( '3', '7' , 1) ;
insert into ordonnancemedicaments values ( '4', '6' , 5) ;
insert into ordonnancemedicaments values ( '5', '10', 7) ;
insert into ordonnancemedicaments values ( '6', '1' , 2) ;
insert into ordonnancemedicaments values ( '6', '9' , 5) ;
insert into ordonnancemedicaments values ( '6', '8' , 2) ;

