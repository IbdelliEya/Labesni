Eya Ibdelli 2IM2 eya.ibdelli@gmail.com  
Aya Taboubi 2IM2 ayataboubi70@gmail.com

===============================
Application Android Boutique en Ligne
===============================

Présentation :
---------------
Il s'agit d'une application mobile simple de boutique en ligne développée en Java avec Firebase via Android Studio. L'application permet aux utilisateurs de consulter, ajouter et gérer des produits, ainsi que de passer des commandes directement depuis leur appareil Android.

Fonctionnalités principales :
-------------------------------
- Système d'inscription et de connexion des utilisateurs via Firebase Authentication.
- Page de liste des produits affichant les articles disponibles avec image, nom, prix et description.
- Espace administrateur pour ajouter, modifier et supprimer des produits.
- Gestion des données en temps réel avec Firebase Realtime Database.
- Téléchargement et stockage des images via Firebase Storage.
- Fonctionnalité de panier permettant aux utilisateurs de sélectionner plusieurs articles avant de passer commande.
- Système de gestion des commandes avec historique.

Technologies utilisées :
-------------------------
- Java (Android SDK)
- Firebase Authentication
- Firebase Realtime Database
- Firebase Storage
- Android Studio

Installation :
---------------
1. Cloner ou télécharger les fichiers du projet.
2. Ouvrir le projet avec Android Studio.
3. Connecter votre application à Firebase via Android Studio (Outils > Firebase).
4. Configurer Firebase Authentication, Realtime Database et Storage.
5. Remplacer le fichier `google-services.json` par celui de votre propre projet Firebase.
6. Compiler et exécuter l’application sur un émulateur Android ou un appareil physique.

Remarques :
------------
- Veillez à activer l'authentification Email/Mot de passe dans la console Firebase.
- Créez un nœud `Products` dans votre Realtime Database pour stocker les informations des produits.
- Des autorisations de stockage peuvent être nécessaires pour le téléchargement des images.
- Testé sur Android Studio Giraffe (ou version ultérieure) avec API Android niveau 30+.

Licence :
----------
Ce projet est destiné à un usage personnel et éducatif. N’hésitez pas à le modifier et à l’adapter pour vos propres projets.

