point[index].x = 1;
point[index].y = 1;

ScriptField_Point p = new ScriptField_Point(mRS, 1);
    Item i = new ScriptField_Point.Item();
    i.x=100;
    i.y = 100;
    p.set(i, 0, true);
    mScript.bind_point(p);

    points.get_x(0);            //read x and y from index 0
    points.get_x(0);
