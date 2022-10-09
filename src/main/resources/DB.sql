DROP TABLE IF EXISTS Personnes;
DROP TABLE IF EXISTS DelivreRoom;
DROP TABLE IF EXISTS Contrats;
DROP TABLE IF EXISTS Livreurs;
DROP TABLE IF EXISTS Colis;
DROP TABLE IF EXISTS LivreurSocietes;
DROP TABLE IF EXISTS LivreurPersonnes;
DROP TABLE IF EXISTS Societes;

CREATE TABLE Personnes(id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,nom VARCHAR(50),prenom VARCHAR(100),genre VARCHAR(20),typeIdentifiant VARCHAR(10),referenceIdentifiant VARCHAR(50),email VARCHAR(100),motDePasse VARCHAR(100));

CREATE TABLE DelivreRoom(id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,pays VARCHAR(50),indicatif INT,tel1 INT,tel2 INT,dateOuverture VARCHAR(30));




CREATE TABLE Societes(id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,pays VARCHAR(50),Ville VARCHAR(50),ifu VARCHAR(50),rccm VARCHAR(50),dateCreation VARCHAR(20),nomResponsable VARCHAR(30),prenomResponsable VARCHAR(100),typeIdentifiant VARCHAR(20),referencesIdentifiant VARCHAR(50),email VARCHAR(100),tel1 VARCHAR(20),tel2 VARCHAR(20));

CREATE TABLE Colis(id INT PRIMARY KEY NOT NULL,typeColis VARCHAR(20),prixEstimation VARCHAR(20));


CREATE TABLE Contrats(id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,idPersonne INT,idDelivreRoom int,dateSignature VARCHAR(10),dureeMois int,CONSTRAINT key_contrat_personne FOREIGN KEY (idPersonne) REFERENCES Personnes(id),CONSTRAINT key_contrat_delivreRoom FOREIGN KEY (idDelivreRoom) REFERENCES DelivreRoom(id) );



CREATE TABLE Livreur(id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,pays VARCHAR(50),ville VARCHAR(50),indicatif int, tel1 VARCHAR(20),tel2 VARCHAR(20));


CREATE TABLE LivreurSocietes(id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,idSociete int,idPersonne int,CONSTRAINT key_livreurSociete_societe FOREIGN KEY (idSociete) REFERENCES Societes(id),CONSTRAINT key_livreurSociete_personne FOREIGN KEY (idPersonne) REFERENCES Personnes(id));



CREATE TABLE LivreurPersonnes(id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,idPersonne int,CONSTRAINT key_livreurPersonne_personnes FOREIGN KEY (idPersonne) REFERENCES Personnes(id));
