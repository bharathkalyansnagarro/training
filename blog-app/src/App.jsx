import { BrowserRouter, Route, Routes } from "react-router-dom"
import "./App.css"
import Navbar from "./components/Navbar"
import Home from "./components/Home"

function App() {

  return (
    <div className="min-h-screen">
      <div className="bg-yellow-200 p-2">
        <BrowserRouter>
          <Navbar />
          <Routes>
            <Route path="/*" element={<Home />}></Route>
          </Routes>
        </BrowserRouter>
      </div>
    </div>
  )
}

export default App
