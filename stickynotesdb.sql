-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 15, 2024 at 07:44 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `stickynotesdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `roles`
--

CREATE TABLE `roles` (
  `role_id` int(11) NOT NULL,
  `roleName` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `roles`
--

INSERT INTO `roles` (`role_id`, `roleName`) VALUES
(1, 'Normal User'),
(2, 'super Admin');

-- --------------------------------------------------------

--
-- Table structure for table `stickynotes`
--

CREATE TABLE `stickynotes` (
  `id` int(11) NOT NULL,
  `userid` int(11) NOT NULL,
  `title` varchar(100) DEFAULT NULL,
  `content` text DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `update_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `stickynotes`
--

INSERT INTO `stickynotes` (`id`, `userid`, `title`, `content`, `created_at`, `update_at`) VALUES
(1, 6, 'amahoro', 'amahoro naganze kuri mwe mwese munkunda', '2024-08-15 12:58:31', '2024-08-15 12:58:31'),
(2, 6, 'nfdfdfjrfrf djvng mgfjkd', 'nck fdrgfdcjv kmgfdkn dfmgtfk', '2024-08-15 13:31:18', '2024-08-15 13:31:18'),
(3, 6, 'nfdfdfjrfrf djvng mgfjkd', 'cnsdkdsfndskfndskfdsfd', '2024-08-15 13:32:35', '2024-08-15 13:32:35'),
(4, 6, 'hhhh', 'dsajdhuhwed wenf', '2024-08-15 13:34:10', '2024-08-15 13:34:10'),
(5, 6, 'ksjfheufrf', 'dsjferhufrjd jfureg', '2024-08-15 13:47:37', '2024-08-15 13:47:37'),
(6, 6, 'fdsjfjjfdgjkfdgjfd', 'dsjfruiegvnjfguitgbvf', '2024-08-15 14:07:22', '2024-08-15 14:07:22'),
(7, 6, 'dnfjgndfkgfnd', 'dcdsfnkdjfhrif', '2024-08-15 14:11:02', '2024-08-15 14:11:02'),
(8, 6, 'djnfjdfjdfkgkf', 'snfjerufnjdner', '2024-08-15 14:20:40', '2024-08-15 14:20:40'),
(9, 6, 'ubwiza', 'ubwiza budashiramakemwa', '2024-08-15 14:33:11', '2024-08-15 14:33:11'),
(10, 6, 'jcndsj', 'cjsdbjdsfbdsjfk', '2024-08-15 14:34:39', '2024-08-15 14:34:39'),
(11, 5, 'csdjcbdcjdbcdsj', 'amajyaruguru', '2024-08-15 15:39:00', '2024-08-15 17:01:31'),
(13, 5, 'kwiga neza', 'kwiga nibyiza bitera kumenya', '2024-08-15 17:19:25', '2024-08-15 17:19:25');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `userid` int(11) NOT NULL,
  `Names` varchar(40) NOT NULL,
  `email` varchar(40) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(16) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `note_limit` int(11) DEFAULT 5
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`userid`, `Names`, `email`, `gender`, `username`, `password`, `role_id`, `status`, `note_limit`) VALUES
(1, 'Niyomugenga princess', 'niyomugengaprincess@gmail.com', 'f', 'princess', 'welcom2@123', 2, 'active', 5),
(5, 'harerimana jack', 'harerimanaj@gmail.com', 'male', 'jack', '123', 1, 'active', 2),
(6, 'karangwa liliane', 'hasleyprincess1@gmail.com', 'female', 'karangwa', '123', 1, 'active', 10),
(7, 'kim philbert', 'ahishakiyephilbert2002@gmail.com', 'male', 'philbert', '123', 1, 'inactive', 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`role_id`);

--
-- Indexes for table `stickynotes`
--
ALTER TABLE `stickynotes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `userid` (`userid`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`userid`),
  ADD KEY `role_id` (`role_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `roles`
--
ALTER TABLE `roles`
  MODIFY `role_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `stickynotes`
--
ALTER TABLE `stickynotes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `userid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `stickynotes`
--
ALTER TABLE `stickynotes`
  ADD CONSTRAINT `stickynotes_ibfk_1` FOREIGN KEY (`userid`) REFERENCES `users` (`userid`) ON DELETE CASCADE;

--
-- Constraints for table `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `users_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `roles` (`role_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
