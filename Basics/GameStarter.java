class GameStarter{
    
    public static void main(String[] args)
    {
        System.out.println("Start the main in Game starter");
        Game game=new Game(45,"Chess","INDIA");
        game.showInfo();
        Player player=new Player("Hareesh",game);
        Player player1=new Player("Praveen",game);		
        player.showInfo();
		player1.showInfo();
        System.out.println("End the main in Game starter");
    }
}