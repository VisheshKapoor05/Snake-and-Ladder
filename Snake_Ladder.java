public class Snake_Ladder
{

public static void main(String[] args)
{
System.out.println("Snake and ladder game");
double pos = 0;

int a=0;
while(pos<=100)
{
double DiceNum = (Math.floor(Math.random()*10)%6)+1;
System.out.println("DiceNum" +DiceNum);

double Option = Math.floor(Math.random()*10)%3;

	if(Option == 0)            //NoPlay
		pos = pos;
	else if(Option == 1)       //Ladder
		pos = pos + DiceNum ;
	else                       //Snake
		{
			pos = pos - DiceNum ;
			if(pos<0)
			{
				pos=0;
			}
		}

System.out.println("Option" +Option);
System.out.println("position" +pos);
System.out.println();

}
/*switch ((int) Option) {
	case 0:
		pos = pos; //NoPlay
	case 1:
		pos = pos + DiceNum ; //Ladder
	case 2:
		pos = pos - DiceNum ; //Snake
	}
*/
System.out.println(pos);

}

}
