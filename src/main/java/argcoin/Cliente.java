package argcoin;

import java.util.List;


public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private String mail;
    private String direccion;
    private BilleteraVirtual billetera;
    private List<Tarjeta> tarjetas;
    static final float PROPORCION_PUNTOS_ARGCOIN = 0.001f;

    public float calcularPuntosArgCoin(){
        return this.billetera.saldoTotal() * PROPORCION_PUNTOS_ARGCOIN;
    }

    public Cliente(int id, String nombre, String apellido, String mail, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.direccion = direccion;
    }

}


