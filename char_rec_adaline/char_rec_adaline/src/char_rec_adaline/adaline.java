package char_rec_adaline;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class adaline {

	public static String main(int[] input,int m) {
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

		float [] delta_w=new float[25];
		float [] tmp=new float[count];

		for(int j=0;j<25;j++) {
			delta_w[j]=0;
		}
		for(int j=0;j<count;j++) {
			tmp[j]=0;
		}
		float delta_b=0.0f;
		float alpha=0.5f;
		float max_difference=2;
		int itr=0;
		while(max_difference>1.5) {
			max_difference=0;
			for(int i=0;i<count;i++) {
				tmp[i]=delta_b+(x[0][i]+delta_w[0])+(x[1][i]*delta_w[1]);
				for(int j=0;j<25;j++) {
					delta_w[j]=delta_w[j]+(y[i]-tmp[i])*x[j][i]*alpha;
				}
			delta_b=delta_b+(y[i]-tmp[i])*alpha;
			}
			for(int i=0;i<count;i++) {
				tmp[i]=delta_b+(x[0][i]*delta_w[0])+(x[1][i]*delta_w[1]);
				max_difference+=((y[i]-tmp[i])*(y[i]-tmp[i]));
			}
			if(++itr>=m)break;
		}
		
		int sum=0;
		for(int i=0;i<25;i++) {
			sum+=delta_w[i]*input[i];
		}
		sum+=delta_b;
		//System.out.println(sum);
		if(sum>0) {
			return("It's O");
		}
		else
			return("It's X");
		
		
		
	}

}
