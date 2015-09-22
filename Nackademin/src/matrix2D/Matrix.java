package matrix2D;

public class Matrix {
	public Matrix()
	{
		double[][] matrix = new double [10][10]; 
		double[][] matrix2 = new double [10][10]; 
		double[][] matrix3 = new double [10][10]; 
		double[][] matrix4 = new double [10][10]; 
		double control = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				double value =i+(2.5*j);
				matrix[i][j] = value;
				control+=matrix[i][j];
			}
			
		}
		System.out.println(control);
		control = 0;
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				double value =i+(2.5*j);
				if (i >=5)
					value =  Math.PI;
				matrix2[i][j] = value;
				control+=matrix2[i][j];
				
			}
			
		}

		System.out.println(control);
		
		control = 0;
		for (int i = 0; i < matrix3.length; i++) {
			for (int j = 0; j < matrix3[i].length; j++) {
				double value =i+(2.5*j);
				if (i >=5)
					value = Math.PI;
				if(j%2 == 0)
					value = 0;
				matrix3[i][j] = value;
				control+=matrix3[i][j];
				//System.out.println( matrix[i][j]);
			}
			
			
		}
		System.out.println(control);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix m = new Matrix();
		
	}

}
