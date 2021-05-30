package business.abstracts;





import java.util.List;

import core.utilities.results.DataResult;
import core.utilities.results.SuccessDataResult;
import core.utilities.results.SuccessResult;
import entities.concretes.City;

public interface CityService {
	 SuccessResult add(City city);

	    SuccessResult update(City city);

	    SuccessResult delete(int id);

	    SuccessDataResult<City> getById(int id);

		DataResult<List<City>> getAll();

	
}
