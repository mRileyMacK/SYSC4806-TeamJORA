import React, { Component } from 'react'
import './App.css';
import StudentTable from './StudentTable';
import { connect } from 'react-redux';

class App extends Component {

  updateData = data => this.setState({data: this.state.data.concat(data)});

  render() {
    return (
      <div>
        <StudentTable updateData={this.updateData}/>
      </div>
    )
  }
}

const mapStateToProps = state => ({
  data: state.data,
  columns: state.colums
});

export default connect(mapStateToProps)(App);