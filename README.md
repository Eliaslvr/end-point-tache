# ✅ Application de gestion de tâches

## 🎯 Ma mission

Développer une application web permettant aux utilisateurs de **créer, visualiser et supprimer des tâches**, avec une communication efficace entre le frontend et le backend.

---

## 🧰 Technologies utilisées

### 🔹 Backend

* **Java** avec **Spring Boot**
* **API REST** pour la communication avec le frontend
* **PostgreSQL** pour la gestion des données

### 🔹 Frontend

* **React**
* **Fetch API** et **Axios** pour les requêtes HTTP
* HTML / CSS

---

## 💡 Le projet

Cette application web permet de gérer facilement ses tâches quotidiennes.
Les utilisateurs peuvent :

* **Ajouter** de nouvelles tâches
* **Visualiser** la liste complète des tâches
* **Supprimer** des tâches existantes

L’architecture du projet sépare le frontend React du backend Java/Spring Boot pour garantir une **communication API REST fluide** et une **maintenance simplifiée**.

---

## 📄 Fonctionnalités principales

* **CRUD minimal** : création, lecture et suppression des tâches
* Interface simple et intuitive
* Communication **front-end ↔ back-end** via API REST
* Base de données PostgreSQL pour stocker les tâches

---

## ⚙️ Installation & démarrage

### 1️⃣ Cloner le dépôt

```bash
git clone <https://github.com/Eliaslvr/end-point-tache.git>
```

### 2️⃣ Backend

```bash
cd service
# Installer les dépendances Maven ou Gradle
./mvn clean install
# Lancer le backend
./mvn spring-boot:run
```

### 3️⃣ Frontend

```bash
cd web-client
npm install
npm start
```

* Le frontend s’exécute sur **[http://localhost:3000](http://localhost:3000)**
* Le backend sur **[http://localhost:8080](http://localhost:8080)** 

---

## 🏁 Objectif final

Créer une application complète et maintenable permettant de **gérer efficacement ses tâches**, avec une architecture **front-back moderne** et une communication **RESTful**.

