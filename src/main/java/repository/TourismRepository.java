package repository;
import entity.TourismEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourismRepository extends JpaRepository<TourismEntity, Long>{
}
