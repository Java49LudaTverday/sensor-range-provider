package telran.sensor.range_provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.constraints.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import telran.sensor.range_provider.dto.Range;
import telran.sensor.range_provider.service.SensorRangeProviderService;
import static telran.sensor.range_provider.api.ConstraintConstants.*;
import telran.sensor.range_provider.api.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class SensorRangeProviderController {
	final SensorRangeProviderService service;

	@GetMapping(UrlConstants.GET_RANGE)
	Range getRangeOfSensor(@Max(MAX_ID) @NotNull @Positive Long id) {
		log.debug("received id {}", id);
		return service.getRangeSensor(id);
	}
}
