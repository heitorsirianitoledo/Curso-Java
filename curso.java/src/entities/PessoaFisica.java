package entities;

public class PessoaFisica extends PessoaN {
    private Double GastosSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        GastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return GastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        GastosSaude = gastosSaude;
    }

    @Override

    public Double calculoImposto(){
        double imposto;
            if(getRendaAnual() < 2000.000){
                imposto = getRendaAnual() * 0.15;
            }
            else{
                imposto = getRendaAnual() * 0.25;
            }
            imposto = imposto - getGastosSaude() * 0.5;
            if(imposto == 0.0){
                imposto = 0.0;
            }
            return imposto;
    }

    


}
