package ModelsAndParts;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Estudiantes
 */
import ModelsAndParts.Motors;

public abstract class Vehicle {

    String motor;
    String chasis;
    float gas_cosumption;
    String name_motor;
    Motors mt;
    int anio;

    public Vehicle(String chasis, int anio, Motors mt) {
        this.name_motor = mt.getName();
        this.chasis = chasis;
        this.anio = anio;
        gas_cosumption = 0;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public float getGas_cosumption(float consumption) {
        return gas_cosumption;
    }

    public void setGas_cosumption(float gas_cosumption) {
        this.gas_cosumption = gas_cosumption;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void calculateConsumption(Motors mt) {
        float weigth = mt.getWeigth();
        float power = mt.getHorsepw();
        String chasis = this.getChasis();
        float consumption=0;
        if (chasis == "a") {

            consumption = (float) (1.1 * power + weigth * 0.2 - 0.3);

        } else if (chasis == "b") {

            consumption = (float) (1.1 * power + weigth * 0.2 - 0.5);

        }
        this.getGas_cosumption(consumption);

    }

}
