package com.store.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.store.Dto.SaleVO;


public class SaleDao {
	
	//Create sale
	public void create(SaleVO sale) {
		Connect conn=new Connect();
		try {
			String querys="INSERT INTO sales(idsales,idclients,idusers,vat,total,sellprice,added_date)"
					+ " VALUES(?,?,?,?,?,?,CURRENT_TIMESTAMP())";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			query.setLong(1, sale.getIdsales());
			query.setLong(2, sale.getIdclients());
			query.setLong(3, sale.getIdusers());
			query.setDouble(4, sale.getVat());
			query.setDouble(5, sale.getTotal());
			query.setDouble(6, sale.getSellprice());
			query.executeUpdate();
			System.out.println("Registro correcto");
			query.close();
			conn.disconnect();
		} catch (Exception e) {
			System.out.println("Registro incorrecto "+e);			
		}
	}
	
	//Read all the sales
	public ArrayList <SaleVO> readall() {
		ArrayList <SaleVO> list=new ArrayList<>();
		Connect conn=new Connect();
		try {
			String querys="SELECT idsales,idclients,idusers,vat,total,sellprice FROM sales";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			ResultSet rs=query.executeQuery();
			
			while(rs.next()) {
				SaleVO sale=new SaleVO();
				sale.setIdsales(rs.getLong("idsales"));
				sale.setIdclients(rs.getLong("idclients"));
				sale.setIdusers(rs.getLong("idusers"));
				sale.setVat(rs.getDouble("vat"));
				sale.setTotal(rs.getDouble("total"));
				sale.setSellprice(rs.getDouble("sellprice"));
				list.add(sale);
			}
			rs.close();
			query.close();
			conn.disconnect();
			
		} catch (Exception e) {
			System.out.println("Consulta incorrecta "+e);			
		}
		return list;
	}
	
	//Read sale
	public ArrayList <SaleVO> read(Long idsales) {
		ArrayList <SaleVO> list=new ArrayList<>();
		Connect conn=new Connect();
		try {
			String querys="SELECT idsales,idclients,idusers,vat,total,sellprice FROM sales "
					+ "WHERE idsales=?";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			query.setLong(1, idsales);
			ResultSet rs=query.executeQuery();
			
			while(rs.next()) {
				SaleVO sale=new SaleVO();
				sale.setIdsales(rs.getLong("idsales"));
				sale.setIdclients(rs.getLong("idclients"));
				sale.setIdusers(rs.getLong("idusers"));
				sale.setVat(rs.getDouble("vat"));
				sale.setTotal(rs.getDouble("total"));
				sale.setSellprice(rs.getDouble("sellprice"));
				list.add(sale);
			}
			rs.close();
			query.close();
			conn.disconnect();
			
		} catch (Exception e) {
			System.out.println("Consulta incorrecta "+e);			
		}
		return list;
	}
	
	//Update sale
	public void update(SaleVO sale) {
		Connect conn=new Connect();
		try {
			String querys="UPDATE sales SET idclients=?, idusers=?, vat=?, "
					+ "total=?, sellprice=? WHERE idsales=?";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			query.setLong(1, sale.getIdclients());
			query.setLong(2, sale.getIdusers());
			query.setDouble(3, sale.getVat());
			query.setDouble(4, sale.getTotal());
			query.setDouble(5, sale.getSellprice());
			query.setLong(6, sale.getIdsales());
			query.executeUpdate();
			System.out.println("Actualización correcta");
			query.close();
			conn.disconnect();
		} catch (Exception e) {
			System.out.println("Actualización incorrecta "+e);			
		}
	}
	
	//Delete sale
	public void delete(Long idsales) {
		Connect conn=new Connect();
		try {
			String querys="DELETE FROM sales WHERE idsales=?";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			query.setLong(1, idsales);
			query.executeUpdate();
			System.out.println("Borrado correcto");
			query.close();
			conn.disconnect();
		} catch (Exception e) {
			System.out.println("Borrado incorrecto "+e);			
		}
	}
	
	
	
}
