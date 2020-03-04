import React, { Component } from "react";
import DataTable from "react-data-table-component";
import { Button, Input } from "reactstrap";
import actions from "../Actions";
import { connect } from "react-redux";
import { store } from "../Store";
// import { devStudentEndPoint, prodStudentEndPoint } from '../Constant/config';
import axios from "axios";

const { createNewStudent, editStudent, successFetchStudent } = actions;

const StudentColumns = [
  {
    name: "Group",
    selector: "group",
    sortable: true,
    cell: row => {
      let group = row.group ? row.group : 0;
      return (
        <Input
          placeholder={`${group}`}
          onChange={e => {
            row.group = e.target.value;
          }}
        />
      );
    }
  },
  {
    name: "Student Number",
    selector: "studentNum",
    sortable: true,
    cell: row => {
      let num = row.studentNum ? row.studentNum : 0;
      return (
        <Input
          placeholder={`${num}`}
          onChange={e => {
            row.studentNum = e.target.value;
          }}
        />
      );
    }
  },
  {
    name: "Name",
    selector: "name",
    sortable: true,
    cell: row => {
      let name = row.name ? row.name : "John Doe";
      return (
        <Input
          placeholder={`${name}`}
          onChange={e => {
            row.name = e.target.value;
          }}
        />
      );
    }
  },
  {
    cell: row => {
      return (
        <Button onClick={event => store.dispatch(editStudent(row))}>
          {" "}
          edit{" "}
        </Button>
      );
    }
  }
];

class StudentTable extends Component {
  constructor(props) {
    super(props);
    this.timer = null;

    const columns = props.columns ? props.columns : StudentColumns;
    this.state = {
      data: props.data,
      columns
    };
  }

  addNewStudent = data => {
    this.props.createNewStudent(
      this.state.data.concat({ ...data, index: this.state.data.length + 1 })
    );
  };

  componentDidMount() {
    console.log(this.props);
    axios
      .get("http://localhost:3001/students")
      .then(res => {
        console.log(res.data.students);
        return res.data.students;
      })
      .then(data => {
        this.props.successFetchStudent(data);
      })
      .catch(err => console.log(err));
    console.log(this.props);
    // this.timer = setInterval(this.fetchStudent, 5000);
  }

  render() {
    return (
      <div>
        <DataTable
          defaultSortField="group"
          title="Students"
          columns={this.state.columns}
          data={this.props.data}
          actions={
            <Button onClick={this.addNewStudent}>Add New Student</Button>
          }
        />
      </div>
    );
  }
}

const mapStateToProps = state => ({
  data: state.data
});

// const mapDispatchToProps = dispatch => ({
//   fetchStudent: () => dispatch(fetchStudent()),
//   createNewStudent: () => dispatch(createNewStudent()),
// });

export default connect(mapStateToProps, {
  successFetchStudent,
  createNewStudent
})(StudentTable);
