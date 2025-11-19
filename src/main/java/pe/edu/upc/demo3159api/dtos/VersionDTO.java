package pe.edu.upc.demo3159api.dtos;

import pe.edu.upc.demo3159api.entities.App;
import java.time.LocalDate;

public class VersionDTO {
    private int idVersion;
    private int numberVersion;
    private LocalDate dateLaunchVersion;
    private String notesChangeVersion;
    private double amountChangeVersion;
    private String responsibleVersion;
    private App app;

    public int getIdVersion() {
        return idVersion;
    }

    public void setIdVersion(int idVersion) {
        this.idVersion = idVersion;
    }

    public int getNumberVersion() {
        return numberVersion;
    }

    public void setNumberVersion(int numberVersion) {
        this.numberVersion = numberVersion;
    }

    public LocalDate getDateLaunchVersion() {
        return dateLaunchVersion;
    }

    public void setDateLaunchVersion(LocalDate dateLaunchVersion) {
        this.dateLaunchVersion = dateLaunchVersion;
    }

    public String getNotesChangeVersion() {
        return notesChangeVersion;
    }

    public void setNotesChangeVersion(String notesChangeVersion) {
        this.notesChangeVersion = notesChangeVersion;
    }

    public double getAmountChangeVersion() {
        return amountChangeVersion;
    }

    public void setAmountChangeVersion(double amountChangeVersion) {
        this.amountChangeVersion = amountChangeVersion;
    }

    public String getResponsibleVersion() {
        return responsibleVersion;
    }

    public void setResponsibleVersion(String responsibleVersion) {
        this.responsibleVersion = responsibleVersion;
    }

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }
}
