public class Triangle implements Drawable{

	@Override
	public void draw(){
		int size = 10;
		String[][] triangle = new String[size][size];
		for(int i = 0;i<size;i++)
			triangle[i][i] = "*";
		for(int i = 0;i<size;i++)
			triangle[0][i] = "*";
		for(int i = 0;i<size-1;i++){
			triangle[i][size-1] = "*";
		}
		for(String[] strings: triangle){
			for(int j = 0;j<triangle.length;j++){
				if(strings[j]==null) System.out.print("  ");
				else System.out.print(strings[j]+" ");

			}
			System.out.println();
		}
	}
}
