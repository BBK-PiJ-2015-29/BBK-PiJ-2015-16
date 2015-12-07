public class ReturnObjectImp implements ReturnObject{
    private Object obj;
    private ErrorMessage em;

    public ReturnObjectImp(Object obj){
        this.obj = obj;
        this.em = ErrorMessage.NO_ERROR;
    }

    public ReturnObjectImp(ErrorMessage em){
        this.em = em;
        this.obj = null;
    }

    @Override
    public boolean hasError() {
        return em != ErrorMessage.NO_ERROR;
    }

    @Override
    public ErrorMessage getError() {
        return em;
    }

    @Override
    public Object getReturnValue() {
        return obj;
    }
}
