class Game{

    int id;
    String name;
	String origin;
    enum TotalPlayers{

        ONE,TWO,THREE;
}


Game(int id, String name,String origin)
{
    this.id=id;
    this.name=name;
    this.origin=origin;
}
void play()
{
    System.out.println("Start the Game play");
    System.out.println("Running play method...");
    System.out.println("End the Game play");
}
void pause()
{
    System.out.println("Start the Game pause");
    System.out.println("Running pause  method");
    System.out.println("End the Game pause");
}
void end()
{
    System.out.println("Start the Game end");
    System.out.println("Running end method");
    System.out.println("End the Game end");
}
void showInfo()
{
    System.out.println("id is:"+this.id);
    System.out.println("Name is:"+this.name);
	System.out.println("Origin is:"+this.origin);
    TotalPlayers totalplayers=TotalPlayers.TWO;
    System.out.println("Total players:"+totalplayers);
    play();
    pause();
    end();
    
}
}