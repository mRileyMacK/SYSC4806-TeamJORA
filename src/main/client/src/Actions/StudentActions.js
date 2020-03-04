import axios from 'axios';

export const CREATE_NEW_STUDENT = "CREATE_NEW_STUDENT";
export const ERROR_NEW_STUDENT = "ERROR_NEW_STUDENT";
export const EDIT_STUDENT = "EDIT_STUDENT";
export const START_FETCH_STUDENT = "START_FETCH_STUDENT";
export const SUCCESS_FETCH_STUDENT = "SUCCESS_FETCH_STUDENT";
export const PENDING_FETCH_STUDENT = "PENDING_FETCH_STUDENT";

export const startFetchStudent = {
    type: START_FETCH_STUDENT,
}

export const successFetchStudent = data => ({
    type: SUCCESS_FETCH_STUDENT,
    data,
});

export const fetchStudent = {};
// export const fetchStudent = () => {
//   return dispatch => {
//     dispatch(startFetchStudent);
//     axios.get("http://localhost:3001/students")
//       .then(res => {
//         const new_data = res.data.students;
//         dispatch(successFetchStudent(new_data));
//       })
//       .catch(err => console.log(err));
// }}

export function errorNewStudent(error) {
    return {
        type: ERROR_NEW_STUDENT,
        error,
    };
}

export function editStudent(student) {
  return {
    type: EDIT_STUDENT,
    student,
  }
}

export function createNewStudent() {
    return {
        type: CREATE_NEW_STUDENT,
    };
};