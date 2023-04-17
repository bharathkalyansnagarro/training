import React from 'react'
import { Link } from 'react-router-dom'

const Navbar = () => {
    return (

        <div className="flex items-center bg-gray-400 border-b-8 rounded-lg border-red-600 p-4 m-4">
            <Link className="nav-item text-3xl justify-start" to={""}>Blog App</Link>
            <div className="ml-auto">
                <Link className="nav-item m-2 font-semibold" to={""}>Home</Link>
                <Link className="nav-item m-2 font-semibold" to={"/addPost"}>Add Post</Link>
            </div>
        </div>
    )
}

export default Navbar