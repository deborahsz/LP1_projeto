public class Carro extends VeiculoAbstract {
    public Carro(String marca, String modelo, double preco) {
        super(marca, modelo, preco);
    }

    @Override
    public String getTipo() {
        return VeiculoTipo.CARRO.name();
    }
}
