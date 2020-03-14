package Demo.Tong_Quang_Tien.models;

public class KySu extends CanBo{
    private String branch;
    public KySu() {
    }
    public KySu(String branch) {
        this.branch = branch;
    }
    public KySu(String name, int age, boolean sex, String address, String branch) {
        super(name, age, sex, address);
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "branch='" + branch + '\'' +super.toString()+
                '}';
    }
}
