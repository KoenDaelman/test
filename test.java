private RenderScript myRenderScript;
private ScriptC_example script;
private Resources resources;

public void init(RenderScript rs, Resources res) {
    myRenderScript = rs;
    resources = res;

    //allocate memory for the struct pointer, calling the constructor
    ScriptField_Point touchPoints = new ScriptField_Point(myRenderScript, 2);

    //Create an element manually and allocate memory for the int pointer
    intPointer = Allocation.createSized(myRenderScript, Element.I32(myRenderScript), 2);

    //create an instance of the RenderScript, pointing it to the bytecode resource
    mScript = new ScriptC_example(myRenderScript, resources, R.raw.example);

    //bind the struct and int pointers to the RenderScript
    mScript.bind_touchPoints(touchPoints);
    script.bind_intPointer(intPointer);

   ...
}
