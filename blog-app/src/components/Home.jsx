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
                "Next JS is a popular React based Frontend Framework that helps us in building Godmode application."
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
        }, {
            id: 4,
            title: "Learning Next JS 🚀",
            description:
                "Next JS is a popular React based Frontend Framework that helps us in building Godmode application. ",
        },
        {
            id: 5,
            title: "Learning React JS ⚛️",
            description:
                "React JS is a popular React based Frontend Framework that helps us in building Godmode application. ",
        },
        {
            id: 6,
            title: "Learning Node JS 🚀",
            description:
                "Node JS is a popular Backend Framework that helps us in building Godmode application. ",
        }, {
            id: 7,
            title: "Learning Next JS 🚀",
            description:
                "Next JS is a popular React based Frontend Framework that helps us in building Godmode application. ",
        },
        {
            id: 8,
            title: "Learning React JS ⚛️",
            description:
                "React JS is a popular React based Frontend Framework that helps us in building Godmode application. ",
        },
        {
            id: 9,
            title: "Learning Node JS 🚀",
            description:
                "Node JS is a popular Backend Framework that helps us in building Godmode application. ",
        },
        {
            id: 10,
            title: "Learning Next JS 🚀",
            description:
                "Next JS is a popular React based Frontend Framework that helps us in building Godmode application. ",
        },
        {
            id: 11,
            title: "Learning React JS ⚛️",
            description:
                "React JS is a popular React based Frontend Framework that helps us in building Godmode application. ",
        },
        {
            id: 12,
            title: "Learning Node JS 🚀",
            description:
                "Node JS is a popular Backend Framework that helps us in building Godmode application. ",
        }, {
            id: 13,
            title: "Learning Next JS 🚀",
            description:
                "Next JS is a popular React based Frontend Framework that helps us in building Godmode application. ",
        },
        {
            id: 14,
            title: "Learning React JS ⚛️",
            description:
                "React JS is a popular React based Frontend Framework that helps us in building Godmode application. ",
        },
        {
            id: 15,
            title: "Learning Node JS 🚀",
            description:
                "Node JS is a popular Backend Framework that helps us in building Godmode application. ",
        }, {
            id: 16,
            title: "Learning Next JS 🚀",
            description:
                "Next JS is a popular React based Frontend Framework that helps us in building Godmode application. ",
        },
        {
            id: 17,
            title: "Learning React JS ⚛️",
            description:
                "React JS is a popular React based Frontend Framework that helps us in building Godmode application. ",
        },
        {
            id: 18,
            title: "Learning Node JS 🚀",
            description:
                "Node JS is a popular Backend Framework that helps us in building Godmode application. ",
        }
    ]);
    const [counter, setCounter] = useState(100);

    const add = (childData) => {
        childData.id = counter;
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
