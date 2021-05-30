package dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.concretes.City;

public interface CityDao  extends JpaRepository<City, Integer>{

}
