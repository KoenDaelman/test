typedef struct Point {
    int x;
    int y;
} Point_t;

Point_t point;

point.x = 1;
point.y = 1;

ScriptC_rsfile mScript;

...

Item i = new ScriptField_Point.Item();
i.x = 1;
i.y = 1;
mScript.set_point(i);

rsDebug("Printing out a Point", point.x, point.y);

Log.i("TAGNAME", "Printing out a Point: " + mScript.get_point().x + " " + mScript.get_point().y);
System.out.println(point.get_x() + " " + point.get_y());
