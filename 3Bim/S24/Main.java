public class Main{
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Roberto", 300.50, 300.20);
        VendedorFixo vendedorFixo = new VendedorFixo("Robertao", 500, 200, 300);

        System.out.println(vendedor.calcularSalario());
        System.out.println(vendedorFixo.calcularSalario());
    }
}