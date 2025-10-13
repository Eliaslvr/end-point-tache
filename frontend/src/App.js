import React from "react";
import UserList from "./components/UserList";
import AddUser from "./components/AddUser";

function App() {
  const [refresh, setRefresh] = React.useState(false);

  const handleUserAdded = () => setRefresh(!refresh);

  return (
    <div className="App">
      <AddUser onUserAdded={handleUserAdded} />
      <UserList key={refresh} />
    </div>
  );
}

export default App;
