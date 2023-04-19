import { nanoid } from '@reduxjs/toolkit'
import React from 'react'
import { useNavigate } from 'react-router-dom'
import { selectAllBlogs } from '../features/blogsSlice'
import { useSelector } from 'react-redux'

const PostCard = ({ blog }) => {

    const blogs = useSelector(selectAllBlogs);
    const navigate = useNavigate();

    return (
        <div className="myBlog">
            <div key={nanoid} className="max-w-sm h-fit rounded overflow-hidden shadow-xl bg-gray-200 m-2">
                <div className="px-6 py-4">
                    <div className="font-bold text-xl mb-2">{blog.title}</div>
                    <p className="text-gray-700 text-base">
                        {blog.description}
                    </p>
                </div>
                <div className="flex flex-row justify-center">
                    <button className="rounded-lg bg-yellow-300 p-2  m-2">Edit</button>
                    <button className="rounded-lg bg-yellow-300 p-2 px-4 m-2">View</button>
                    <button className="rounded-lg bg-yellow-300 p-2  px-4 m-2">Delete</button>
                </div>
            </div>
        </div>
    )
}

export default PostCard