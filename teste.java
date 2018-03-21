import com.sun.org.apache.xpath.internal.operations.Bool;

public class teste {
    
    public static IMovimentacaoIA service;


    public teste(){
        this.service = new MovimentacaoIA();
    }
    
    public static void main(String[] args){
        System.out.println("Iniciando testes!");
        test_dto_nulo();

    }
    public static void test_dto_nulo(){
        DtoMovimentacaoResponse response = service.get_posicao_mover_monstro(null);
        AssertIsTrue(response.ExisteErro(MovimentacaoIA.DtoNulo));
    }
    public void test_coordenadas_invalidas(){
        
    }
    public void test_coordenadas_monstro_fora_mapa(){

    }
    public void test_jogador_fora_mapa(){

    }

    public void test_campos_invalidos(){

    }

    public void test_segue_inimigo_linha_reta(){

    }

    public void test_inimigo_na_visao(){

    }
    public void test_segue_inimigo_linha_reta_e_desvia(){

    }
    public void test_inimigo_fora_visao(){

    }
    protected static boolean AssertIsTrue(boolean b){
        if(!b){
            throw new Exception("Condição não bate!");
        }
        return true;
    }
}