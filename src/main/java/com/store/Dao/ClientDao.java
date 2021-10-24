package com.store.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.store.Dto.ClientVO;


public class ClientDao {
	
	//Create client
	public String create(ClientVO client) {
		Connect conn=new Connect();
		try {
			String querys="INSERT INTO clients(idclients,name,email,address,phone,added_date)"
					+ " VALUES(?,?,?,?,?,CURRENT_TIMESTAMP())";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			query.setLong(1, client.getIdclients());
			query.setString(2, client.getName());
			query.setString(3, client.getEmail());
			query.setString(4, client.getAddress());
			query.setString(5, client.getPhone());
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
	
	//Read all the clients
	public ArrayList <ClientVO> readall() {
		ArrayList <ClientVO> list=new ArrayList<>();
		Connect conn=new Connect();
		try {
			String querys="SELECT idclients,name,email,address,phone FROM clients";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			ResultSet rs=query.executeQuery();
			
			while(rs.next()) {
				ClientVO client=new ClientVO();
				client.setIdclients(rs.getLong("idclients"));
				client.setName(rs.getString("name"));
				client.setEmail(rs.getString("email"));
				client.setAddress(rs.getString("address"));
				client.setPhone(rs.getString("phone"));
				list.add(client);
			}
			rs.close();
			query.close();
			conn.disconnect();
			
		} catch (Exception e) {
			System.out.println("Consulta incorrecta "+e);			
		}
		return list;
	}
	
	//Read client
	public ArrayList <ClientVO> read(Long idclients) {
		ArrayList <ClientVO> list=new ArrayList<>();
		Connect conn=new Connect();
		try {
			String querys="SELECT idclients,name,email,address,phone FROM clients "
					+ "WHERE idclients=?";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			query.setLong(1, idclients);
			ResultSet rs=query.executeQuery();
			
			while(rs.next()) {
				ClientVO client=new ClientVO();
				client.setIdclients(rs.getLong("idclients"));
				client.setName(rs.getString("name"));
				client.setEmail(rs.getString("email"));
				client.setAddress(rs.getString("address"));
				client.setPhone(rs.getString("phone"));
				list.add(client);
			}
			rs.close();
			query.close();
			conn.disconnect();
			
		} catch (Exception e) {
			System.out.println("Consulta incorrecta "+e);			
		}
		return list;
	}
	
	//Update client
	public String update(ClientVO client) {
		Connect conn=new Connect();
		try {
			String querys="UPDATE clients SET name=?, email=?, "
					+ "address=?, phone=? WHERE idclients=?";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			query.setString(1, client.getName());
			query.setString(2, client.getEmail());
			query.setString(3, client.getAddress());
			query.setString(4, client.getPhone());
			query.setLong(5, client.getIdclients());
			int resul=query.executeUpdate(); //Rows affected for trigger alert
			System.out.println("Actualización correcta");
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
	
	//Delete client
	public String delete(Long idclients) {
		Connect conn=new Connect();
		try {
			String querys="DELETE FROM clients WHERE idclients=?";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			query.setLong(1, idclients);
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
	
}
