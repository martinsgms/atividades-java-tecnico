
package encapsulamento;

public class OperacaoDAO {

    public double somar(Operacao o){
        return o.getV1() + o.getV2();     
    }
    
    public double subtrair(Operacao o){
        return o.getV1() - o.getV2();
    }
    
    public double multiplicar(Operacao o){
        return o.getV1() * o.getV2();
    }
    
    public double dividir(Operacao o){
        return o.getV1() / o.getV2();
    }
}
