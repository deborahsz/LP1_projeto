public class Moto extends VeiculoAbstract {
    public Moto(String marca, String modelo, double preco) {
        super(marca, modelo, preco);
    }

    @Override
    public String getTipo() {
        return VeiculoTipo.MOTO.name();
    }
}
