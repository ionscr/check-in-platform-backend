package practice.ibm.checkinplatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.ibm.checkinplatform.model.Class;
import practice.ibm.checkinplatform.model.Classroom;
import practice.ibm.checkinplatform.repository.ClassRepository;
import practice.ibm.checkinplatform.repository.ClassroomRepository;

import java.util.List;

@Service
public class ClassroomService {
    private final ClassroomRepository classroomRepository;

    @Autowired
    public ClassroomService(ClassroomRepository classroomRepository) {
        this.classroomRepository = classroomRepository;
    }

    public Classroom addClassroom(Classroom classroom) {
        return classroomRepository.save(classroom);
    }

    public List<Classroom> findAllClassrooms() {
        return classroomRepository.findAll();
    }

    public Classroom updateClassroom(Classroom classroom) {
        return classroomRepository.save(classroom);
    }

    public void deleteClassroomById(Long id) { classroomRepository.deleteClassroomById(id);}
}
