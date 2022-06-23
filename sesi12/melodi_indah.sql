-- Adminer 4.8.1 MySQL 5.5.5-10.4.24-MariaDB dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

DROP VIEW IF EXISTS `all_data`;
CREATE TABLE `all_data` (`id_ssn` int(2) unsigned zerofill, `nama_pemusik` varchar(50), `alamat_pemusik` text, `notelp_pemusik` varchar(13), `nama_album` varchar(20), `tanggal_copyright` date, `format_album` enum('CD','MC'), `judul_lagu` varchar(30), `pengarang_lagu` varchar(20), `nama_instrumen` varchar(20), `kunci_musik` enum('C','G','B','C#','G#','B#'));


SET NAMES utf8mb4;

DROP TABLE IF EXISTS `tb_album`;
CREATE TABLE `tb_album` (
  `id_album` int(5) NOT NULL AUTO_INCREMENT,
  `nama_album` varchar(20) NOT NULL,
  `tanggal_copyright` date NOT NULL,
  `format_album` enum('CD','MC') NOT NULL,
  `id_combine_musik` int(2) unsigned zerofill NOT NULL,
  PRIMARY KEY (`id_album`),
  KEY `id_combine_musik` (`id_combine_musik`),
  CONSTRAINT `tb_album_ibfk_1` FOREIGN KEY (`id_combine_musik`) REFERENCES `tb_pemusik` (`id_ssn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_album` (`id_album`, `nama_album`, `tanggal_copyright`, `format_album`, `id_combine_musik`) VALUES
(6,	'Albumku',	'2022-05-03',	'CD',	03),
(7,	'Heaven',	'2022-12-31',	'MC',	04),
(8,	'Tujuh Belas',	'2022-11-12',	'CD',	05),
(9,	'Juicy',	'2022-03-04',	'CD',	03);

DROP TABLE IF EXISTS `tb_combine_musik`;
CREATE TABLE `tb_combine_musik` (
  `id_combine_musik` int(2) unsigned zerofill NOT NULL,
  `id_ssn` int(2) unsigned zerofill NOT NULL,
  `id_instrumen` int(5) NOT NULL,
  KEY `id_ssn` (`id_combine_musik`),
  KEY `id_ssn_2` (`id_ssn`),
  KEY `id_instrumen` (`id_instrumen`),
  CONSTRAINT `tb_combine_musik_ibfk_1` FOREIGN KEY (`id_combine_musik`) REFERENCES `tb_pemusik` (`id_ssn`),
  CONSTRAINT `tb_combine_musik_ibfk_2` FOREIGN KEY (`id_ssn`) REFERENCES `tb_pemusik` (`id_ssn`),
  CONSTRAINT `tb_combine_musik_ibfk_3` FOREIGN KEY (`id_instrumen`) REFERENCES `tb_instrumen` (`id_instrumen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_combine_musik` (`id_combine_musik`, `id_ssn`, `id_instrumen`) VALUES
(03,	03,	1),
(04,	04,	2),
(05,	05,	1);

DROP TABLE IF EXISTS `tb_instrumen`;
CREATE TABLE `tb_instrumen` (
  `id_instrumen` int(5) NOT NULL AUTO_INCREMENT,
  `nama_instrumen` varchar(20) NOT NULL,
  `kunci_musik` enum('C','G','B','C#','G#','B#') NOT NULL,
  PRIMARY KEY (`id_instrumen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_instrumen` (`id_instrumen`, `nama_instrumen`, `kunci_musik`) VALUES
(1,	'Gitar',	'C'),
(2,	'Piano',	'C#'),
(3,	'Biola',	'B#'),
(4,	'Saxophone',	'G'),
(5,	'Flute',	'B');

DROP TABLE IF EXISTS `tb_lagu`;
CREATE TABLE `tb_lagu` (
  `id_lagu` int(11) NOT NULL AUTO_INCREMENT,
  `judul_lagu` varchar(30) NOT NULL,
  `pengarang_lagu` varchar(20) NOT NULL,
  `id_album` int(5) NOT NULL,
  PRIMARY KEY (`id_lagu`),
  KEY `id_album` (`id_album`),
  CONSTRAINT `tb_lagu_ibfk_2` FOREIGN KEY (`id_album`) REFERENCES `tb_album` (`id_album`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_lagu` (`id_lagu`, `judul_lagu`, `pengarang_lagu`, `id_album`) VALUES
(1,	'Merasa Indah',	'Laleilmanino',	6),
(2,	'You Are The Reason',	'Steven Seagal',	7),
(3,	'Tampar',	'Han',	9),
(4,	'Hati-hati di Jalan',	'Tulus dkk',	8),
(6,	'Lantas',	'Juicy dkk',	9),
(7,	'Tujuh Belas',	'Tulus dkk',	8),
(8,	'Diri',	'Tulus dkk',	8),
(9,	'Where Are You Now',	'Calum dkk',	7);

DROP TABLE IF EXISTS `tb_pemusik`;
CREATE TABLE `tb_pemusik` (
  `id_ssn` int(2) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `nama_pemusik` varchar(50) NOT NULL,
  `alamat_pemusik` text NOT NULL,
  `notelp_pemusik` varchar(13) NOT NULL,
  PRIMARY KEY (`id_ssn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_pemusik` (`id_ssn`, `nama_pemusik`, `alamat_pemusik`, `notelp_pemusik`) VALUES
(03,	'Tiara Andini',	'Boulevard 1 Jakarta Barat',	'08112310504'),
(04,	'Calum Scott',	'Boulevard 1 Jakarta Barat',	'081222877312'),
(05,	'Tulus',	'Residence @ Golf Island Pantai Indah Kapuk',	'081222877443'),
(06,	'Juicy Luicy',	'Sunter Agung Jakarta Utara',	'08112345667');

DROP TABLE IF EXISTS `all_data`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `all_data` AS select `tpe`.`id_ssn` AS `id_ssn`,`tpe`.`nama_pemusik` AS `nama_pemusik`,`tpe`.`alamat_pemusik` AS `alamat_pemusik`,`tpe`.`notelp_pemusik` AS `notelp_pemusik`,`ta`.`nama_album` AS `nama_album`,`ta`.`tanggal_copyright` AS `tanggal_copyright`,`ta`.`format_album` AS `format_album`,`tl`.`judul_lagu` AS `judul_lagu`,`tl`.`pengarang_lagu` AS `pengarang_lagu`,`ti`.`nama_instrumen` AS `nama_instrumen`,`ti`.`kunci_musik` AS `kunci_musik` from (`tb_pemusik` `tpe` join (((`tb_combine_musik` `tc` join `tb_album` `ta` on(`tc`.`id_ssn` = `ta`.`id_combine_musik`)) join `tb_lagu` `tl` on(`ta`.`id_album` = `tl`.`id_album`)) join `tb_instrumen` `ti` on(`tc`.`id_instrumen` = `ti`.`id_instrumen`)));

-- 2022-06-21 21:03:42
