package Bai_4_Ke_thua.Bai_tap.Lop_Point2D_Lop_Point3D;

public class Point3D extends Point2D{

    private float z=3.0f;
    public Point3D() {
    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z=z;
    }
    public void setZ(float z) {
        this.z=z;
    }
    public float getZ() {

        return this.z;
    }
    public void setXYZ(float x, float y, float z) {
        setXY(x,y);
        this.z=z;

    }
    public float[] getXYZ() {
        float[] array=new float[3];
        array[0] = getX();
        array[1] = getY();
        array[2]=getZ();
        return array;
    }
    public String toString() {
        String result="";
        for (float element : getXYZ()) {
            result += element + "\t";
        }
        return "Point3D with x:"+getX()
                +",y: "+getY()
                +",z: "+getZ()
                +"Array: "+result
                +",which is a subclass of "+super.toString();
    }
}
