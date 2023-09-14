package entities;

import java.util.Date;
//Classe Contrato

public class HourContract {
    //Atributos

    private double valuePerHour;
    private Integer hours;
    private Date date;

//Construtores
    public HourContract() {
    }

    public HourContract(double valuePerHour, Integer hours, Date date) {
        this.valuePerHour = valuePerHour;
        this.hours = hours;
        this.date = date;
    }
//Metodos GET e SET

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double totalValue(){
        return valuePerHour * hours;
    }
}
