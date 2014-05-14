private long mExportVar_unsignedInteger;
public void set_unsignedInteger(long v){
    mExportVar_unsignedInteger = v;
    setVar(mExportVarIdx_unsignedInteger, v);
}

public long get_unsignedInteger(){
    return mExportVar_unsignedInteger;
}
