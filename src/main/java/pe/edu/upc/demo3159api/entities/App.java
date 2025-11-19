package pe.edu.upc.demo3159api.entities;


import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "App")
public class App {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idApp;

    @Column(name = "nameApp",nullable = false,length = 45)
    private String nameApp;

    @Column(name = "stateApp",nullable = false)
    private Boolean stateApp;

    @Column(name = "implementationDateApp",nullable = false)
    private LocalDate implementationDateApp;

    @Column(name = "amountApp",nullable = false)
    private double amountApp;

    @Column(name = "typeApp",nullable = false,length = 25)
    private String typeApp;

    public App() {
    }

    public App(int idApp, String typeApp, double amountApp, LocalDate implementationDateApp, Boolean stateApp, String nameApp) {
        this.idApp = idApp;
        this.typeApp = typeApp;
        this.amountApp = amountApp;
        this.implementationDateApp = implementationDateApp;
        this.stateApp = stateApp;
        this.nameApp = nameApp;
    }

    public int getIdApp() {
        return idApp;
    }

    public void setIdApp(int idApp) {
        this.idApp = idApp;
    }

    public String getNameApp() {
        return nameApp;
    }

    public void setNameApp(String nameApp) {
        this.nameApp = nameApp;
    }

    public Boolean getStateApp() {
        return stateApp;
    }

    public void setStateApp(Boolean stateApp) {
        this.stateApp = stateApp;
    }

    public LocalDate getImplementationDateApp() {
        return implementationDateApp;
    }

    public void setImplementationDateApp(LocalDate implementationDateApp) {
        this.implementationDateApp = implementationDateApp;
    }

    public double getAmountApp() {
        return amountApp;
    }

    public void setAmountApp(double amountApp) {
        this.amountApp = amountApp;
    }

    public String getTypeApp() {
        return typeApp;
    }

    public void setTypeApp(String typeApp) {
        this.typeApp = typeApp;
    }
}
