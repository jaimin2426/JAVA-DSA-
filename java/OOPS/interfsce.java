public class interfsce{
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();

        Bear b = new Bear();
        b.eatplants();
        b.eateatmeat();
    }
}

interface Harbivore{
    void eatplants();
}

interface Carnivore{
    void eateatmeat();
}

class Bear implements Harbivore, Carnivore{
    public void eatplants(){
        System.out.println("eating plants");
    }

    public void eateatmeat(){
        System.out.println("eating meat");
    }
}


interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class king implements ChessPlayer{
    public void moves(){
        System.out.println("one step in any direction");
    }
}