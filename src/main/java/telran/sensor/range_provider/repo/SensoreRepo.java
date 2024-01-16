package telran.sensor.range_provider.repo;

import telran.sensor.range_provider.dto.Range;
import telran.sensor.range_provider.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SensoreRepo extends MongoRepository<SensorDoc, Long> {
	Range findById(long id);

}
