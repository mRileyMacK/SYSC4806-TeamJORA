package Controller;

import Model.Student;
import Model.Group;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GroupController {
    private Group group = new Group("classroom", 5);

    @GetMapping(value = "/addStudent")
    public String getStudent(@RequestParam("studentID") String studentName, @RequestParam("studentID") int studentID, Model model) {
        model.addAttribute(new Student(studentName, studentID));
        return "addStudent";
    }

    @PostMapping(value = "/addStudent")
    public String addStudent(@ModelAttribute Student student) {
        group.addStudent(student);
        return "viewGroup";
    }

}