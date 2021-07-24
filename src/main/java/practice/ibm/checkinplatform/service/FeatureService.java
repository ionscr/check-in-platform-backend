package practice.ibm.checkinplatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.ibm.checkinplatform.model.Classroom;
import practice.ibm.checkinplatform.model.Feature;
import practice.ibm.checkinplatform.repository.FeatureRepository;


import java.util.List;

@Service
public class FeatureService {
    private final FeatureRepository featureRepository;

    @Autowired
    public FeatureService(FeatureRepository featureRepository) {
       this.featureRepository = featureRepository;
    }

    public Feature addFeature(Feature feature) {
        return featureRepository.save(feature);
    }

    public List<Feature> findAllFeatures() {
        return featureRepository.findAll();
    }

    public Feature updateFeature(Feature feature) {
        return featureRepository.save(feature);
    }

    public List<Feature> findFeaturesByClassroom(Classroom classroom) {
        return featureRepository.findFeaturesByClassroom(classroom);
    }
}
