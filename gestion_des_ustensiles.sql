-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : Dim 20 déc. 2020 à 22:49
-- Version du serveur :  10.4.11-MariaDB
-- Version de PHP : 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `gestion des ustensiles`
--

-- --------------------------------------------------------

--
-- Structure de la table `assietecarree`
--

CREATE TABLE `assietecarree` (
  `id` int(11) NOT NULL,
  `annee` int(11) NOT NULL,
  `cote` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `assietecarree`
--

INSERT INTO `assietecarree` (`id`, `annee`, `cote`) VALUES
(1, 1980, 120.1),
(2, 1980, 60.32),
(3, 1960, 23),
(4, 1960, 22.98),
(5, 1959, 23.4),
(6, 1958, 129.2);

-- --------------------------------------------------------

--
-- Structure de la table `assieteronde`
--

CREATE TABLE `assieteronde` (
  `id` int(11) NOT NULL,
  `annee` int(11) NOT NULL,
  `rayon` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `assieteronde`
--

INSERT INTO `assieteronde` (`id`, `annee`, `rayon`) VALUES
(1, 1970, 120.1),
(2, 1980, 50.23),
(3, 1960, 10.1),
(4, 1960, 50.23),
(5, 1958, 12.8);

-- --------------------------------------------------------

--
-- Structure de la table `cuilliere`
--

CREATE TABLE `cuilliere` (
  `id` int(11) NOT NULL,
  `annee` int(11) NOT NULL,
  `longueur` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `cuilliere`
--

INSERT INTO `cuilliere` (`id`, `annee`, `longueur`) VALUES
(1, 1959, 122),
(2, 1960, 34),
(3, 1970, 33.25),
(4, 1957, 19.2);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `assietecarree`
--
ALTER TABLE `assietecarree`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `assieteronde`
--
ALTER TABLE `assieteronde`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `cuilliere`
--
ALTER TABLE `cuilliere`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `assietecarree`
--
ALTER TABLE `assietecarree`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `assieteronde`
--
ALTER TABLE `assieteronde`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pour la table `cuilliere`
--
ALTER TABLE `cuilliere`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
