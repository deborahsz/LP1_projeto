public class Caminhao extends VeiculoAbstract {
    public Caminhao(String marca, String modelo, double preco) {
        super(marca, modelo, preco);
    }

    @Override
    public String getTipo() {
        return VeiculoTipo.CAMINHAO.name();
    }
}
