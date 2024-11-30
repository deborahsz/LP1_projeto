public abstract class VeiculoAbstract implements Veiculo {
    private String marca;
    private String modelo;
    private double preco;

    public VeiculoAbstract(String marca, String modelo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public abstract String getTipo();

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Preço: R$" + preco;
    }
}
