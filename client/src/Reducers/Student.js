import {
  CREATE_NEW_STUDENT,
  EDIT_STUDENT,
  SUCCESS_FETCH_STUDENT
} from "../Actions/StudentActions";
import axios from "axios";

const data = [
  { id: 1, studentNum: 101002937, name: 'Andrew Vicencio', group: 1 },
  { id: 2, studentNum: 101002938, name: 'Andrew Vicencio', group: 2 },
  { id: 3, studentNum: 101002939, name: 'Andrew Vicencio', group: 1 },
];

const initState = {
  data,
};

export default function students(state = initState, action) {
  switch (action.type) {
    case SUCCESS_FETCH_STUDENT:
      return {
        ...state,
        data: action.data
      }
    case CREATE_NEW_STUDENT:
      return { 
        ...state, 
        data: state.data.concat(
          { 
            id: state.data.length + 1, 
            studentNum: 0, 
            name: "Enter Student Name", 
            group: 0
          }) 
      };
    case EDIT_STUDENT:
      console.log(action.student);
      axios.post("http://localhost:3001/students", action.student)
        .then(res => console.log(res))
        .catch(err => console.log(err));
      
      const newData = state.data.filter(student => {
        return student.studentNum !== action.student.studentNum
      });
      newData.push(action.student);

      return {
        ...state,
        data: newData,
      }
    default:
      return state;
  }
}
