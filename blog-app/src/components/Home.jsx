import React, { createContext, useState } from "react";
import { Route, Routes } from "react-router-dom";
import Post from "./Post";
import AddPost from "./AddPost";
import EditPost from "./EditPost";
import DetailsPost from "./DetailsPost";
import ErrorPage from "./ErrorPage";

const UserContext = createContext();

const Home = () => {
    const [data, setData] = useState([
        {
            id: 1,
            title: "Learning Next JS 🚀",
            description:
                "Next.js is an open-source web development framework created by the private company Vercel providing React-based web applications with server-side rendering and static website generation.",
        },
        {
            id: 2,
            title: "Learning React JS ⚛️",
            description:
                "React JS is a popular React based Frontend Framework that helps us in building Godmode application. ",
        },
        {
            id: 3,
            title: "Learning Node JS 🚀",
            description:
                "Node JS is a popular Backend Framework that helps us in building Godmode application. ",
        },
        {
            id: 4,
            title: "Learning Tailwind CSS 🚀",
            description:
                "Tailwind CSS is an open source CSS framework. The main feature of this library is that, unlike other CSS frameworks like Bootstrap, it does not provide a series of predefined classes for elements such as buttons or tables.",
        },
        {
            id: 5,
            title: "Learning Mongo DB 📅",
            description:
                "MongoDB is a source-available cross-platform document-oriented database program. Classified as a NoSQL database program, MongoDB uses JSON-like documents with optional schemas. MongoDB is developed by MongoDB Inc. and licensed under the Server Side Public License which is deemed non-free by several distributions",
        },
        {
            id: 6,
            title: "Learning GraphQL 📊",
            description:
                "GraphQL is an open-source data query and manipulation language for APIs and a query runtime engine. GraphQL enables declarative data fetching where a client can specify exactly what data it needs from an API",
        },
    ]);
    const [counter, setCounter] = useState(100);

    const add = (childData) => {
        childData.id = counter;
        setCounter(counter + 1);
        const tempArray = data;
        tempArray.push(childData);
        setData(tempArray);
    };

    return (
        <div className="flex flex-col flex-grow m-4 p-4 border-2 rounded-lg border-yellow-400">
            <UserContext.Provider value={{ data, setData }}>
                <Routes>
                    <Route path="" element={<Post />}></Route>
                    <Route path="addPost" element={<AddPost func={add} />}></Route>
                    <Route path="editPost" element={<EditPost />}></Route>
                    <Route path="detailsPost" element={<DetailsPost />}></Route>
                    <Route path="/*" element={<ErrorPage />}></Route>
                </Routes>
            </UserContext.Provider>
        </div>
    );
};

export default Home;
export { UserContext };
