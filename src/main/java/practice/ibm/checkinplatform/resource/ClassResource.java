package practice.ibm.checkinplatform.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import practice.ibm.checkinplatform.service.ClassService;
import practice.ibm.checkinplatform.model.Class;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/class")
public class ClassResource {
    private final ClassService classService;

    public ClassResource(ClassService classService){
        this.classService = classService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Class>> getAllClasses(){
        List<Class> classes =classService.findAllClasses();
        return new ResponseEntity<>(classes, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Class> addClass(@RequestBody Class class1) {
        Class newClass = classService.addClass(class1);
        return new ResponseEntity<>(newClass, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Class> updateClass(@RequestBody Class class1) {
        Class updateClass = classService.updateClass(class1);
        return new ResponseEntity<>(updateClass, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteClass(@PathVariable("id") Long id) {
        classService.deleteClassById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
