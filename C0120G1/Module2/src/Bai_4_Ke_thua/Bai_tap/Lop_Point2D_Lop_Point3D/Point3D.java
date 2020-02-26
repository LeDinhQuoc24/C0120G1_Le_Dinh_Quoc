package Bai_4_Ke_thua.Bai_tap.Lop_Point2D_Lop_Point3D;

public class Point3D extends Point2D{
    float[] array=new float[3];
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
        array[0]=x;
        array[1]=y;
        array[2]=z;
    }
    public float[] getXYZ() {
        return array;
    }
    public String toString() {
        return "Point3D with x:"+getX()
                +",y: "+getY()
                +",z: "+getZ()
                +"Array: "+getXYZ()
                +",which is a subclass of "+super.toString();
    }
}
