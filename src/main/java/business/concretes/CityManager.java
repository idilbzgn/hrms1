package business.concretes;

import java.util.List;


import org.springframework.stereotype.Service;



import business.abstracts.CityService;
import core.utilities.results.DataResult;
import core.utilities.results.SuccessDataResult;
import core.utilities.results.SuccessResult;
import dataAccess.CityDao;
import entities.concretes.City;

@Service
public abstract class CityManager implements CityService {
private CityDao cityDao;
	
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao=cityDao;
	}
	public DataResult<List<City>> getAll() {
		
		return new SuccessDataResult<List<City>>(this.cityDao.findAll());
	}
	@Override
	public SuccessResult add(City city) {
		this.cityDao.save(city);
		return new SuccessResult("City Eklendi.");
	}
}
