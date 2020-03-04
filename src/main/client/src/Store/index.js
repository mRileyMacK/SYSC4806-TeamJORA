import { createStore } from 'redux';
import students from '../Reducers/Student';

export const store = createStore(students, window.__REDUX_DEVTOOLS_EXTENSION__ && window.__REDUX_DEVTOOLS_EXTENSION__());