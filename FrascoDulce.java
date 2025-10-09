public class FrascoDulce {
    String sabor;
    String fechaEnvasado;
    int cantidad;

    boolean envasar(int cantidad, String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
        if (this.cantidad == 200) {
            return false;
        }
        if (cantidad > 200) {
            this.cantidad = 200;
            return true;
        } else {
            this.cantidad = cantidad;
            return true;
        }
    }

    boolean envasar(int cantidad) {
        if (this.cantidad == 200) {
            return false;
        }
        if (cantidad > 200) {
            this.cantidad = 200;
            return true;
        } else {
            this.cantidad = cantidad;
            return true;
        }
    }

    int extraer(int cantidad) {
        int cantidadExtraida = 0;
        if (this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
            cantidadExtraida = cantidad;
        } else {
            cantidadExtraida = this.cantidad;
            this.cantidad = 0;
        }
        return cantidadExtraida;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public int getCantidad() {
        return cantidad;
    }
}
