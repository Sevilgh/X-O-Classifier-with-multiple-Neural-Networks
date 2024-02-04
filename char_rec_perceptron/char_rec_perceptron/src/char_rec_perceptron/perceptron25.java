package char_rec_perceptron;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class perceptron25 {

	public static String main(int[] input) {
		int count=41;
		int[][] x=new int[25][count];
		int[] y=new int[count];
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String url="jdbc:mysql://localhost:3306/character?user=root";
			Connection con =DriverManager.getConnection(url);
			java.sql.Statement st=con.createStatement();
			String query="select * from character_recognition_database";
			ResultSet result= st.executeQuery(query);
			result.beforeFirst();
			int i=0;
			while(result.next()) {
				for(int j=0;j<25;j++) {
					
					x[j][i]=Integer.parseInt(result.getString(j+1));
				}
				y[i]=Integer.parseInt(result.getString(26));
				i++;
			}
			
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		int [] delta_w=new int[25];
		for(int j=0;j<25;j++) {
			delta_w[j]=0;
		}
		
		int delta_b=0;
		int alpha=1;
		float threshold=0.5f;
		int repeat=1;		
		int yni;
		int tmp=0;
		while(repeat==1) {
			for(int i=0;i<count;i++) {
				yni=delta_b+(x[0][i]*delta_w[0])+(x[1][i]*delta_w[1]);
				if(yni>threshold)
					tmp=1;
				if(yni<=threshold && yni>=(-1)*threshold)
					tmp=0;
				if(yni<(-1)*threshold)
					tmp=-1;
			//	System.out.println("tmp "+tmp );
			//	System.out.println("y[i] "+y[i]);
				if(tmp-y[i]==0) {
					repeat=0;
				}
				else {
					repeat=1;
					for(int j=0;j<25;j++) {
						delta_w[j]=delta_w[j]+(y[i]*x[j][i]*alpha);
					}
					delta_b=delta_b+(y[i]*alpha);
				}

			}
			
		}
		
		int sum=0;
		for(int i=0;i<25;i++) {
			sum+=delta_w[i]*input[i];
		}
		sum+=delta_b;
		if(sum>threshold) {
			return("It's X");
		}
		else
			return("It's O");
		
		
		
	}

}
