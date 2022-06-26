-- Adminer 4.8.1 MySQL 5.5.5-10.4.24-MariaDB dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP TABLE IF EXISTS `tb_product`;
CREATE TABLE `tb_product` (
  `id` bigint(20) NOT NULL,
  `harga_beli` int(11) DEFAULT NULL,
  `harga_jual` int(11) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_product` (`id`, `harga_beli`, `harga_jual`, `nama`) VALUES
(1,	19000000,	21000000,	'MacBook Pro M1');
(2,	31000000,	32000000,	'MacBook Pro M2 2022');

(3,	17000000,	18500000,	'iPhone 12 Pro'),
(4,	10000000,	7000000,	'iPhone Xs');

-- 2022-06-26 18:22:42
