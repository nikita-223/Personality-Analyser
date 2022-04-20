-- phpMyAdmin SQL Dump
-- version 4.5.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 22, 2020 at 04:15 AM
-- Server version: 5.7.11
-- PHP Version: 5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `per`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `aname` varchar(50) NOT NULL,
  `pass` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`aname`, `pass`) VALUES
('poonam', 'pp'),
('nikita', 'ni'),
('priyanka', 'pr'),
('shona', 'sg');

-- --------------------------------------------------------

--
-- Table structure for table `comment`
--

CREATE TABLE `comment` (
  `saadhar` bigint(20) NOT NULL,
  `raadhar` bigint(20) NOT NULL,
  `points` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `comment`
--

INSERT INTO `comment` (`saadhar`, `raadhar`, `points`) VALUES
(33333, 22222, '20'),
(33333, 11111, '80'),
(21213213, 67668, '60'),
(67668, 21213213, '60'),
(5454768, 232223, '40'),
(232223, 5454768, '20'),
(22222, 11111, '40'),
(22222, 33333, '20'),
(11111, 22222, '-60'),
(11111, 33333, '20');

-- --------------------------------------------------------

--
-- Table structure for table `main`
--

CREATE TABLE `main` (
  `aadhar` bigint(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `roll` varchar(20) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `mobile` bigint(15) NOT NULL,
  `email` varchar(50) NOT NULL,
  `gname` varchar(50) NOT NULL,
  `gmobile` bigint(15) NOT NULL,
  `points` double NOT NULL,
  `total` int(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `main`
--

INSERT INTO `main` (`aadhar`, `name`, `roll`, `gender`, `mobile`, `email`, `gname`, `gmobile`, `points`, `total`) VALUES
(11111, 'poonam', '1730952', 'female', 9056964454, 'poonam31011999@gmail.com', 'mohit', 9217564454, 2, 2),
(22222, 'nikita', '1731313', 'female', 8699566008, 'nikita2231997@gmail.com', 'priyanka', 9876543210, 2, 4),
(33333, 'priyanka', '1731319', 'female', 9878622991, 'gargp131104@gmail.com', 'janak raj', 9876543210, 1, 1),
(55555, 'npp', '1730953', 'Female', 98987866, 'npp95239@gmail.com', 'poonam', 9056964454, 1, 1),
(44444, 'devi', '1731311', 'Male', 3323432324, 'deveshwarbansal.8.9.98@gmail.com', 'dsgf', 334223434, 0, 0),
(66666, 'shona', '1730954', 'Male', 2443435454, 'shonagoyal218@gmail.com', 'poonam', 9056964454, 0, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`aname`);

--
-- Indexes for table `comment`
--
ALTER TABLE `comment`
  ADD PRIMARY KEY (`saadhar`,`raadhar`);

--
-- Indexes for table `main`
--
ALTER TABLE `main`
  ADD PRIMARY KEY (`aadhar`,`roll`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
