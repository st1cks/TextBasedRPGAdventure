public class Board {
    private Room[][]  map;
    private PlayerInfo statDisplay;

    public Board(Room[][] map){
        this.map = map;
    }

    public String toString() {
        String adventMap= "";

        for (int a = 0; a < map.length; a++){
            for (int b = 0; b < map[a].length; b++){
                adventMap = adventMap +map[a][b];
            }
            adventMap = adventMap+"\n";
        }
        return adventMap;
    }

}
