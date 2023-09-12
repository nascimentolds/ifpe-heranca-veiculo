package ifpe.ads;

public class Veiculo {
    private String marca;
    private String ano;
    private double preco;

    public Veiculo(String marca, String ano, double preco) {
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }

    public void imprimeInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: R$ " + preco);
    }
}
