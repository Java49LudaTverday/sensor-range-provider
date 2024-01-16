package telran.sensor.range_provider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import telran.sensor.range_provider.dto.Range;
import telran.sensor.range_provider.exceptions.SensorNotFoundException;
import telran.sensor.range_provider.repo.SensoreRepo;

@Service
@Slf4j
@RequiredArgsConstructor
public class SensorRangeProviderServiceImpl implements SensorRangeProviderService {

	final SensoreRepo sensorRepo;

	@Override
	public Range getRangeSensor(long id) {
		if (!sensorRepo.existsById(id)) {
			new SensorNotFoundException(String.format("sensore %d not exist", id));
		}
		Range res = sensorRepo.findById(id);
		log.debug("sensor {} gets range {}", id, res);
		return res;
	}

}
