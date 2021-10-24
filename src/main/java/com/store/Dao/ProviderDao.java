package com.store.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.store.Dto.ProviderVO;


public class ProviderDao {
	
	//Create provider
	public String create(ProviderVO provider) {
		Connect conn=new Connect();
		try {
			String querys="INSERT INTO providers(idproviders,name,address,city,phone,added_date)"
					+ " VALUES(?,?,?,?,?,CURRENT_TIMESTAMP())";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			query.setLong(1, provider.getIdproviders());
			query.setString(2, provider.getName());
			query.setString(3, provider.getAddress());
			query.setString(4, provider.getCity());
			query.setString(5, provider.getPhone());
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
	
	//Read all the providers
	public ArrayList <ProviderVO> readall() {
		ArrayList <ProviderVO> list=new ArrayList<>();
		Connect conn=new Connect();
		try {
			String querys="SELECT idproviders,name,address,city,phone FROM providers";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			ResultSet rs=query.executeQuery();
			
			while(rs.next()) {
				ProviderVO provider=new ProviderVO();
				provider.setIdproviders(rs.getLong("idproviders"));
				provider.setName(rs.getString("name"));
				provider.setAddress(rs.getString("address"));
				provider.setCity(rs.getString("city"));
				provider.setPhone(rs.getString("phone"));
				list.add(provider);
			}
			rs.close();
			query.close();
			conn.disconnect();
			
		} catch (Exception e) {
			System.out.println("Consulta incorrecta "+e);			
		}
		return list;
	}
	
	//Read provider
	public ArrayList <ProviderVO> read(Long idproviders) {
		ArrayList <ProviderVO> list=new ArrayList<>();
		Connect conn=new Connect();
		try {
			String querys="SELECT idproviders,name,address,city,phone FROM providers "
					+ "WHERE idproviders=?";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			query.setLong(1, idproviders);
			ResultSet rs=query.executeQuery();
			
			while(rs.next()) {
				ProviderVO provider=new ProviderVO();
				provider.setIdproviders(rs.getLong("idproviders"));
				provider.setName(rs.getString("name"));
				provider.setAddress(rs.getString("address"));
				provider.setCity(rs.getString("city"));
				provider.setPhone(rs.getString("phone"));
				list.add(provider);
			}
			rs.close();
			query.close();
			conn.disconnect();
			
		} catch (Exception e) {
			System.out.println("Consulta incorrecta "+e);			
		}
		return list;
	}
	
	//Update provider
	public String update(ProviderVO provider) {
		Connect conn=new Connect();
		try {
			String querys="UPDATE providers SET name=?, address=?, "
					+ "city=?, phone=? WHERE idproviders=?";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			query.setString(1, provider.getName());
			query.setString(2, provider.getAddress());
			query.setString(3, provider.getCity());
			query.setString(4, provider.getPhone());
			query.setLong(5, provider.getIdproviders());
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
	
	//Delete provider
	public String delete(Long idproviders) {
		Connect conn=new Connect();
		try {
			String querys="DELETE FROM providers WHERE idproviders=?";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			query.setLong(1, idproviders);
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
