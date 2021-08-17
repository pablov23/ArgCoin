package argcoin;

public class ClienteBasico extends Cliente{
    private int puntosBase;

    public ClienteBasico(int id, String nombre, String apellido, String mail, String direccion, int puntosBase) {
        super(id, nombre, apellido, mail, direccion);
        this.puntosBase=puntosBase;
    }

    @Override
    public float calcularPuntosArgCoin() {
        return this.puntosBase;
        //return super.calcularPuntosArgCoin() + this.puntosBase;
    }
}
