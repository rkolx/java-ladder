import java.util.Random;

public class Ladder {

    Random ran = new Random();
    int playerCount;
    int heightLadder;
    char[][] ladder;

    public Ladder(int playerCount, int heightLadder) {
        this.playerCount = playerCount;
        this.heightLadder = heightLadder;
        this.ladder = new char[heightLadder][playerCount*2-1];
    }

    public char[][] makeLadder(){
        char[] RandomLine = {' ', '-'};

        for (int i = 0; i < ladder.length; i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                if (j % 2 == 0){
                    ladder[i][j] = '|';
                } else {
                    ladder[i][j] = RandomLine[ran.nextInt(2)];
                }
            }
        }
        return ladder;
    }

}
