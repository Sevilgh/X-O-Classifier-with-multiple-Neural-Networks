package char_rec_hebb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class hebb25 {



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
		
		for(int i=0;i<count;i++) {
			for(int j=0;j<25;j++) {
				delta_w[j]=delta_w[j]+y[i]*x[j][i];
			}
			delta_b+=y[i];
		}
		
		int sum=0;
		for(int i=0;i<25;i++) {
			sum+=delta_w[i]*input[i];
		}
		sum+=delta_b;
		if(sum>0) {
			return("It's X");
		}
		else
			return("It's O");

	}

}
