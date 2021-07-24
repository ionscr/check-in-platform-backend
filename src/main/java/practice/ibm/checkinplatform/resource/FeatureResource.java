package practice.ibm.checkinplatform.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import practice.ibm.checkinplatform.model.Classroom;
import practice.ibm.checkinplatform.model.Feature;
import practice.ibm.checkinplatform.service.FeatureService;


import java.util.List;

@RestController
@RequestMapping("/feature")
public class FeatureResource {
    private final FeatureService featureService;

    public FeatureResource(FeatureService featureService){
        this.featureService = featureService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Feature>> getAllFeatures(){
        List<Feature> features =featureService.findAllFeatures();
        return new ResponseEntity<>(features, HttpStatus.OK);
    }
    @GetMapping("/classroom/{id}")
    public ResponseEntity<List<Feature>> getFeaturesByClassroom(@RequestBody Classroom classroom) {
        List<Feature> features = featureService.findFeaturesByClassroom(classroom);
        return new ResponseEntity<>(features, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Feature> addFeature(@RequestBody Feature feature) {
        Feature newFeature = featureService.addFeature(feature);
        return new ResponseEntity<>(newFeature, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Feature> updateFeature(@RequestBody Feature feature) {
        Feature updateFeature = featureService.updateFeature(feature);
        return new ResponseEntity<>(updateFeature, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteFeature(@PathVariable("id") Long id) {
        featureService.deleteFeatureById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
