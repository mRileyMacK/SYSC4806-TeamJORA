package Controller;

import Model.Student;
import Model.Group;
import Model.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping(value = "/students")
    public String getStudent(@RequestParam("studentID") String studentName, @RequestParam("studentNum") int studentNum,
                             @RequestParam("Group") Group group, Model model) {
        model.addAttribute(new Student(studentName, studentNum, group));
        return "Student";
    }

    @PostMapping(value = "/students")
    public String addStudent(@ModelAttribute Student student) {
        studentRepository.save(student);

        return "Student";
    }
}
