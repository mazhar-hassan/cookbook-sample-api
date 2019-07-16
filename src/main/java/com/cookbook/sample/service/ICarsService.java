package com.cookbook.sample.service;

import java.util.List;
import com.cookbook.sample.dto.Car;

public interface ICarsService {

	Car findById(Long carId);

	Car save(Car car);

	Car update(Long carId, Car car);

	boolean delete(Long carId);

	List<Car> list();

}
