package com.cookbook.sample.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cookbook.sample.common.AbstractApiContoller;
import com.cookbook.sample.dto.BooleanResponse;
import com.cookbook.sample.dto.Car;
import com.cookbook.sample.service.ICarsService;

@RestController
@RequestMapping("/cars")
public class CarsController extends AbstractApiContoller {

	ICarsService service;

	public CarsController(ICarsService service) {
		this.service = service;
	}

	@GetMapping("/{carId}")
	public Car findById(@PathVariable("carId") Long carId) {
		return service.findById(carId);
	}

	@PostMapping
	public Car save(@RequestBody Car car) {
		return service.save(car);
	}

	@PutMapping("/{carId}")
	public Car update(@PathVariable("carId") Long carId, @RequestBody Car car) {
		return service.update(carId, car);
	}

	@DeleteMapping("/{carId}")
	public BooleanResponse delete(@PathVariable("carId") Long carId) {
		return respond(service.delete(carId));
	}

	@GetMapping
	public List<Car> list() {
		return service.list();
	}
}
