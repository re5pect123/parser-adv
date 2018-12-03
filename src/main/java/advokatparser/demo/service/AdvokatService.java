package advokatparser.demo.service;

import advokatparser.demo.entity.Advokat;
import advokatparser.demo.repository.AdvokatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdvokatService {

    @Autowired
    AdvokatRepository advokatRepository;

    public void saveAdvokat(Advokat advokat){
        advokatRepository.save(advokat);
    }
}
