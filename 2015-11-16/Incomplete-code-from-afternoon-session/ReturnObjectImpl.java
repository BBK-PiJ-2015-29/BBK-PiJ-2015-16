public class ReturnObjectImpl implements ReturnObject {
    private Object obj = null;
    private ErrorMessage err = ErrorMessage.NO_ERROR;
    
    public ReturnObjectImpl(Object obj){
        this.obj = obj;
    }
    
    public ReturnObjectImpl(ErrorMessage err){
        this.err = err;
    }
    
    public boolean hasError(){
        return err != ErrorMessage.NO_ERROR;
    }
    
    public ErrorMessage getError(){
        if (!hasError()) return ErrorMessage.NO_ERROR;
        
        return err;
    }
    
    public Object getReturnValue(){
        if (hasError()) return null;
        return obj;
    }

}

