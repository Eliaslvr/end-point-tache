import React, { useState } from "react";
import axios from "axios";
import "../assets/AddUser.css"

function AddUser({ onUserAdded }) {
  const [name, setName] = useState("");
  const [tache, setTache] = useState("");

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      await axios.post("http://localhost:8080//tasks/add", { name, tache });
      setName("");
      setTache("");
      onUserAdded(); // rafraîchit la liste
    } catch (err) {
      console.error("Erreur d'ajout :", err);
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <h2>Ajouter une tâche</h2>
      <input id="name"
        placeholder="Nom"
        value={name}
        onChange={(e) => setName(e.target.value)}
      />
      <input id="tache"
        placeholder="Tache"
        value={tache}
        onChange={(e) => setTache(e.target.value)}
      />
      <button type="submit">Ajouter</button>
    </form>
  );
}

export default AddUser;
