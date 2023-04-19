import React from 'react'
import { Route, Routes } from 'react-router-dom'
import Post from './Post'
import AddPost from './AddPost'
import EditPost from './EditPost'
import DetailsPost from './DetailsPost'



const Home = () => {
    return (
        <div className="flex flex-col flex-grow m-4 p-4 border-2 rounded-lg border-yellow-400">
            <Routes>
                <Route path="" element={<Post />}></Route>
                <Route path="addPost" element={<AddPost />}></Route>
                <Route path="editPost" element={<EditPost />}></Route>
                <Route path="detailsPost" element={<DetailsPost />}></Route>
            </Routes>
        </div>
    )
}

export default Home