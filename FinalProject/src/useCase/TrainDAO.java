package useCase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class TrainDAO {

	static final String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost:3306/train?autoReconnect=true&useSSL=false";
	static final String USERNAME="root";
	static final String PASSWORD="root123";

	Train findTrain(int trainNumber)
	{
		Train train=null;
		try {

			Class.forName(DRIVER_NAME);
			//System.out.println("loaded");

			//step-2 get the connection
			Connection con=DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			//System.out.println("connected");

			//step-3
			PreparedStatement ps=con.prepareStatement("select *from trains where train_no= ?");
			ps.setInt(1, trainNumber);


			ResultSet rs=ps.executeQuery();

			while(rs.next()) {
				train=new Train(trainNumber,rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5));

			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

		return train;
	}



}
