import React from 'react'
import { useSelector } from 'react-redux'
import { selectAllBlogs } from '../features/blogsSlice';
import PostCard from './PostCard';

const Post = () => {
    const blogs = useSelector(selectAllBlogs);

    return (
        <div className="grid grid-cols-3">
            {blogs.map((blog) => (
                <PostCard blog={blog} />
            ))}
        </div>
    )
}

export default Post