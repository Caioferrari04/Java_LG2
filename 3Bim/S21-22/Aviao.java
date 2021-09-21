import java.util.ArrayList;
import java.util.List;

public class Aviao {
    private Integer pesoLimite;
    private Integer numero;
    private List<Carga> cargas;

    public Aviao(Integer pesoLimite, Integer numero) {
        this.pesoLimite = pesoLimite;
        this.numero = numero;
        this.cargas = new ArrayList<Carga>();
    }

    public Integer getPesoLimite() {
        return this.pesoLimite;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public Integer getTotalPeso() {
        Integer pesoAtual = 0;
        for (Carga cargaAtual : this.cargas) 
            pesoAtual += cargaAtual.peso;
        return pesoAtual;
    }

    public Integer getTotalDisponivel(){
        return this.pesoLimite - getTotalPeso();
    }

    public void adicionarCargas(Carga carga) {
        Integer pesoAtual = getTotalPeso();
        if(pesoLimite >= carga.peso + pesoAtual){
            this.cargas.add(carga);
            System.out.println("Carga adicionada!");
        }
        else
            throw new IllegalArgumentException("Carga inválida!");
    }

}