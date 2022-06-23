-- Adminer 4.8.1 MySQL 5.5.5-10.4.24-MariaDB dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP TABLE IF EXISTS `tb_dosen`;
CREATE TABLE `tb_dosen` (
  `id_dosen` int(11) NOT NULL AUTO_INCREMENT,
  `nama` varchar(64) NOT NULL,
  `umur` int(4) NOT NULL,
  PRIMARY KEY (`id_dosen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_dosen` (`id_dosen`, `nama`, `umur`) VALUES
(1,	'Joko',	62),
(2,	'Wiratmo',	86),
(3,	'Mardi',	23);

DROP TABLE IF EXISTS `tb_mahasiswa`;
CREATE TABLE `tb_mahasiswa` (
  `nim` int(16) NOT NULL AUTO_INCREMENT,
  `nama` varchar(64) NOT NULL,
  `alamat` varchar(8) NOT NULL,
  `id_ortu` int(11) NOT NULL,
  PRIMARY KEY (`nim`),
  KEY `id_ortu` (`id_ortu`),
  CONSTRAINT `tb_mahasiswa_ibfk_1` FOREIGN KEY (`id_ortu`) REFERENCES `tb_ortu` (`id_ortu`) ON DELETE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_mahasiswa` (`nim`, `nama`, `alamat`, `id_ortu`) VALUES
(1,	'Ayub Yoga',	'Sarijadi',	3),
(2,	'Tamara',	'Jakarta',	2),
(3,	'Tulus',	'Singapor',	1);

DROP TABLE IF EXISTS `tb_matkul`;
CREATE TABLE `tb_matkul` (
  `id_matkul` int(8) NOT NULL AUTO_INCREMENT,
  `nama_matkul` varchar(32) NOT NULL,
  `sks` int(8) NOT NULL,
  `harga` int(16) NOT NULL,
  PRIMARY KEY (`id_matkul`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_matkul` (`id_matkul`, `nama_matkul`, `sks`, `harga`) VALUES
(1,	'meteorologi satelit',	4,	200000),
(2,	'komputasi meteorologi',	3,	300000),
(3,	'instrumentasi meteorologi',	4,	150000),
(4,	'Instrumentasi Meteorologi',	4,	250000);

DROP TABLE IF EXISTS `tb_ortu`;
CREATE TABLE `tb_ortu` (
  `id_ortu` int(11) NOT NULL AUTO_INCREMENT,
  `nama` varchar(64) NOT NULL,
  `tgl_lahir` date NOT NULL,
  PRIMARY KEY (`id_ortu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_ortu` (`id_ortu`, `nama`, `tgl_lahir`) VALUES
(1,	'Stephen',	'1989-08-06'),
(2,	'Jooanathan',	'1967-03-12'),
(3,	'Ricky',	'1985-05-03');

-- 2022-06-22 01:46:59
