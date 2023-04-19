import React from 'react'
import { useSelector } from 'react-redux'
import { selectAllBlogs } from '../features/blogsSlice';

const Post = () => {
    const blogs = useSelector(selectAllBlogs);

    const renderedBlogs = blogs.map((blog, idx) => (
        <article key={idx} className="bg-gray-200 m-4 p-6 border-2 rounded-lg border-orange-600">
            <h2>{blog.title}</h2>
            <p>{blog.description}</p>
        </article>
    ));

    return (
        <>
            <h2>Blogs</h2>
            {renderedBlogs}
        </>
    )
}

export default Post