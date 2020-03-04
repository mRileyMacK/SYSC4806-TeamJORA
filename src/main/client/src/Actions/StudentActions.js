// import axios from 'axios';

export const CREATE_NEW_STUDENT = "CREATE_NEW_STUDENT";
export const ERROR_NEW_STUDENT = "ERROR_NEW_STUDENT";
export const EDIT_STUDENT = "EDIT_STUDENT";
export const START_FETCH_STUDENT = "START_FETCH_STUDENT";
export const SUCCESS_FETCH_STUDENT = "SUCCESS_FETCH_STUDENT";
export const PENDING_FETCH_STUDENT = "PENDING_FETCH_STUDENT";

export const startFetchStudent = {
  type: START_FETCH_STUDENT
};

export const successFetchStudent = data => {
  const action = {
    type: SUCCESS_FETCH_STUDENT,
    data
  };
  console.log(action);
  return action;
};

export const fetchStudent = data => {
  return {
    type: PENDING_FETCH_STUDENT,
    data
  };
};

export function errorNewStudent(error) {
  return {
    type: ERROR_NEW_STUDENT,
    error
  };
}

export function editStudent(student) {
  return {
    type: EDIT_STUDENT,
    student
  };
}

export function createNewStudent() {
  return {
    type: CREATE_NEW_STUDENT
  };
}
