import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
// import App from './App';
import reportWebVitals from './reportWebVitals';

// import Item from './chapter_03/Library';
// import Item from './chapter_04/Clock';
// import Item from "./chapter_05/CommentList";
// import Item from "./chapter_06/NotificationList";
// import Item from "./chapter_07/Accommodate";
// import Item from "./chapter_08/ConfirmButton";
// import Item from "./chapter_09/LandingPage";
// import Item from "./chapter_10/AttendanceBook";
// import Item from "./chapter_11/SignUp";
import Item from "./chapter_15/Block";

const root = ReactDOM.createRoot(document.getElementById('root'));

// ====chapter4=====
// setInterval(()=>{

// ====chapter3 ~ 16=====
    root.render(
        <Item />
    );

// ====chapter4=====
// }, 1000);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
