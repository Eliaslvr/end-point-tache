import React, { useEffect, useState } from "react";
import axios from "axios";
import "../assets/UserList.css"

function UserList() {
  const [users, setUsers] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8080/tasks")
      .then(response => setUsers(response.data))
      .catch(error => console.error("Erreur de chargement :", error));
  }, []);

  const fetchUsers = () => {
    axios
      .get("http://localhost:8080/tasks")
      .then((response) => setUsers(response.data))
      .catch((error) => console.error("Erreur de chargement :", error));
  };

  useEffect(() => {
    fetchUsers();
  }, []);


  const handleDelete = async (id) => {
    if (window.confirm("Voulez-vous vraiment supprimer cette tâche ?")) {
        try {
          await axios.delete(`http://localhost:8080/tasks/${id}`);
          fetchUsers(); // rafraîchir la liste
        } catch (err) {
          console.error("Erreur de suppression :", err);
        }
      }
  }

  return (
    <div className="list">
      <h1>Liste des tâches</h1>
      <ul>
        {users.map(u => (
          <li key={u.id}>
            {u.name} — {u.description}
            <button className="delete-btn" onClick={() => handleDelete(u.id)}>
              Supprimer
            </button>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default UserList;
