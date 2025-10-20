import React, { useState } from "react";
import axios from "axios";
import "../assets/AddUser.css"

function AddUser({ onUserAdded }) {
  const [name, setName] = useState("");
  const [description, setDescription] = useState("");

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      await axios.put("http://localhost:8080/tasks/add", { name, description });
      setName("");
      setDescription("");
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
        placeholder="Task"
        value={description}
        onChange={(e) => setDescription(e.target.value)}
      />
      <button type="submit">Ajouter</button>
    </form>
  );
}

export default AddUser;
