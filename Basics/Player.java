class Player{
    String name;
    Game game;

    Player(String name,Game game)
    {
        this.name=name;
        this.game=game;
  }
    void showInfo()
    {
        System.out.println("Starting the showInfo in player");
        System.out.println("Name:"+this.name);
        System.out.println("Game name:"+this.game);
		if(game!=null){
			 System.out.println("id is:"+game.id);
			 System.out.println("Name is:"+game.name);
			 System.out.println("Name is:"+game.origin);

		}
        System.out.println("Ending the showInfo in player");
    }
}