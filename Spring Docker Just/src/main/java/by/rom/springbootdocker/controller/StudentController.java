package by.rom.springbootdocker.controller;

import by.rom.springbootdocker.exception.NotFoundException;
import by.rom.springbootdocker.model.Student;
import by.rom.springbootdocker.repository.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    private final StudentRepository repository;

    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student){
        return repository.save(student);
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> findAll(){
        return ResponseEntity.ok().body(repository.findAll());
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> findById(@PathVariable Long id){
        Student student = repository
                .findById(id)
                .orElseThrow(()-> new NotFoundException("Student not found"));

        return ResponseEntity.ok().body(student);
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        repository.findById(id).ifPresentOrElse(
                student -> repository.deleteById(id),
                ()->{
                    throw new NotFoundException("Student not found");
                }
        );
        return new ResponseEntity<>("Delete was successful", HttpStatus.OK);
    }


}
