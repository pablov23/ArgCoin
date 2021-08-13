package argcoin;

import java.util.List;

public class ClientePremium extends Cliente {
    List<Cliente> referidos;

    public ClientePremium(int id, String nombre, String apellido, String mail, String direccion) {
        super(id, nombre, apellido, mail, direccion);
    }

    public double puntosReferidos(){
        return this.referidos.stream().mapToDouble(Cliente::calcularPuntosArgCoin).sum();
    }
    @Override
    public float calcularPuntosArgCoin() {
        return (float) (super.calcularPuntosArgCoin() + puntosReferidos());
    }
}
