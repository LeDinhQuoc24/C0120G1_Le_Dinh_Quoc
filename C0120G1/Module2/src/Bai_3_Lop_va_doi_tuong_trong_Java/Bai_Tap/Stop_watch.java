package Bai_3_Lop_va_doi_tuong_trong_Java.Bai_Tap;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Stop_watch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] array = stopWatch.createArray(100000);
        stopWatch.start();
        Arrays.sort(array);
        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime());
    }
}
class StopWatch {
    private Date startTime;
    private Date endTime;
    StopWatch() {
        this.startTime=new Date();
    }
    public Date getStartTime() {
        return this.startTime;
    }
    public Date getEndTime() {
        return this.endTime;
    }
    public void start() {
        this.startTime = new Date();
    }
    public void end() {
        this.endTime = new Date();
    }
    public long getElapsedTime() {
        return this.getEndTime().getTime()-this.getStartTime().getTime();
    }
    public static int[] createArray(int size) {
        Random rd = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rd.nextInt(100);
        }
        return array;
    }
}
