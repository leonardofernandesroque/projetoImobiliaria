-- MySQL Script generated by MySQL Workbench
-- Wed Apr 14 17:00:44 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema bd_imob
-- -----------------------------------------------------
-- Banco de dados criado para o sistema imob com o uso da linguagem java.
DROP SCHEMA IF EXISTS `bd_imob` ;

-- -----------------------------------------------------
-- Schema bd_imob
--
-- Banco de dados criado para o sistema imob com o uso da linguagem java.
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bd_imob` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;
SHOW WARNINGS;
USE `bd_imob` ;

-- -----------------------------------------------------
-- Table `tb_Imovel_Rural`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tb_Imovel_Rural` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tb_Imovel_Rural` (
  `id_Imovel_R` INT NOT NULL AUTO_INCREMENT,
  `numero_Itr` VARCHAR(45) NULL,
  `numero_Incra` VARCHAR(45) NULL,
  `unidade_area_imovel_rural` VARCHAR(45) NULL,
  `area_App` INT NULL,
  `area_utilizavel` INT NULL,
  `tem_Curral` VARCHAR(45) NULL,
  `tem_Casa_sede` VARCHAR(45) NULL,
  `tem_Casa_Funcionarios` VARCHAR(45) NULL,
  `tem_Represa` VARCHAR(45) NULL,
  `tem_Rio` VARCHAR(45) NULL,
  `tem_Poco` VARCHAR(45) NULL,
  `tb_imovel_geral_id_imovel` INT NOT NULL,
  PRIMARY KEY (`id_Imovel_R`, `tb_imovel_geral_id_imovel`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tb_Pessoa_Fisica`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tb_Pessoa_Fisica` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tb_Pessoa_Fisica` (
  `id_PessoaPF` INT NOT NULL AUTO_INCREMENT,
  `id_codigo_Pessoa` INT NULL,
  `nome` VARCHAR(100) NULL,
  `sobrenome` VARCHAR(150) NULL,
  `cpf` VARCHAR(45) NULL,
  `rg` VARCHAR(45) NULL,
  `data_nascimento` DATE NULL,
  `sexo` VARCHAR(5) NULL,
  `estado_Civil` VARCHAR(100) NULL,
  `regime_Bens` VARCHAR(100) NULL,
  `naturalidade` VARCHAR(45) NULL,
  `estado_Naturalidade` VARCHAR(45) NULL,
  `escolaridade` VARCHAR(100) NULL,
  `profissao` VARCHAR(45) NULL,
  `anotacoes` LONGTEXT NULL,
  `nome_pai` VARCHAR(150) NULL,
  `nome_mae` VARCHAR(150) NULL,
  `status_Cadastro` VARCHAR(45) NULL,
  `tb_pessoa_id_Pessoa` INT NOT NULL,
  PRIMARY KEY (`id_PessoaPF`, `tb_pessoa_id_Pessoa`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tb_cidades`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tb_cidades` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tb_cidades` (
  `id_Estado` INT NOT NULL AUTO_INCREMENT,
  `nome_Cidade` VARCHAR(150) NULL,
  `tb_estados_id_Estados` INT NOT NULL,
  PRIMARY KEY (`id_Estado`, `tb_estados_id_Estados`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tb_cliente_pessoa_fisica`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tb_cliente_pessoa_fisica` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tb_cliente_pessoa_fisica` (
  `id_ClientePF` INT NOT NULL AUTO_INCREMENT,
  `id_codigo_clientePF` INT NULL,
  `status_Comprador` VARCHAR(45) NULL,
  `status_Locador` VARCHAR(45) NULL,
  `status_Locatario` VARCHAR(45) NULL,
  `status_Vendedor` VARCHAR(45) NULL,
  `tb_Pessoa_Fisica_id_PessoaPF` INT NOT NULL,
  `tb_Pessoa_Fisica_tb_pessoa_id_Pessoa` INT NOT NULL,
  PRIMARY KEY (`id_ClientePF`, `tb_Pessoa_Fisica_id_PessoaPF`, `tb_Pessoa_Fisica_tb_pessoa_id_Pessoa`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tb_cliente_pessoa_juridica`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tb_cliente_pessoa_juridica` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tb_cliente_pessoa_juridica` (
  `id_ClientePJ` INT NOT NULL AUTO_INCREMENT,
  `codigo_ClientePJ` INT NULL,
  `status_Comprador` VARCHAR(45) NULL,
  `status_Locatario` VARCHAR(45) NULL,
  `status_Locador` VARCHAR(45) NULL,
  `status_Vendedor` VARCHAR(45) NULL,
  `tb_pessoa_juridica_tb_pessoa_id_Pessoa` INT NOT NULL,
  PRIMARY KEY (`id_ClientePJ`, `tb_pessoa_juridica_tb_pessoa_id_Pessoa`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tb_corretor`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tb_corretor` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tb_corretor` (
  `id_Corretor` INT NOT NULL AUTO_INCREMENT,
  `id_Codigo_Corretor` INT NULL,
  `numero_Creci` INT NULL,
  `tb_Pessoa_Fisica_id_PessoaPF` INT NOT NULL,
  `tb_Pessoa_Fisica_tb_pessoa_id_Pessoa` INT NOT NULL,
  `tb_pagamento_comissao_id_Pag_Comissao` INT NOT NULL,
  PRIMARY KEY (`id_Corretor`, `tb_Pessoa_Fisica_id_PessoaPF`, `tb_Pessoa_Fisica_tb_pessoa_id_Pessoa`, `tb_pagamento_comissao_id_Pag_Comissao`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tb_email`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tb_email` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tb_email` (
  `id_Email` INT NOT NULL AUTO_INCREMENT,
  `id_Codigo_email` INT NULL,
  `tipo_email` VARCHAR(100) NULL,
  `email` VARCHAR(150) NULL,
  `tb_pessoa_id_Pessoa` INT NOT NULL,
  PRIMARY KEY (`id_Email`, `tb_pessoa_id_Pessoa`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tb_endereco`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tb_endereco` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tb_endereco` (
  `id_Endereco` INT NOT NULL AUTO_INCREMENT,
  `tipo_lagradouro` VARCHAR(100) NULL,
  `logradouro` VARCHAR(200) NULL,
  `numero_logradouro` VARCHAR(45) NULL,
  `complemento` VARCHAR(45) NULL,
  `cep` VARCHAR(45) NULL,
  `latitude` VARCHAR(45) NULL,
  `longitude` VARCHAR(45) NULL,
  `numero_apartamento` VARCHAR(45) NULL,
  `andar_apartamento` VARCHAR(45) NULL,
  `bloco_apartamento` VARCHAR(45) NULL,
  `tb_cidades_id_Estado` INT NOT NULL,
  `tb_cidades_tb_estados_id_Estados` INT NOT NULL,
  `tb_pessoa_id_Pessoa` INT NOT NULL,
  PRIMARY KEY (`id_Endereco`, `tb_cidades_id_Estado`, `tb_cidades_tb_estados_id_Estados`, `tb_pessoa_id_Pessoa`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tb_estados`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tb_estados` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tb_estados` (
  `id_Estados` INT NOT NULL AUTO_INCREMENT,
  `nome_Estados` VARCHAR(5) NULL,
  PRIMARY KEY (`id_Estados`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tb_imobiliaria`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tb_imobiliaria` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tb_imobiliaria` (
  `id_Imobiliaria` INT NOT NULL AUTO_INCREMENT,
  `id_Codigo_imobiliaria` INT NULL,
  `numero_Crici` INT NULL,
  `tb_pessoa_juridica_tb_pessoa_id_Pessoa` INT NOT NULL,
  `tb_pagamento_comissao_id_Pag_Comissao` INT NOT NULL,
  PRIMARY KEY (`id_Imobiliaria`, `tb_pessoa_juridica_tb_pessoa_id_Pessoa`, `tb_pagamento_comissao_id_Pag_Comissao`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tb_imovel_geral`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tb_imovel_geral` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tb_imovel_geral` (
  `id_imovel` INT NOT NULL AUTO_INCREMENT,
  `id_Codigo_Imovel` INT NULL,
  `status_Venda` VARCHAR(45) NULL,
  `status_Locacao` VARCHAR(45) NULL,
  `numero_Matricula` VARCHAR(45) NULL,
  `tipo_Imovel` VARCHAR(45) NULL,
  `documentacao_imovel` VARCHAR(45) NULL,
  `fotos_Imovel` VARCHAR(45) NULL,
  `anotacoes_Imovel` LONGTEXT NULL,
  `qualidade_Localizacao` VARCHAR(45) NULL,
  `qualidade_De_Acesso` VARCHAR(45) NULL,
  `tb_endereco_id_Endereco` INT NOT NULL,
  `tb_endereco_tb_cidades_id_Estado` INT NOT NULL,
  `tb_endereco_tb_cidades_tb_estados_id_Estados` INT NOT NULL,
  `tb_endereco_tb_pessoa_id_Pessoa` INT NOT NULL,
  PRIMARY KEY (`id_imovel`, `tb_endereco_id_Endereco`, `tb_endereco_tb_cidades_id_Estado`, `tb_endereco_tb_cidades_tb_estados_id_Estados`, `tb_endereco_tb_pessoa_id_Pessoa`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tb_imovel_urbano`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tb_imovel_urbano` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tb_imovel_urbano` (
  `id_Imovel_U` INT NOT NULL AUTO_INCREMENT,
  `numero_Iptu` VARCHAR(45) NULL,
  `area_Total_Terreno` INT NULL,
  `area_Construida` INT NULL,
  `quant_Banheiros` INT NULL,
  `quant_Dormitorios` INT NULL,
  `quant_Salas` INT NULL,
  `tem_Garagem` VARCHAR(45) NULL,
  `quant_Vagas_Carro` INT NULL,
  `tem_edicula` VARCHAR(5) NULL,
  `tem_Churrasqueira` VARCHAR(5) NULL,
  `tb_imovel_geral_id_imovel` INT NOT NULL,
  PRIMARY KEY (`id_Imovel_U`, `tb_imovel_geral_id_imovel`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tb_login`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tb_login` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tb_login` (
  `id_Login` INT NOT NULL AUTO_INCREMENT,
  `usuario_Login` VARCHAR(150) NULL,
  `senha_Login` VARCHAR(150) NULL,
  `permissao` VARCHAR(45) NULL,
  `data_login` DATE NULL,
  `time_login` VARCHAR(45) NULL,
  `tb_Pessoa_Fisica_id_PessoaPF` INT NOT NULL,
  `tb_Pessoa_Fisica_tb_pessoa_id_Pessoa` INT NOT NULL,
  PRIMARY KEY (`id_Login`, `tb_Pessoa_Fisica_id_PessoaPF`, `tb_Pessoa_Fisica_tb_pessoa_id_Pessoa`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tb_pagamento_comissao`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tb_pagamento_comissao` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tb_pagamento_comissao` (
  `id_Pag_Comissao` INT NOT NULL AUTO_INCREMENT,
  `id_Codigo_Pagamento_Comissao` INT NULL,
  `data_Pagamento` DATE NULL,
  `condicoes_Pagamento` LONGTEXT NULL,
  `anotacoes_Pagamento_Comissao` LONGTEXT NULL,
  `status_Pagamento_Comissao` VARCHAR(45) NULL,
  `numero_Nota_Recibo` VARCHAR(45) NULL,
  `documentacao_Venda_Locacao` VARCHAR(45) NULL,
  PRIMARY KEY (`id_Pag_Comissao`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tb_pesquisa-cadastral`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tb_pesquisa-cadastral` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tb_pesquisa-cadastral` (
  `id_Pesquisa` INT NOT NULL AUTO_INCREMENT,
  `id_Codigo_Pesquisa_Cadastral` INT NULL,
  `data_pesquisa` DATE NULL,
  `situacao_Cadastral` LONGTEXT NULL,
  `data_Proxima_Pesquisa` DATE NULL,
  `tb_pessoa_id_Pessoa` INT NOT NULL,
  PRIMARY KEY (`id_Pesquisa`, `tb_pessoa_id_Pessoa`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tb_pessoa`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tb_pessoa` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tb_pessoa` (
  `id_Pessoa` INT NOT NULL AUTO_INCREMENT,
  `id_Codigo_pessoa` INT NULL,
  PRIMARY KEY (`id_Pessoa`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tb_pessoa_juridica`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tb_pessoa_juridica` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tb_pessoa_juridica` (
  `id_PessoaPJ` INT NOT NULL AUTO_INCREMENT,
  `razao_Social` VARCHAR(150) NULL,
  `nome_Fantasia` VARCHAR(150) NULL,
  `cnpj` VARCHAR(45) NULL,
  `inscriao_Estadual` VARCHAR(45) NULL,
  `isento_Inscriao_estadual` VARCHAR(5) NULL,
  `atividade_Principal` VARCHAR(150) NULL,
  `atividade_Segundaria` LONGTEXT NULL,
  `data_Abertura` DATE NULL,
  `anotacoes` LONGTEXT NULL,
  `status_Cadastro` VARCHAR(45) NULL,
  `tb_pessoa_id_Pessoa` INT NOT NULL,
  PRIMARY KEY (`tb_pessoa_id_Pessoa`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tb_prestador_servicos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tb_prestador_servicos` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tb_prestador_servicos` (
  `id_Prestador` INT NOT NULL AUTO_INCREMENT,
  `id_Codigo_Prestador` INT NULL,
  `id_Codigo_Servico` INT NULL,
  `tipo_servico_prestado` VARCHAR(150) NULL,
  `data_Inicial` DATE NULL,
  `data_Final` DATE NULL,
  `anotacoes` LONGTEXT NULL,
  `tb_pessoa_juridica_tb_pessoa_id_Pessoa` INT NOT NULL,
  PRIMARY KEY (`id_Prestador`, `tb_pessoa_juridica_tb_pessoa_id_Pessoa`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tb_telefone`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tb_telefone` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `tb_telefone` (
  `id_Telefone` INT NOT NULL AUTO_INCREMENT,
  `id_Codigo_Telefone` INT NULL,
  `tipo_Telefone` VARCHAR(45) NULL,
  `numero_Telefone` VARCHAR(45) NULL,
  `tb_pessoa_id_Pessoa` INT NOT NULL,
  PRIMARY KEY (`id_Telefone`, `tb_pessoa_id_Pessoa`))
ENGINE = InnoDB;

SHOW WARNINGS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;