package Demo.Tong_Quang_Tien.models;

public class CongNhan extends CanBo{
    private int rank;
    public CongNhan() {
    }
    public CongNhan(int rank) {
        this.rank = rank;
    }
    public CongNhan(String name, int age, boolean sex, String address, int rank) {
        super(name, age, sex, address);
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "rank=" + rank +super.toString()+
                '}';
    }
}

