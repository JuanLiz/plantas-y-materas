package com.store.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.store.Dto.CredentialsVO;
import com.store.Dto.UserVO;


public class UserDao {


	
	//Create user
	public String create(UserVO user) {
		Connect conn=new Connect();
		try {
			String querys="INSERT INTO users(idusers,name,email,user,password,added_date)"
					+ " VALUES(?,?,?,?,?,CURRENT_TIMESTAMP())";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			query.setLong(1, user.getIdusers());
			query.setString(2, user.getName());
			query.setString(3, user.getEmail());
			query.setString(4, user.getUser());
			query.setString(5, user.getPassword());
			query.executeUpdate();
			System.out.println("Registro correcto");
			query.close();
			conn.disconnect();
			return "1";
		} catch (Exception e) {
			System.out.println("Registro incorrecto "+e);
			return "2";
		}
	}
	
	//Read all the users
	public ArrayList <UserVO> readall() {
		ArrayList <UserVO> list=new ArrayList<>();
		Connect conn=new Connect();
		try {
			String querys="SELECT idusers,name,email,user,password FROM users";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			ResultSet rs=query.executeQuery();
			
			while(rs.next()) {
				UserVO user=new UserVO();
				user.setIdusers(rs.getLong("idusers"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setUser(rs.getString("user"));
				user.setPassword(rs.getString("password"));
				list.add(user);
			}
			rs.close();
			query.close();
			conn.disconnect();
			
		} catch (Exception e) {
			
			System.out.println("Consulta incorrecta "+e);			
		}
		return list;
	}
	
	//Read user
	public ArrayList <UserVO> read(Long idusers) {
		ArrayList <UserVO> list=new ArrayList<>();
		Connect conn=new Connect();
		try {
			String querys="SELECT idusers,name,email,user,password FROM users"
					+ "WHERE idusers=?";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			query.setLong(1, idusers);
			ResultSet rs=query.executeQuery();
			
			while(rs.next()) {
				UserVO user=new UserVO();
				user.setIdusers(rs.getLong("idusers"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setUser(rs.getString("user"));
				user.setPassword(rs.getString("password"));
				list.add(user);
			}
			rs.close();
			query.close();
			conn.disconnect();
			
		} catch (Exception e) {
			System.out.println("Consulta incorrecta "+e);			
		}
		return list;
	}
	
	//Update user
	public String update(UserVO user) {
		Connect conn=new Connect();
		try {
			String querys="UPDATE users SET name=?, email=?, "
					+ "user=?, password=? WHERE idusers=?";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			query.setString(1, user.getName());
			query.setString(2, user.getEmail());
			query.setString(3, user.getUser());
			query.setString(4, user.getPassword());
			query.setLong(5, user.getIdusers());
			int resul=query.executeUpdate(); //Rows affected for trigger alert
			query.close();
			conn.disconnect();
			String returns="1";
			if (resul==0) {
				System.out.println("Actualización incorrecta");
				returns="2";
			}
			else {
				System.out.println("Actualización correcta");
			}
			return returns;
		} catch (Exception e) {
			System.out.println("Actualización incorrecta "+e);
			return "2";
		}
	}
	
	//Delete user
	public String delete(Long idusers) {
		Connect conn=new Connect();
		try {
			String querys="DELETE FROM users WHERE idusers=?";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			query.setLong(1, idusers);
			int resul=query.executeUpdate(); //Rows affected for trigger alert
			query.close();
			conn.disconnect();
			String returns="1";
			if (resul==0) {
				System.out.println("Borrado incorrecto");
				returns="2";
			}
			else {
				System.out.println("Borrado correcto");
			}
			return returns;
		} catch (Exception e) {
			System.out.println("Borrado incorrecto"+e);
			return "2";
		}
	}
	
	//Login
	
	//Verify user and pass
	public boolean verify(CredentialsVO cred) {
		Connect conn=new Connect();
		boolean exists=false;
		try {
			String querys="SELECT user,password FROM users WHERE user=? AND password=?";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			query.setString(1, cred.getUser());
			query.setString(2, cred.getPassword());
			ResultSet rs=query.executeQuery();
			if (rs.next()) {
				exists=true;			
			}
			else {
				System.out.println("No existe el usuario");
			}
			rs.close();
			query.close();
			conn.disconnect();
		} catch (Exception e) {
			System.out.println("Error de verificación: "+e);
		}
		return exists;
	}
	
	//End Login
	
}
