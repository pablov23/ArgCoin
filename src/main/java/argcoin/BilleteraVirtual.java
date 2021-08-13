package argcoin;

import java.util.*;

public class BilleteraVirtual {
    private List<Moneda> monedas;

    public int saldoTotal() {
        int saldo = this.monedas.stream().mapToInt(Moneda::valorMoneda).sum();
        return saldo;
    }

    public boolean adquirirMoneda(Moneda monedaAdquirida) {
        for (Moneda moneda : monedas) {
            if (moneda.getId() == (monedaAdquirida.getId())) {
                moneda.setCantidad(moneda.getCantidad() + monedaAdquirida.getCantidad());
                return true;
            }
        }
        monedas.add(monedaAdquirida);
        return true;
    }
}

