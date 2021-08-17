package argcoin;

import java.util.ArrayList;
import java.util.List;


public class Cliente {
    private int dni;
    private String nombre;
    private String apellido;
    private String mail;
    private String direccion;
    public BilleteraVirtual billetera =new BilleteraVirtual();
    private int cantidadPesos;
    private ClientePremium referido;
    private List<Tarjeta> tarjetas = new ArrayList<>();
    static final float PROPORCION_PUNTOS_ARGCOIN = 0.001f;

    public float calcularPuntosArgCoin(){
        return this.billetera.saldoTotal() * PROPORCION_PUNTOS_ARGCOIN;
    }

    public int getCantidadPesos() {
        return cantidadPesos;
    }

    public void comprarMoneda(Moneda moneda) throws MontoInsuficienteException {
        if(moneda.valorMoneda()<=this.getCantidadPesos()){
            this.setCantidadPesos(this.getCantidadPesos() - moneda.valorMoneda());
            this.billetera.adquirirMoneda(moneda);
        }else{
            throw new MontoInsuficienteException();
        }
    }

    public void setCantidadPesos(int cantidadPesos) {
        this.cantidadPesos = cantidadPesos;
    }

    public boolean agregarReferido(ClientePremium clientePremium){
        if(this.referido==null) {
            this.referido = clientePremium;
            return false;
        }else{
            return true;
        }
    }
    public Cliente(int id, String nombre, String apellido, String mail, String direccion) {
        this.dni = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.direccion = direccion;
    }

}

