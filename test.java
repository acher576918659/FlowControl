package tw.aaa.myproject.FlowControl;

public class test {
	public static void main(String[] args) {
	float a=87;
	int index=3;
	if(index==2)
	{
		System.out.println("C:"+(a-32)*5/9);
	}
	else if(index==1)
	{
		
		System.out.println("F:"+(float)(a*9/5+32) );
	}
	else{
		System.out.println("error");
	}

}
}
