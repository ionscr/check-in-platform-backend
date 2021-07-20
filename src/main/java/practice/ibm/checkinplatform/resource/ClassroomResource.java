package practice.ibm.checkinplatform.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import practice.ibm.checkinplatform.model.Classroom;
import practice.ibm.checkinplatform.service.ClassroomService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/classroom")
public class ClassroomResource {
    private final ClassroomService classroomService;

    public ClassroomResource(ClassroomService classroomService){
        this.classroomService = classroomService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Classroom>> getAllClassrooms(){
        List<Classroom> classrooms =classroomService.findAllClassrooms();
        return new ResponseEntity<>(classrooms, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Classroom> addClassroom(@RequestBody Classroom classroom) {
        Classroom newClassroom = classroomService.addClassroom(classroom);
        return new ResponseEntity<>(newClassroom, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Classroom> updateClassroom(@RequestBody Classroom classroom) {
        Classroom updateClassroom = classroomService.updateClassroom(classroom);
        return new ResponseEntity<>(updateClassroom, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteClassroom(@PathVariable("id") Long id) {
        classroomService.deleteClassroomById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
