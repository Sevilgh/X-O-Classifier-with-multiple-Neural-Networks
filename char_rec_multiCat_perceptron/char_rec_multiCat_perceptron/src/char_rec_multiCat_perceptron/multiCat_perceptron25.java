package char_rec_multiCat_perceptron;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class multiCat_perceptron25 {

	public static String main(int[] input) {
		int dataCount=53;
		int[][] x=new int[25][dataCount];
		int[][] y=new int[2][dataCount];
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String url="jdbc:mysql://localhost:3306/character?user=root";
			Connection con =DriverManager.getConnection(url);
			java.sql.Statement st=con.createStatement();
			String query="select * from multiCat_character_recognition_database";
			ResultSet result= st.executeQuery(query);
			result.beforeFirst();
			int i=0;
			int target;
			while(result.next()) {
				for(int j=0;j<25;j++) {
					x[j][i]=Integer.parseInt(result.getString(j+1));
				}
				target=Integer.parseInt(result.getString(26));
				if(target==0) {
					y[0][i]=0;
					y[1][i]=0;
				}
				else if(target==1) {
					y[0][i]=target;
					y[1][i]=0;
				}
				else if(target==-1) {
					y[1][i]=1;
					y[0][i]=0;
				}
				
				i++;
			}
			
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	
		int [][] delta_w=new int[2][25];
		for(int j=0;j<25;j++) {
			for(int k=0;k<2;k++) {
				delta_w[k][j]=0;
			}
		}
		 
		int [] delta_b= {0,0};
		int alpha=1;
		float threshold=0.5f;
		int repeat=1;
		int []yin= {0,0};
		int []tmp= {0,0};
		while(repeat==1) {
			repeat=0;
			for(int k=0;k<=1;k++) {
				for(int i=0;i<dataCount;i++) {
					yin[k]=delta_b[k]+(x[0][i]*delta_w[k][0])+(x[1][i]*delta_w[k][1]);
					if(yin[k]>threshold)
						tmp[k]=1;
					if(yin[k]<=threshold && yin[k]>=(-1)*threshold)
						tmp[k]=0;
					if(yin[k]<(-1)*threshold)
						tmp[k]=-1;
					if(tmp[k]-y[k][i]!=0) {
					for(int j=0;j<25;j++) {
						delta_w[k][j]=delta_w[k][j]+(y[k][i]*x[j][i]*alpha);
					}
					delta_b[k]=delta_b[k]+(y[k][i]*alpha);
				}

			}
			}
		}
		
		
		int []sum= {0,0};
		for(int i=0;i<25;i++) {
			sum[0]+=delta_w[0][i]*input[i];
			sum[1]+=delta_w[1][i]*input[i];
		}
		sum[0]+=delta_b[0];
		sum[1]+=delta_b[1];
		 int itsX=0;
		 int itsO=0;
		
		 //System.out.println("s0 "+sum[0]);
		if(sum[0]>threshold) {
			itsX=1;
		}
		else
			itsX=0;
		
		//System.out.println("s1 "+sum[1]);
		if(sum[1]>threshold) {
			itsO=1;
		}
		else
			itsO=0;
		
		//System.out.println("x "+itsX);
		//System.out.println("o "+itsO);

		if(itsX==1 && itsO==0)
			return("X recognized");
		else if(itsX==0 && itsO==1)
			return("O recognized");
		else
			return("Undefined");
		
		
		
		
		
	}

}
