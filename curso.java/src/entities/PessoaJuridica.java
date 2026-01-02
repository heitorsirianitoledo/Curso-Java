package entities;

public class PessoaJuridica extends PessoaN {
    private int nFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, int nFuncionarios) {
        super(nome, rendaAnual);
        this.nFuncionarios = nFuncionarios;
    }

     public int getnFuncionarios() {
        return nFuncionarios;
    }

    public void setnFuncionarios(int nFuncionarios) {
        this.nFuncionarios = nFuncionarios;
    }

    

    

    @Override

    public Double calculoImposto(){
        if(getnFuncionarios() > 10){
            return getRendaAnual() * 0.14;
        }
        else{
            return getRendaAnual() * 0.16;
        }
    }

    
    
    
}
