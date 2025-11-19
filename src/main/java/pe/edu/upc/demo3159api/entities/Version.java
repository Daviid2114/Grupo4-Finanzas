package pe.edu.upc.demo3159api.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Version")
public class Version {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVersion;

    @Column(name = "numberVersion",nullable = false)
    private int numberVersion;

    @Column(name = "dateLaunchVersion",nullable = false)
    private LocalDate dateLaunchVersion;

    @Column(name ="notesChangeVersion" ,nullable = false,length = 200)
    private String notesChangeVersion;

    @Column(name = "amountChangeVersion",nullable = false)
    private double amountChangeVersion;

    @Column(name ="responsibleVersion" ,nullable = false,length = 40)
    private String responsibleVersion;

    @ManyToOne
    @JoinColumn(name = "idApp")
    private App app;

    public Version() {
    }

    public Version(int idVersion, int numberVersion, LocalDate dateLaunchVersion, String notesChangeVersion, double amountChangeVersion, String responsibleVersion, App app) {
        this.idVersion = idVersion;
        this.numberVersion = numberVersion;
        this.dateLaunchVersion = dateLaunchVersion;
        this.notesChangeVersion = notesChangeVersion;
        this.amountChangeVersion = amountChangeVersion;
        this.responsibleVersion = responsibleVersion;
        this.app = app;
    }

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
