-- Adminer 4.8.1 MySQL 5.5.5-10.4.24-MariaDB dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

DROP VIEW IF EXISTS `data_gaji`;
CREATE TABLE `data_gaji` (`id_pegawai` int(11), `nama_pegawai` varchar(64), `jabatan` varchar(16), `gaji` float);


DROP VIEW IF EXISTS `data_transaksi`;
CREATE TABLE `data_transaksi` (`id_transaksi` int(11), `nama_pembeli` varchar(64), `nama_menu` varchar(32), `nama_pegawai` varchar(64), `tgl_transaksi` date);


SET NAMES utf8mb4;

DROP TABLE IF EXISTS `tb_gaji`;
CREATE TABLE `tb_gaji` (
  `id_asli` int(11) NOT NULL AUTO_INCREMENT,
  `id_pegawai` int(11) NOT NULL,
  `gaji` float NOT NULL,
  `tgl_gaji` date NOT NULL,
  PRIMARY KEY (`id_asli`),
  KEY `id_pegawai` (`id_pegawai`),
  CONSTRAINT `tb_gaji_ibfk_2` FOREIGN KEY (`id_pegawai`) REFERENCES `tb_pegawai` (`id_pegawai`) ON DELETE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_gaji` (`id_asli`, `id_pegawai`, `gaji`, `tgl_gaji`) VALUES
(2001,	1,	9500000,	'2021-12-01'),
(2002,	2,	7500000,	'2021-12-01'),
(2003,	3,	10500000,	'2021-12-01'),
(2004,	4,	3500000,	'2021-12-01'),
(2005,	5,	14000000,	'2021-12-01'),
(2006,	6,	25000000,	'2021-12-01'),
(2007,	7,	1500000,	'2021-12-01'),
(2008,	8,	10000000,	'2021-12-01'),
(2009,	9,	13500000,	'2021-12-01'),
(2010,	10,	10500000,	'2021-12-01');

DROP TABLE IF EXISTS `tb_menu`;
CREATE TABLE `tb_menu` (
  `id_menu` int(11) NOT NULL AUTO_INCREMENT,
  `nama_menu` varchar(32) NOT NULL,
  `jenis_menu` enum('makanan','minuman') NOT NULL,
  `harga` int(11) NOT NULL,
  PRIMARY KEY (`id_menu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_menu` (`id_menu`, `nama_menu`, `jenis_menu`, `harga`) VALUES
(111,	'Kopi',	'minuman',	3000),
(112,	'Susu',	'minuman',	5000),
(113,	'Jus Jeruk',	'minuman',	15000),
(114,	'Jus Jambu',	'minuman',	5000),
(115,	'Jus Apel',	'minuman',	15000),
(116,	'Indomie',	'makanan',	15000),
(117,	'Mango Desert',	'makanan',	25000),
(118,	'Bubur Ayam',	'makanan',	15000),
(119,	'Karedok',	'makanan',	16000),
(120,	'Batagor',	'makanan',	13000);

DROP TABLE IF EXISTS `tb_pegawai`;
CREATE TABLE `tb_pegawai` (
  `id_pegawai` int(11) NOT NULL AUTO_INCREMENT,
  `nama_pegawai` varchar(64) NOT NULL,
  `alamat` text NOT NULL,
  `jenis_kelamin` enum('male','female') NOT NULL,
  `tgl_lahir` date NOT NULL,
  `status` enum('belum menikah','menikah') NOT NULL,
  `no_tlp` varchar(13) NOT NULL,
  `jabatan` varchar(16) NOT NULL,
  PRIMARY KEY (`id_pegawai`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_pegawai` (`id_pegawai`, `nama_pegawai`, `alamat`, `jenis_kelamin`, `tgl_lahir`, `status`, `no_tlp`, `jabatan`) VALUES
(1,	'Tiara',	'Jakarta',	'female',	'1992-10-14',	'menikah',	'08112388774',	'Singer'),
(2,	'Lyodra',	'BSD',	'female',	'1992-04-13',	'belum menikah',	'0812345677',	'Singer'),
(3,	'Ziva',	'Bekasi',	'female',	'1999-05-09',	'belum menikah',	'08112388774',	'Singer'),
(4,	'Judika',	'Jakarta Selatan',	'male',	'1990-03-05',	'belum menikah',	'0812331133',	'Singer'),
(5,	'Raffi Ahmad',	'Andara',	'male',	'1989-01-02',	'menikah',	'0811112223',	'Artis'),
(6,	'Rio Dewanto',	'Jakarta Utara',	'male',	'1989-01-09',	'menikah',	'085188333929',	'Aktor'),
(7,	'Ariel Tatum',	'Jakarta Timur',	'female',	'1998-12-05',	'belum menikah',	'081588292003',	'Aktris'),
(8,	'Bimo PD',	'Cikarang',	'male',	'1999-09-13',	'belum menikah',	'081733822012',	'Youtuber'),
(9,	'Kelvin Gimang',	'Tangerang',	'male',	'1992-09-09',	'menikah',	'08112232112',	'Youtuber'),
(10,	'Pras Teguh',	'Bekasi',	'male',	'1997-10-07',	'menikah',	'0812345677',	'Youtuber');

DROP TABLE IF EXISTS `tb_pembeli`;
CREATE TABLE `tb_pembeli` (
  `id_pembeli` int(11) NOT NULL AUTO_INCREMENT,
  `nama_pembeli` varchar(64) NOT NULL,
  `alamat` varchar(64) NOT NULL,
  `jenis_kelamin` enum('male','female') NOT NULL,
  `tgl_lahir` date NOT NULL,
  `status` varchar(64) NOT NULL,
  `no_tlp` int(13) NOT NULL,
  `pekerjaan` varchar(32) NOT NULL,
  PRIMARY KEY (`id_pembeli`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_pembeli` (`id_pembeli`, `nama_pembeli`, `alamat`, `jenis_kelamin`, `tgl_lahir`, `status`, `no_tlp`, `pekerjaan`) VALUES
(211,	'Alfi',	'Jakarta',	'male',	'1983-03-01',	'lajang',	811112223,	'Pedagang'),
(212,	'Ajeng',	'Singosari',	'female',	'1989-06-10',	'menikah',	811112223,	'Pedagang'),
(213,	'Rohani',	'Singosari',	'female',	'1989-05-01',	'lajang',	812345677,	'Pekerja Swasta'),
(214,	'Alvin',	'Bandung',	'male',	'1999-03-12',	'lajang',	811112223,	'Dokter'),
(215,	'Budi',	'Unai',	'male',	'1999-01-01',	'lajang',	812345677,	'Perawat'),
(216,	'Michael',	'Bekasi',	'male',	'1998-02-02',	'lajang',	812345677,	'Akuntan'),
(217,	'Resti',	'Papua',	'female',	'1999-02-09',	'lajang',	811112223,	'Banker'),
(218,	'Intan',	'Manado',	'female',	'1998-07-03',	'menikah',	812331133,	'CS'),
(219,	'Regina',	'Makassar',	'female',	'2001-08-10',	'menikah',	812331133,	'dokter'),
(220,	'Maryati',	'Aceh',	'female',	'1998-08-11',	'lajang',	811112223,	'Pelari');

DROP TABLE IF EXISTS `tb_transaksi`;
CREATE TABLE `tb_transaksi` (
  `id_transaksi` int(11) NOT NULL AUTO_INCREMENT,
  `id_pembeli` int(11) NOT NULL,
  `id_menu` int(11) NOT NULL,
  `id_pegawai` int(11) NOT NULL,
  `tgl_transaksi` date NOT NULL,
  PRIMARY KEY (`id_transaksi`),
  KEY `id_pembeli` (`id_pembeli`),
  KEY `id_menu` (`id_menu`),
  KEY `id_pegawai` (`id_pegawai`),
  CONSTRAINT `tb_transaksi_ibfk_1` FOREIGN KEY (`id_pembeli`) REFERENCES `tb_pembeli` (`id_pembeli`) ON DELETE NO ACTION,
  CONSTRAINT `tb_transaksi_ibfk_2` FOREIGN KEY (`id_menu`) REFERENCES `tb_menu` (`id_menu`) ON DELETE NO ACTION,
  CONSTRAINT `tb_transaksi_ibfk_3` FOREIGN KEY (`id_pegawai`) REFERENCES `tb_pegawai` (`id_pegawai`) ON DELETE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_transaksi` (`id_transaksi`, `id_pembeli`, `id_menu`, `id_pegawai`, `tgl_transaksi`) VALUES
(1001,	211,	111,	9,	'2020-10-09'),
(1002,	211,	112,	9,	'2021-11-08'),
(1003,	212,	113,	10,	'2021-11-10'),
(1004,	213,	114,	10,	'2021-11-28'),
(1005,	213,	115,	9,	'2021-11-28'),
(1006,	214,	116,	9,	'2012-11-29'),
(1007,	215,	117,	10,	'2021-12-08'),
(1008,	216,	118,	9,	'2021-12-08'),
(1009,	217,	119,	9,	'2021-12-18'),
(1010,	218,	119,	9,	'2021-12-18'),
(1011,	219,	120,	10,	'2021-12-28'),
(1012,	220,	120,	10,	'2021-12-29');

DROP TABLE IF EXISTS `data_gaji`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `data_gaji` AS select `tp`.`id_pegawai` AS `id_pegawai`,`tp`.`nama_pegawai` AS `nama_pegawai`,`tp`.`jabatan` AS `jabatan`,`tg`.`gaji` AS `gaji` from (`tb_pegawai` `tp` join `tb_gaji` `tg` on(`tg`.`id_pegawai` = `tp`.`id_pegawai`));

DROP TABLE IF EXISTS `data_transaksi`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `data_transaksi` AS select `tr`.`id_transaksi` AS `id_transaksi`,`tpl`.`nama_pembeli` AS `nama_pembeli`,`tm`.`nama_menu` AS `nama_menu`,`tp`.`nama_pegawai` AS `nama_pegawai`,`tr`.`tgl_transaksi` AS `tgl_transaksi` from (((`tb_transaksi` `tr` join `tb_pembeli` `tpl` on(`tr`.`id_pembeli` = `tpl`.`id_pembeli`)) join `tb_menu` `tm` on(`tr`.`id_menu` = `tm`.`id_menu`)) join `tb_pegawai` `tp` on(`tr`.`id_pegawai` = `tp`.`id_pegawai`));

-- 2022-06-22 02:10:50
