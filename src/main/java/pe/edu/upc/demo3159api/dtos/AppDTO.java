package pe.edu.upc.demo3159api.dtos;

import java.time.LocalDate;

public class AppDTO {
    private int idApp;
    private String nameApp;
    private Boolean stateApp;
    private LocalDate implementationDateApp;
    private double amountApp;
    private String typeApp;

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
