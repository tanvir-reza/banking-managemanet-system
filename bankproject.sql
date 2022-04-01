-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 27, 2022 at 08:54 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bankproject`
--

-- --------------------------------------------------------

--
-- Table structure for table `account_info`
--

CREATE TABLE `account_info` (
  `phone` varchar(11) NOT NULL,
  `amount` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `account_info`
--

INSERT INTO `account_info` (`phone`, `amount`) VALUES
('01303927101', 500),
('01627775133', 0),
('01767112577', 1900),
('01788112139', 8950);

-- --------------------------------------------------------

--
-- Table structure for table `customer_info`
--

CREATE TABLE `customer_info` (
  `phone` varchar(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `email` varchar(50) NOT NULL,
  `nid` varchar(10) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer_info`
--

INSERT INTO `customer_info` (`phone`, `name`, `email`, `nid`, `password`) VALUES
('01303927101', 'Nahin', 'nahin@gmail.com', '1526452152', '12345'),
('01627775133', 'Noyon', 'mail@mail.com', '1515652652', '123456'),
('01767112577', 'Tanvir', 'Tanvir@gmail.com', '1561616', '1234'),
('01788112139', 'jobayer', 'jobf', '1521561529', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE `transaction` (
  `account_number` varchar(11) NOT NULL,
  `type` varchar(20) NOT NULL,
  `receiver` varchar(11) NOT NULL,
  `amount` double NOT NULL,
  `ref` varchar(10) NOT NULL,
  `Time` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `transaction_id` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaction`
--

INSERT INTO `transaction` (`account_number`, `type`, `receiver`, `amount`, `ref`, `Time`, `transaction_id`) VALUES
('01767112577', 'Withdraw', '01767112577', 90, 'Withdraw', '2022-02-28 18:49:24', '8UX0O5ZRJ4'),
('01767112577', 'Recive Money', '01303927101', 100, 'ytg', '2022-03-22 03:38:07', 'B1WNS4XS0IUE0'),
('01303927101', 'Card', '01303927101', 1000, '1234564145', '2022-02-28 18:41:30', 'B3O9E2YE9W'),
('01767112577', 'Recive Money', '01303927101', 100, 'lok', '2022-03-22 03:39:05', 'GSGUO5MUNZLHF'),
('01767112577', 'Recive Money', '01303927101', 100, 'hu', '2022-03-22 03:34:12', 'HDX3KAJV7QHEQ'),
('01303927101', 'Send Money', '01767112577', 100, '12345', '2022-02-28 18:44:27', 'JEVNJ71C7PCZJ'),
('01767112577', 'Recive Money', '01303927101', 500, 'uuj', '2022-03-22 03:41:52', 'JIVMW49RZJGV9'),
('01303927101', 'Withdraw', '01303927101', 500, 'Withdraw', '2022-03-22 03:43:07', 'LP1OMQHGUB'),
('01303927101', 'Send Money', '01767112577', 100, 'lok', '2022-03-22 03:39:05', 'QCJOGNXE560KT'),
('01303927101', 'Send Money', '01767112577', 100, 'hu', '2022-03-22 03:34:12', 'QNQPKC0SPGZIA'),
('01303927101', 'Withdraw', '01303927101', 100, 'Withdraw', '2022-03-14 19:57:21', 'QVYPVGI0N5'),
('01303927101', 'Send Money', '01767112577', 100, 'ytg', '2022-03-22 03:38:07', 'TPLPRL1UKD0AT'),
('01303927101', 'Send Money', '01767112577', 500, 'uuj', '2022-03-22 03:41:52', 'TXGMQ0J1J2IJP'),
('01788112139', 'Withdraw', '01788112139', 1050, 'Withdraw', '2022-03-06 07:27:39', 'VI2K9Q3058'),
('01767112577', 'Recive Money', '01303927101', 100, '12345', '2022-02-28 18:44:27', 'XGGZLF8Q78B4K'),
('01788112139', 'Card', '01788112139', 10000, '41654165', '2022-03-06 07:27:24', 'ZM85EHW27I');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account_info`
--
ALTER TABLE `account_info`
  ADD PRIMARY KEY (`phone`),
  ADD KEY `phone` (`phone`);

--
-- Indexes for table `customer_info`
--
ALTER TABLE `customer_info`
  ADD PRIMARY KEY (`phone`);

--
-- Indexes for table `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`transaction_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
