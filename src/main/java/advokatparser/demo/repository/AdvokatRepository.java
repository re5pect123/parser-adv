package advokatparser.demo.repository;

import advokatparser.demo.entity.Advokat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvokatRepository extends JpaRepository<Advokat, Integer>{
}
