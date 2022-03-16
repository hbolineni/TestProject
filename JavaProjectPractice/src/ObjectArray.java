
public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Object a[] = new Object[5]; // ctrl + Shift + /
		a[0]=10;
		a[1]=20.5;
		a[2]="welcome";
		a[3]='G';
		a[4]=true;*/
		
		Object a[] = {10, 20.5, "welcome", 'G', true};
		
		for(Object i:a) {
			System.out.println(i);
		}

	}

}
