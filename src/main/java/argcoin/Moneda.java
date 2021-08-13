package argcoin;

public class Moneda {

    private int id;
    private String detalle;
    private int cantidad;

    //Valor se obtiene siempre de la API? O se almacena en BBDD
    public int valorMoneda(){
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }
}


