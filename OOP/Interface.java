public class Interface {
    public static void main(String[] args) {
        Queen Q = new Queen();
        Q.moovs();

        Rook R = new Rook();
        R.moovs();

        King K = new King();
        K.moovs();
    }
}
 interface Chessplayer {
    void moovs();
 }

 class Queen implements Chessplayer{
    public void moovs() {
       System.out.println("Up, Down, Left, Right, Diagonal");
        
    }
 }
 class Rook implements Chessplayer{
    
    public void moovs() {
       System.out.println("Up, Down, Left, Right");
    }
 }

 class King implements Chessplayer{
    public void moovs() {
       System.out.println("Up, Down, Left, Right, Diagonal(by one stap)");
        
    }
 }