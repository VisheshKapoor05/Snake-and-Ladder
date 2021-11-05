public class Snake_Ladder
{

public static double Option = 0;

public static double SnakeLadderRoll(double pos)
{
double DiceNum = (Math.floor(Math.random()*10)%6)+1;
System.out.println("DiceNum" +DiceNum);
//DiceRolls++;

Option = Math.floor(Math.random()*10)%3;
System.out.println("Option" +Option);

	if(Option == 0)            //NoPlay
		{
			pos = pos;
		}
	else if(Option == 1)       //Ladder
		{
			pos = pos + DiceNum ;
			if(pos>100)                 //Player stays still if final position exceeds 100
				pos = pos - DiceNum ;
			SnakeLadderRoll(pos);
		}
	else                       //Snake
		{
			pos = pos - DiceNum ;
			if(pos<0)                   //Player restarts from 0 if we get a negative position
				pos=0;
		}

System.out.println("position: " +pos);

return (pos);
}



public static void main(String[] args)
{
System.out.println("Snake and ladder game");
double pos1 = 0;		//Position of Player 1
double pos2 = 0;		//Position of Player 2


int DiceRolls=0;

while( pos1<100 && pos2<100 )
{

pos1=SnakeLadderRoll(pos1);
if(Option==1)					       //Player plays again if gets a ladder
	SnakeLadderRoll(pos1);

pos2=SnakeLadderRoll(pos2);
if(Option==1)
	SnakeLadderRoll(pos2);

System.out.println("position1: " +pos1);
System.out.println("position2: " +pos2);
System.out.println();

}

if(pos1==100)
	System.out.println("Player1 won");
else
	System.out.println("Player2 won");

/*switch ((int) Option) {
	case 0:
		pos = pos; //NoPlay
	case 1:
		pos = pos + DiceNum ; //Ladder
	case 2:
		pos = pos - DiceNum ; //Snake
	}
*/

//System.out.println("Number of times the dice was played:" +DiceRolls);

}

}
