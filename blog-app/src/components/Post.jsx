import React from 'react'
import { useSelector } from 'react-redux'
import { selectAllBlogs } from '../features/blogsSlice';

const Post = () => {
    const blogs = useSelector(selectAllBlogs);

    const renderedBlogs = blogs.map((blog, idx) => (
        <div key={idx} className="max-w-sm rounded overflow-hidden shadow-xl bg-gray-200 m-2">
            <div className="px-6 py-4">
                <div className="font-bold text-xl mb-2">{blog.title}</div>
                <p className="text-gray-700 text-base">
                    {blog.description}
                </p>
            </div>
        </div>
    ))

    return (
        <div className="grid grid-cols-3">
            {renderedBlogs}
        </div>
    )
}

export default Post