public class Jogo {

    public static void main(String[] args) {
        UsuarioJogo joao = new UsuarioJogo("João", "Jaquin");
        UsuarioJogo pedro = new UsuarioJogo("Pedro","Dim");
        for(int i=0;i<5;i++){
            pedro.aumentarPontuacao();
            pedro.subirNivel();
        }
        for (int i=0;i<2;i++){
            joao.aumentarPontuacao();
            joao.subirNivel();
        }
        System.out.println("Pontuação do jogador " + joao.getNickname()+ " :" + joao.getPontuacao());
        System.out.println("Nível do jogador " + joao.getNickname()+ " :" + joao.getNivel());
        System.out.println("Pontuação do jogador " + pedro.getNickname()+ " :" + pedro.getPontuacao());
        System.out.println("Nível do jogador " + pedro.getNickname()+ " :" + pedro.getNivel());

    }
}
