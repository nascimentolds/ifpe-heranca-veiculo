package ifpe.ads;

// O desafio consiste em criar uma hierarquia de classes para representar veículos automotores.
// Aqui está a descrição do desafio:
//
// Crie uma classe chamada "Veiculo" que tenha os seguintes atributos:
// Marca (uma string que representa a marca do veículo)
// Ano (um inteiro que representa o ano de fabricação do veículo)
// Preço (um double que representa o preço do veículo)
//
// Crie duas subclasses de "Veiculo":
// Uma classe chamada "Carro" que inclui um atributo adicional "NumeroDePortas"
// (um inteiro que representa o número de portas do carro).
// Uma classe chamada "Moto" que inclui um atributo adicional "Cilindrada"
// (um inteiro que representa a cilindrada da moto).
//
// Crie um construtor para cada classe que inicialize os atributos da classe.
//
// Crie um método chamado "imprimirInformacoes" em cada classe que imprima as informações do veículo,
// incluindo a marca, o ano, o preço e quaisquer atributos adicionais da classe filha (por exemplo,
// o número de portas para carros ou a cilindrada para motos).
//
// Crie uma classe principal chamada "Principal" que demonstre a criação de objetos de cada classe
// e chame o método "imprimirInformacoes" para exibir as informações de cada veículo.

public class Principal {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Renault Kwid Zen 1.0", "2023", 68990, 4);
        carro1.imprimeInformacoes();

        System.out.println();

        Carro carro2 = new Carro("Citroën C3 Live 1.0", "2023", 72990, 4);
        carro2.imprimeInformacoes();

        System.out.println();

        Moto moto1 = new Moto("Honda Biz 110i", "2023", 11000, 110);
        moto1.imprimeInformacoes();

        System.out.println();

        Moto moto2 = new Moto("Honda Elite 125", "2023", 12330, 125);
        moto2.imprimeInformacoes();
    }
}
