package entities;

public class Funcionarios {

    private Integer id;
    private String nome;
    private Double salario;
    
    public Funcionarios(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(Double porcentagem){
        salario += salario * porcentagem / 100.00;
    }

    public String toString(){
        return "ID: "
        +id
        +"\nNome: "
        +nome
        +"\nSalário: "
        + String.format("%.2f", salario);
    }

    

}
