public class Main {
    public static void main(String[] args) {
        Aviao aviao1 = new Aviao(1000, 1);
        Aviao aviao2 = new Aviao(500, 2);
        Aviao aviao3 = new Aviao(200, 3);

        Carga carga1 = new Carga(500, 1);
        Carga carga2 = new Carga(200, 2);
        Carga carga3 = new Carga(300, 3);
        Carga carga4 = new Carga(1000, 4);

        try{
            aviao1.adicionarCargas(carga1);
            System.out.println(aviao1.getTotalDisponivel());
            System.out.println(aviao1.getTotalPeso());
            aviao1.adicionarCargas(carga2);
            aviao1.adicionarCargas(carga3);
            aviao1.adicionarCargas(carga4);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        try{
            aviao2.adicionarCargas(carga2);
            System.out.println(aviao2.getTotalDisponivel());
            System.out.println(aviao2.getTotalPeso());
            aviao2.adicionarCargas(carga1);
            aviao2.adicionarCargas(carga3);
            aviao2.adicionarCargas(carga4);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        try{
            aviao3.adicionarCargas(carga2);
            System.out.println(aviao3.getTotalDisponivel());
            System.out.println(aviao3.getTotalPeso());
            aviao3.adicionarCargas(carga3);
            aviao3.adicionarCargas(carga1);
            aviao3.adicionarCargas(carga4);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}