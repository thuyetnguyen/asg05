package asg05;

import java.util.Date;

public class PeopleTest {
public static void main(String[] args) {

		Employee newbie = new Employee ( "Newbi" , new Date (1/1/1999),1000000);
		Manager boss = new Manager( "Boss", new Date(12/3/199) ,4000000);
		boss.setAssistant( newbie );
		Manager bigBoss = new Manager( "Big Boss" , new Date(9/4/1993),1000000);
		bigBoss.setAssistant( boss );

		Person p[] = new Person[3];
		p[0] = newbie;
		p[1] = boss;
		p[2] = bigBoss;
		for ( int i = 0 ; i <3 ; i++ )
		{
			System.out.print( "\n" + p[i].toString() );
		}
	}

}