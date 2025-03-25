package es.iesmz;

public class EmpleadoBR {
    private static int salarioBase;
    private int ventasMes;
    private int horasExtra;

    public static float calculaSalarioBruto(TipoEmpleado tipo, float ventasMes, float horasExtra) {
        if (tipo == null || ventasMes < 0 || horasExtra < 0) {
            return -1;
        }

        int salarioBase = (tipo == TipoEmpleado.vendedor) ? 1000 : 1500;

        if (ventasMes >= 1000 && ventasMes < 1500) {
            salarioBase += 100;
        } else if (ventasMes >= 1500) {
            salarioBase += 200;
        }

        salarioBase += horasExtra * 20;

        return salarioBase;
    }

    public static float calculaSalarioNeto(float salarioBruto) {
        if (salarioBruto < 0) return -1;
        if (salarioBruto < 1000) return salarioBruto;
        if (salarioBruto < 1500) return salarioBruto * 0.84f;
        return salarioBruto * 0.82f;
    }

}
