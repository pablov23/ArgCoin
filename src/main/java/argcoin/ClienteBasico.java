package argcoin;

public class ClienteBasico extends Cliente{
    private int puntosBase;

    public ClienteBasico(int id, String nombre, String apellido, String mail, String direccion) {
        super(id, nombre, apellido, mail, direccion);
    }

    @Override
    public float calcularPuntosArgCoin() {
        return super.calcularPuntosArgCoin() + this.puntosBase;
    }
}
