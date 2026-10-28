-- 1. Services
INSERT INTO services (nom) VALUES ('Informatique'), ('Ressources Humaines');

-- 2. Table Mère (Equipement)
INSERT INTO equipements (nom, numero_serie, prix, service_id) VALUES 
('PC Portable Dev 01', 'SN-DEV-001', 1200.0, 1),
('Imprimante RH 01', 'SN-IMP-002', 450.0, 2);

-- 3. Tables Filles (InheritanceType.JOINED)
INSERT INTO ordinateurs (id, ram_go, processeur, type_pc) VALUES (1, 16, 'Intel i7', 'PORTABLE');
INSERT INTO imprimantes (id, est_couleur) VALUES (2, true);