package core.adapter;

import java.sql.Date;

public interface ValidationService {
	boolean validateByMernis(String identification_number,String first_name,String last_name, Date birth_date);
	}


