package CaseStudyversion2.models;

import java.io.Serializable;

public class Viewer implements Serializable {
    private String nameViewer;
    private int idViewer;

    public String getNameViewer() {
        return nameViewer;
    }

    public void setNameViewer(String nameViewer) {
        this.nameViewer = nameViewer;
    }

    public int getIdViewer() {
        return idViewer;
    }

    public void setIdViewer(int idViewer) {
        this.idViewer = idViewer;
    }

    @Override
    public String toString() {
        return "Viewer{" +
                "nameViewer='" + nameViewer + '\'' +
                ", idViewer=" + idViewer +
                '}';
    }
}
