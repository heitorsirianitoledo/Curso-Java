package entities;

public class Altura {
    String name;
    int idade;
    Double altura;
    public Altura(String name, int idade, Double altura) {
        this.name = name;
        this.idade = idade;
        this.altura = altura;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }

    

}
