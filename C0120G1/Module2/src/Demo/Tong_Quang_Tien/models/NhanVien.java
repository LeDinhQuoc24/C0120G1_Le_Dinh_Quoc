package Demo.Tong_Quang_Tien.models;

import java.util.Scanner;

public class NhanVien extends CanBo{
    private String job;
    public NhanVien() {
    }
    public NhanVien(String job) {
        this.job = job;
    }
    public NhanVien(String name, int age, boolean sex, String address, String job) {
        super(name, age, sex, address);
        this.job = job;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    @Override
    public String toString() {
        return "NhanVien{" +
                "job='" + job + '\'' +super.toString()+
                '}';
    }
}
