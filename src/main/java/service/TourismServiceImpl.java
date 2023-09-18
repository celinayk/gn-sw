package service;

import entity.TourismEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TourismRepository;

@Service
public class TourismServiceImpl implements TourismService{

    @Autowired
    private TourismRepository tourismRepository;

    @Override
    public void saveTourism(TourismEntity tourismEntity) {
        tourismRepository.save(tourismEntity);
    }
}
