
package Game;

/* 
    set the position of enemy tank

Author : Md.Faruk Hossain
*/
public class EnemyTank implements Tank{
    EnemyTank tk;
    private int X;
    private int Y;
    private String direction;
    Game Game =new Game();
    public EnemyTank(int X, int Y, String direction)
    {
        this.X=X;
        this.Y=Y;
        this.direction=direction;
    }
    public void moveTank() {
        if(direction=="up")
        {
            Game.blockArray[X][Y]=9;
            
        }
        else if(direction=="down")
        {
            Game.blockArray[X][Y]=10;
        }
        
        else if(direction=="right")
        {
            Game.blockArray[X][Y]=11;
        }
        else if(direction=="left")
        {
            Game.blockArray[X][Y]=12;
        }
       
    }
    
}
