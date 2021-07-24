package practice.ibm.checkinplatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.ibm.checkinplatform.model.User;
import practice.ibm.checkinplatform.repository.ClassRepository;
import practice.ibm.checkinplatform.repository.UserRepository;
import practice.ibm.checkinplatform.model.Class;

import java.time.LocalDate;
import java.util.List;

@Service
public class ClassService {
    private final ClassRepository classRepository;

    @Autowired
    public ClassService(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }

    public Class addClass(Class class1) {
        return classRepository.save(class1);
    }

    public List<Class> findAllClasses() {
        return classRepository.findAll();
    }

    public Class updateClass(Class class1) {
        return classRepository.save(class1);
    }

    public void deleteClassById(Long id){
        classRepository.deleteClassById(id);
    }
}
