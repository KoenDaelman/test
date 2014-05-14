private Bitmap mBitmapIn;
    private Bitmap mBitmapOut;
    private RenderScript mRS;
    private Allocation mInAllocation;
    private Allocation mOutAllocation;
    private ScriptC_mono mScript;

    private void createScript() {
        mRS = RenderScript.create(this);

        mInAllocation = Allocation.createFromBitmap(mRS, mBitmapIn,
                                                    Allocation.MipmapControl.MIPMAP_NONE,
                                                    Allocation.USAGE_SCRIPT);
        mOutAllocation = Allocation.createTyped(mRS, mInAllocation.getType());

        mScript = new ScriptC_mono(mRS, getResources(), R.raw.mono);

        mScript.set_gIn(mInAllocation);
        mScript.set_gOut(mOutAllocation);
        mScript.set_gScript(mScript);
        mScript.invoke_filter();
        mOutAllocation.copyTo(mBitmapOut);
    }
