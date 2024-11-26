CREATE DATABASE bdAmigos;
USE bdAmigos

CREATE TABLE `amigo` (
	`id_amigo` int(11) NOT NULL,
    `nome` VARCHAR(40) DEFAULT NULL,
    `apelido` VARCHAR(40) DEFAULT NULL,
    `telefone` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY(`id_amigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `amigo` (`id_amigo`, `nome`, `apelido`, `telefone`) VALUES
    (1, 'Anderson Augusto', 'And', '11988885275'),
    (2, 'Gabriel Lima', 'Lima', '11969256946'),
    (3, 'Gabriel Ortiz', 'Ortiz', '11987656789'),
    (4, 'Felipe Daniel', 'Felps', '11906453626'),
    (5, 'Joao Pedro', 'Joao', '11987456932');

    