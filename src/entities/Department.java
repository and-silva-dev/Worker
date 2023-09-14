package entities;
//Classe departamento

public class Department {

    //Atributos
    private String name;

    //Construtores
    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    //Metodos GET e SET
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
