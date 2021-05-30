package core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T> {
	public SuccessDataResult(T data, boolean success, String message) {
        super(data, true, message);
    }

    public SuccessDataResult(Object object) {
        super(object, true);
    }

    public SuccessDataResult(String message) {
        super(null, true, message);
    }

    public SuccessDataResult() {
        super(null, true);
    }
}
