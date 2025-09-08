CREATE TABLE utilisateur (
    id INT AUTO_INCREMENT PRIMARY KEY,
    pseudo VARCHAR(100) NOT NULL UNIQUE,
    mot_de_passe VARCHAR(255) NOT NULL,
    Boolean estEligible
);

CREATE TABLE livre(
    id INT AUTO_INCREMENT PRIMARY KEY,
    titre VARCHAR(100) ,
    auteur VARCHAR(255) ,
    genre VARCHAR(100) ,
    annee INT,
    Boolean estDispo
);

CREATE TABLE emprunt (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_utilisateur INT NOT NULL,
    id_livre INT NOT NULL,
    date_emprunt DATE ,
    date_retour DATE,
    FOREIGN KEY (id_utilisateur) REFERENCES utilisateur(id),
    FOREIGN KEY (id_livre) REFERENCES livre(id)
    
);
INSERT INTO utilisateur(pseudo,mot_de_passe) VALUES("admin","1234");
INSERT INTO utilisateur(pseudo,mot_de_passe) VALUES("Nekena","1234");

INSERT INTO livre (titre, auteur, genre, annee, estDispo) VALUES
('L\'Étranger', 'Albert Camus', 'Roman', 1942, 1),
('Le Petit Prince', 'Antoine de Saint-Exupéry', 'Conte philosophique', 1943, 0),
('1984', 'George Orwell', 'Science-fiction', 1949, 1),
('Harry Potter à l\'école des sorciers', 'J.K. Rowling', 'Fantasy', 1997, 1),
('Une si longue lettre', 'Mariama Bâ', 'Roman', 1979, 0);