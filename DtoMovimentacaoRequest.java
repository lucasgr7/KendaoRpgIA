import java.util.List;

public class DtoMovimentacaoRequest{
    public Integer coordenada_monstro_x;
    public Integer coordenada_monstro_y;
    public Integer raio_visao;
    public Mapa mapa;
    public List<Jogador> jogadores;

    public static class Jogador extends Coordenada{
        public Integer id;
    }
    public static class Mapa{
        public Integer id;
        public Integer largura;
        public Integer altura;
        public List<Objeto> objetos;
        public List<Bloco> blocos;

    }
    public static class Coordenada{
        public Integer x;
        public Integer y;
    }
    public static class Objeto extends Coordenada{
        public Integer id;
    }
    public static class Bloco extends Coordenada{
        public Integer id;
        public Integer tipo;
        public Teletransporte teletransporte;
    }
    public static class Teletransporte extends Coordenada{
        public Integer mapa;
        public Integer z;
    }
}