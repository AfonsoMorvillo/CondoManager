-- MySQL Script generated by MySQL Workbench
-- Sat Nov 25 15:04:59 2023
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema condoManager
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema condoManager
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `condoManager` DEFAULT CHARACTER SET utf8 ;
USE `condoManager` ;

-- -----------------------------------------------------
-- Table `condoManager`.`Proprietario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `condoManager`.`Proprietario` (
  `idProprietario` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(50) NULL,
  `email` VARCHAR(50) NULL,
  `telefone` VARCHAR(15) NULL,
  `dataNascimento` DATE NULL,
  `dataAquisicao` DATE NULL,
  `cpf` VARCHAR(11) NULL,
  `rg` VARCHAR(12) NULL,
  PRIMARY KEY (`idProprietario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `condoManager`.`Casa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `condoManager`.`Casa` (
  `numero` INT NOT NULL,
  `bloco` VARCHAR(45) NULL,
  `dataRegistro` DATE NULL,
  `vagas` INT NULL,
  `idProprietario` INT NOT NULL,
  PRIMARY KEY (`numero`),
  INDEX `fk_Casa_Proprietario1_idx` (`idProprietario` ASC) VISIBLE,
  CONSTRAINT `fk_Casa_Proprietario1`
    FOREIGN KEY (`idProprietario`)
    REFERENCES `condoManager`.`Proprietario` (`idProprietario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `condoManager`.`Morador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `condoManager`.`Morador` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(50) NULL,
  `dataNascimento` DATE NULL,
  `rg` VARCHAR(12) NULL,
  `cpf` VARCHAR(15) NULL,
  `imagem` LONGBLOB NULL,
  `email` VARCHAR(45) NULL,
  `celular` VARCHAR(45) NULL,
  `telefone` VARCHAR(45) NULL,
  `inicioMoradia` VARCHAR(45) NULL,
  `casa` INT NOT NULL,
  PRIMARY KEY (`codigo`, `casa`),
  INDEX `fk_Morador_casa1_idx` (`casa` ASC) VISIBLE,
  CONSTRAINT `fk_Morador_casa1`
    FOREIGN KEY (`casa`)
    REFERENCES `condoManager`.`Casa` (`numero`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `condoManager`.`Veículos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `condoManager`.`Veículos` (
  `placaCarro` VARCHAR(40) NOT NULL,
  `modelo` VARCHAR(45) NULL,
  `marca` VARCHAR(45) NULL,
  `tipo` VARCHAR(45) NULL,
  `cor` VARCHAR(45) NULL,
  `ano` YEAR(4) NULL,
  `casa` INT NOT NULL,
  PRIMARY KEY (`placaCarro`),
  INDEX `fk_Veículos_casa1_idx` (`casa` ASC) VISIBLE,
  CONSTRAINT `fk_Veículos_casa1`
    FOREIGN KEY (`casa`)
    REFERENCES `condoManager`.`Casa` (`numero`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `condoManager`.`Visitantes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `condoManager`.`Visitantes` (
  `idVisitante` INT NOT NULL AUTO_INCREMENT,
  `rg` VARCHAR(45) NULL,
  `nome` VARCHAR(45) NULL,
  `idade` INT NULL,
  `celular` VARCHAR(45) NULL,
  PRIMARY KEY (`idVisitante`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `condoManager`.`Entregas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `condoManager`.`Entregas` (
  `idEntrega` INT NOT NULL AUTO_INCREMENT,
  `nomeEntregador` VARCHAR(45) NULL,
  `entrega` DATE NULL,
  `horario_entrega` TIME NULL,
  `retirada` DATE NULL,
  `horario_retirada` TIME NULL,
  `status` VARCHAR(45) NULL DEFAULT 'ENTREGUE',
  `observacao` TEXT NULL,
  `casa` INT NOT NULL,
  PRIMARY KEY (`idEntrega`, `casa`),
  INDEX `fk_Entregas_casa1_idx` (`casa` ASC) VISIBLE,
  CONSTRAINT `fk_Entregas_casa1`
    FOREIGN KEY (`casa`)
    REFERENCES `condoManager`.`Casa` (`numero`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `condoManager`.`Acesso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `condoManager`.`Acesso` (
  `idAcesso` INT NOT NULL AUTO_INCREMENT,
  `entrada` DATE NULL,
  `saida` DATE NULL,
  `casa` INT NOT NULL,
  `visitante` INT NOT NULL,
  `horario_entrada` TIME NULL,
  `horario_saida` TIME NULL,
  PRIMARY KEY (`idAcesso`),
  INDEX `fk_Controle de Acesso_Casa1_idx` (`casa` ASC) VISIBLE,
  INDEX `fk_Controle de Acesso_Visitantes1_idx` (`visitante` ASC) VISIBLE,
  CONSTRAINT `fk_Controle de Acesso_Casa1`
    FOREIGN KEY (`casa`)
    REFERENCES `condoManager`.`Casa` (`numero`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Controle de Acesso_Visitantes1`
    FOREIGN KEY (`visitante`)
    REFERENCES `condoManager`.`Visitantes` (`idVisitante`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `condoManager`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `condoManager`.`usuario` (
  `idUsuario` INT NOT NULL,
  `username` VARCHAR(50) NOT NULL,
  `senha` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;



insert into usuario (idUsuario,username,senha) values (1,'adm','3196a10252286b4d5976476f1909102ec33048a3e6f14a69b540cee8e1ca97dc'); 





INSERT INTO `condoManager`.`Proprietario`
(
`nome`,
`email`,
`telefone`,
`dataNascimento`,
`dataAquisicao`,
`cpf`,
`rg`)
VALUES
('Vitor','vitorhugo@emai.com','16 99321-21354','2004-01-10','2022-10-10','1472853692','656512135');

INSERT INTO `condoManager`.`Casa`
(`numero`,
`bloco`,
`dataRegistro`,
`vagas`,
`idProprietario`)
VALUES
(44,
'Bloco A-3',
'2022-10-10',
4,
1);

INSERT INTO `condoManager`.`Veículos`
(`placaCarro`,
`modelo`,
`marca`,
`tipo`,
`cor`,
`ano`,
`casa`)
VALUES
('FEP-0955',
'Focus',
'Ford',
'Carro',
'Preto',
'2024',
44);




