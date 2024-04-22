package gr.accenture.demo;

import gr.accenture.demo.models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class Controller {

    @GetMapping
    public List<Student> getAllStudents(){
        return List.of(new Student(1,"Nikos","Nik"),new Student(2,"Vaso","Koupe"));
    }
}
