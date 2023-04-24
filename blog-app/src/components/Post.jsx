import React from 'react'
import { useSelector } from 'react-redux'
import { selectAllBlogs } from '../features/blogsSlice';
import PostCard from './PostCard';
import { useContext } from 'react';
import { UserContext } from './Home';

const Post = () => {
    const data = useContext(UserContext);
    //const blogs = useSelector(selectAllBlogs);

    return (
        <div className="grid grid-cols-3">
            {data.data.map((blog) => (
                <PostCard blog={blog} />
            ))}
        </div>
    )
}

export default Post