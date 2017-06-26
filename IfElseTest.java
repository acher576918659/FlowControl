package tw.aaa.myproject.FlowControl;
//骰子判斷
public class IfElseTest {

	public static void main(String[] args) {
		int a =(int)((Math.random()*6)+1);
int b=3;
		if(a==b){
			System.out.println("you win!!");
		}
		else
		{
			System.out.println("try again");
		}
		System.out.println("TestNum="+a);
	}

}
