private ScriptField_Point mExportVar_touchPoints;
public void bind_touchPoints(ScriptField_Point v) {
    mExportVar_touchPoints = v;
    if (v == null) bindAllocation(null, mExportVarIdx_touchPoints);
    else bindAllocation(v.getAllocation(), mExportVarIdx_touchPoints);
}

public ScriptField_Point get_touchPoints() {
    return mExportVar_touchPoints;
}

private Allocation mExportVar_intPointer;
public void bind_intPointer(Allocation v) {
    mExportVar_intPointer = v;
    if (v == null) bindAllocation(null, mExportVarIdx_intPointer);
    else bindAllocation(v, mExportVarIdx_intPointer);
}

public Allocation get_intPointer() {
    return mExportVar_intPointer;
}
