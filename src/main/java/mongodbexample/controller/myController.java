package mongodbexample.controller;


import mongodbexample.models.Student;
import mongodbexample.rep.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class myController {
    @Autowired
    private StudentRepository studentRepository;
    @PostMapping("/")
    public ResponseEntity<?> addStudent(@RequestBody Student student){
        Student save = this.studentRepository.save(student);
        return ResponseEntity.ok(save);
    }

    @GetMapping("/")
    public ResponseEntity<?> getStudent(){
        return ResponseEntity.ok(this.studentRepository.findAll());
    }



}
