package ifpe.ads;

public class Carro extends Veiculo{
    private int numeroDePortas;

    public Carro(String marca, String ano, double preco, int numeroDePortas) {
        super(marca, ano, preco);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void imprimeInformacoes() {
        super.imprimeInformacoes();
        System.out.println("Qtde de portas: " + numeroDePortas);
    }
}
