package com.cookbook.sample.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.cookbook.sample.dto.Car;

@Service
public class CarsService implements ICarsService {

	@Override
	public Car findById(Long carId) {
		Car car = null;
		if (carId == 1) {
			car = getCarOne();
		}
		return car;
	}

	@Override
	public Car save(Car car) {
		car.setId(100L);
		return car;
	}

	@Override
	public Car update(Long carId, Car car) {

		return car;
	}

	@Override
	public boolean delete(Long carId) {
		return false;
	}

	@Override
	public List<Car> list() {
		List<Car> cars = new ArrayList<>();
		cars.add(getCarOne());
		cars.add(getCarOne());
		cars.get(1).setId(5L);
		cars.get(1).setPlateNumber("911");
		return cars;
	}

	private Car getCarOne() {
		Car car = new Car();
		car.setId(1L);
		car.setMake("Toyota");
		car.setModel("Vitz");
		car.setNumberOfSeats(5);
		car.setPlateNumber("1122");
		return car;
	}
}
