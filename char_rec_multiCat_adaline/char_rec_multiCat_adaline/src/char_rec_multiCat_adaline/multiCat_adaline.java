package char_rec_multiCat_adaline;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class multiCat_adaline {

	public static String main(int[] input,int m) {
		

		int dataCount=53;
		
		int[][] x=new int[25][dataCount];
		int[][] y=new int[2][dataCount];
		int target;

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String url="jdbc:mysql://localhost:3306/character?user=root";
			Connection con =DriverManager.getConnection(url);
			java.sql.Statement st=con.createStatement();
			String query="select * from multiCat_character_recognition_database";
			ResultSet result= st.executeQuery(query);
			result.beforeFirst();
			int i=0;
			while(result.next()) {
				for(int j=0;j<25;j++) {
					x[j][i]=Integer.parseInt(result.getString(j+1));
				}
				target=Integer.parseInt(result.getString(26));
				if(target==0) {
					y[0][i]=0;
					y[1][i]=0;
				}
			
					y[0][i]=Integer.parseInt(result.getString(26));
					y[1][i]=(-1)*Integer.parseInt(result.getString(26));

				
				
				
				
				i++;
			}
			
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		float [][] delta_w=new float[2][25];
		for(int j=0;j<25;j++) {
			for(int k=0;k<2;k++) {
				delta_w[k][j]=0;
			}
		}
		
		float []delta_b= {0,0};
		float alpha=0.5f;
		float[] max_difference= {2,2};
		float [][]tmp= new float[2][dataCount];
		
		for(int j=0;j<dataCount;j++) {
			for(int k=0;k<2;k++) {
				tmp[k][j]=0;
			}
		}
		
		int itr=0;
		int k=0;
		while(max_difference[0]>1.99 ) {
			max_difference[0]=0;
			for(int i=0;i<dataCount;i++) {
				tmp[k][i]=delta_b[k]+(x[0][i]+delta_w[k][0])+(x[1][i]*delta_w[k][1]);
				for(int j=0;j<25;j++) {
					delta_w[k][j]=delta_w[k][j]+(y[k][i]-tmp[k][i])*x[j][i]*alpha;
				}
			delta_b[k]=delta_b[k]+(y[k][i]-tmp[k][i])*alpha;
			}
			for(int i=0;i<dataCount;i++) {
				tmp[k][i]=delta_b[k]+(x[0][i]*delta_w[k][0])+(x[1][i]*delta_w[k][1]);
				max_difference[k]+=((y[k][i]-tmp[k][i])*(y[k][i]-tmp[k][i]));
			
			}
			if(++itr>=m)break;
		}
		
		k=1;
		itr=0;
		while( max_difference[1]>1.99 ) {
			
			max_difference[1]=0;
			for(int i=0;i<dataCount;i++) {
				tmp[k][i]=delta_b[k]+(x[0][i]+delta_w[k][0])+(x[1][i]*delta_w[k][1]);
				for(int j=0;j<25;j++) {
					delta_w[k][j]=delta_w[k][j]+(y[k][i]-tmp[k][i])*x[j][i]*alpha;
				}
			delta_b[k]=delta_b[k]+(y[k][i]-tmp[k][i])*alpha;
			}
			for(int i=0;i<dataCount;i++) {
				tmp[k][i]=delta_b[k]+(x[0][i]*delta_w[k][0])+(x[1][i]*delta_w[k][1]);
				max_difference[k]+=((y[k][i]-tmp[k][i])*(y[k][i]-tmp[k][i]));
			
			}
			if(++itr==m)break;
		}
		
		int[] sum= {0,0};
		for(int i=0;i<25;i++) {
			sum[0]+=delta_w[0][i]*input[i];
			sum[1]+=delta_w[1][i]*input[i];

		}
		sum[0]+=delta_b[0];
		sum[1]+=delta_b[1];
		
		 int itsX=0;
		 int itsO=0;
		// System.out.println("s0 "+sum[0]);
		// System.out.println("s1 "+sum[1]);

		if(sum[0]>=0) {
			itsX=1;
		}
		else
			itsX=0;
		
		if(sum[1]>=0) {
			itsO=1;
		}
		else
			itsO=0;
		
		if(itsX==1 && itsO==0)
			return("X is recognized");
		else if(itsX==0 && itsO==1)
			return("O is recognized");
		else
			return("Unrecognized");
		 
	
		
		
		
	}

}
