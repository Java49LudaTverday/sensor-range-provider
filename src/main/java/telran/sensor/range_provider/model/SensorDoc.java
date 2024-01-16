package telran.sensor.range_provider.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import telran.sensor.range_provider.dto.Range;

@Document(collection="sensors")
@NoArgsConstructor
@Getter
public class SensorDoc {
	@Id
    long id;
	Range values;
}
