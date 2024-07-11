-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 09, 2024 at 08:34 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ikimina_iprckarongi`
--

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `mid` int(3) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `phone` varchar(50) NOT NULL,
  `password` varchar(30) NOT NULL,
  `confirm_password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`mid`, `firstname`, `lastname`, `email`, `address`, `phone`, `password`, `confirm_password`) VALUES
(1, 'Niyodusenga', 'Khadidja', 'niyokhad@gmail.com', 'karongi', '0780131993', '123', '123'),
(2, 'Niyodusenga', 'Khadidja', 'niyokhad@gmail.com', 'karongi', '0780131993', '123', '123'),
(3, 'ivan', 'mwabaze', 'ivan@gmail.com', 'bugesera', '0789654322', '567', '567'),
(4, 'ivan', 'mwabaze', 'ivan@gmail.com', 'bugesera', '0789654322', '567', '567'),
(5, 'josue', 'josh', 'josh@gmail.com', 'kabuga', '086754321', 'fgh', 'fgh'),
(6, 'Dusabimana', 'aboul\'azizi', 'zyz@gmail.comu', 'nyaruguru', '0780131997', '456', '456'),
(7, 'princess', 'nina', 'hasley@gmail.com', 'kagugu', '0798654123', 'nina', 'nina'),
(8, 'jennifer', 'ishimwe', 'jenny@gmail.com', 'kigali', '078965423', '123', '123'),
(9, 'jennifer', 'ishimwe', 'jenny@gmail.com', 'kigali', '0798654123', '123', '123'),
(10, 'ishimwe', 'kevin', 'ishimwe@gmail.com', 'kigali', '0781860086', '123', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`mid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `member`
--
ALTER TABLE `member`
  MODIFY `mid` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
