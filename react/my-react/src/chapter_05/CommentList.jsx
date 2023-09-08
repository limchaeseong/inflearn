import React from "react";
import Comment from "./Comment";

const comments = [
    {
        name: "임채성",
        comment: "안녕하세요! 임채성입니다."
    },
    {
        name: "오유빈",
        comment: "안녕하세요! 오유빈입니다."
    },
    {
        name: "정한별",
        comment: "안녕하세요! 정한별입니다."
    },
    {
        name: "김건홍",
        comment: "안녕하세요! 김건홍입니다."
    },
    {
        name: "김민지",
        comment: "안녕하세요! 김민지입니다."
    },
]

function CommentList(props){
    return(
        <div>
            {comments.map((comment)=>{
                return(
                    <Comment name={comment.name} comment={comment.comment} />
                );
            })}
        </div>
    );
}

export default CommentList;