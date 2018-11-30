-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 30-Nov-2018 às 22:08
-- Versão do servidor: 10.1.37-MariaDB
-- versão do PHP: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `agrsolucoes`
--
CREATE DATABASE IF NOT EXISTS `agrsolucoes` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `agrsolucoes`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `agr_catalog_prods`
--

DROP TABLE IF EXISTS `agr_catalog_prods`;
CREATE TABLE `agr_catalog_prods` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `quantidade` int(6) NOT NULL,
  `valor` decimal(8,2) NOT NULL,
  `fabricacao` date NOT NULL,
  `status` char(2) NOT NULL,
  `descricao` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `agr_catalog_prods`
--

INSERT INTO `agr_catalog_prods` (`id`, `nome`, `quantidade`, `valor`, `fabricacao`, `status`, `descricao`) VALUES
(1, 'Tekpix', 500, '1020.99', '2000-12-31', 'A', 'A filmadora mais vendida do Brasil'),
(2, 'Top Therm', 250, '120.00', '2015-07-05', 'A', 'Compre na Top Therm e ganhe um exclusivo Omega 3');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `agr_catalog_prods`
--
ALTER TABLE `agr_catalog_prods`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `agr_catalog_prods`
--
ALTER TABLE `agr_catalog_prods`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
