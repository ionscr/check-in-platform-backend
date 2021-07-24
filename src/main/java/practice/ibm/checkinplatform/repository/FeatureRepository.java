package practice.ibm.checkinplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practice.ibm.checkinplatform.model.Classroom;
import practice.ibm.checkinplatform.model.Feature;

import java.util.List;

@Repository
public interface FeatureRepository extends JpaRepository<Feature, Long> {
    void deleteFeatureById(Long id);
    List<Feature> findFeaturesByClassroom(Classroom classroom);
}
