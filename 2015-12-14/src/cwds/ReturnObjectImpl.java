package cwds;

public class ReturnObjectImpl implements ReturnObject {
    private Object obj;
    private ErrorMessage err;

    public ReturnObjectImpl(Object obj){
        this.obj = obj;
    }

    public ReturnObjectImpl(ErrorMessage err){
        this.err = err;
    }

    @Override
    public boolean hasError() {
        return false;
    }

    @Override
    public ErrorMessage getError() {
        return null;
    }

    @Override
    public Object getReturnValue() {
        return null;
    }
}
