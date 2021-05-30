package core.utilities.results;

import com.sun.net.httpserver.Authenticator.Result;

public class DataResult<T> extends Result {
	 private T data;

	    public DataResult(T data, boolean success, String message) {
	        super();
	        this.data = data;
	    }

	    public DataResult(Object object, boolean success) {
	        super();
	        this.data = (T) object;
	    }

	    public T getData() {
	        return data;
	    }
}
