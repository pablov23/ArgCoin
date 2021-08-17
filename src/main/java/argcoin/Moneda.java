package argcoin;

public class Moneda {

    private int id;
    private String detalle;
    private int cantidad;
    private int cotizacion;

    public Moneda(int id, String detalle, int cantidad, int cotizacion) {
        this.id = id;
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.cotizacion = cotizacion;
    }

    //Valor se obtiene siempre de la API? O se almacena en BBDD
    public int valorMoneda(){
        return (this.cantidad)*(this.cotizacion);
    }

    public int getId() {
        return id;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public int getCantidad() {
        return cantidad;
    }
}


