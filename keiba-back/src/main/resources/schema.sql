DROP TABLE IF EXISTS GI_winner;

CREATE TABLE GI_winner (
    year INT NOT NULL,
    race VARCHAR(255) NOT NULL,
    winner VARCHAR(255),
    PRIMARY KEY(year,race)

);
DROP TABLE IF EXISTS sire_line;

CREATE TABLE sire_line (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL ,
    sire_id INT,
    country VARCHAR(10),
    active BOOLEAN NOT NULL DEFAULT TRUE,
    FOREIGN KEY (sire_id) REFERENCES sire_line(id)
);