public class CalculadoraImc {

    // Dev 1 - Andres: Calcular IMC.
      public double calcularImc(double peso, double estatura) {
        return peso / (estatura * estatura);
    }

    // Dev 2 - Darelt: Clasificar IMC.
    public String clasificarImc(double imc) {

    if (imc < 18.5) {
        return "Bajo peso";
    } else if (imc < 25) {
        return "Peso normal";
    } else if (imc < 30) {
        return "Sobrepeso";
    } else {
        return "Obesidad";
    }
}

    // Dev 3 - Shaday: Calcular peso minimo.

    // Dev 4 - Andres: Calcular peso maximo.

}