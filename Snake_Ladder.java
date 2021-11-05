public class Snake_Ladder {

public static void main(String[] args) {
System.out.println("Snake and ladder game");
double pos = 0;

double DiceNum = (Math.floor(Math.random()*10)%6)+1;
System.out.println(DiceNum);

double Option = Math.floor(Math.random()*10)%3;
/*
if(Option == 0)
	pos = pos;
else if(Option == 1)
	pos = pos + DiceNum ;
else
	pos = pos - DiceNum ;
*/
switch ((int) Option) {
	case 0:
		pos = pos; //NoPlay
		break;
	case 1:
		pos = pos + DiceNum ; //Ladder
		break;
	case 2:
		pos = pos - DiceNum ; //Snake
		break;
	}


System.out.println(Option);
System.out.println(pos);

}

}
