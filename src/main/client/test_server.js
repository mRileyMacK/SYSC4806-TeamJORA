const express = require("express");
const app = express();
const cors = require("cors");
const bodyParser = require("body-parser");

app.use(cors());
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

app.get("/students", (req, res) => {
  const students = {
    students: [
      {
        id: "123asd132asd3254",
        name: "Jack",
        studentNum: "1236467689",
        group: 3
      },
      {
        id: "123asd132asd3252",
        name: "Riley",
        studentNum: "1236457689",
        group: 3
      },
      {
        id: "123asd132asd3253",
        name: "Logan",
        studentNum: "1236456689",
        group: 3
      }
    ]
  }
  // const students = {
  //   hello: "world"
  // }
  console.log("Sending students", students);
  res.status(200).json(students);
});

app.post("/students", (req, res) => {
  console.log("/student", req.body);
  res.status(200).send("ok");
});
app.listen(3001, () => console.log("Server listening..."));
