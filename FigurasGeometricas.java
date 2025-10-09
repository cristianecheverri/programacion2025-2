public class FigurasGeometricas {
    /**
     * Calcular area de un circulo
     * @return
     */
    double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    double calcularArea(double base, double altura, boolean esTriangulo) {
        if (esTriangulo) {
            return (base * altura) / 2;
        } else {
            return base * altura;
        }
    }
}
