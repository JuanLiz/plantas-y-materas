package com.store.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.store.Dto.Sale_detailVO;


public class Sale_detailDao {
	
	//Create sale_detail
	public void create(Sale_detailVO sale_detail) {
		Connect conn=new Connect();
		try {
			String querys="INSERT INTO sale_details(idsale_details,idsales,amount,vat,total,sellprice,added_date)"
					+ " VALUES(?,?,?,?,?,?,CURRENT_TIMESTAMP())";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			query.setLong(1, sale_detail.getIdsale_details());
			query.setLong(2, sale_detail.getIdsales());
			query.setInt(3, sale_detail.getAmount());
			query.setDouble(4, sale_detail.getVat());
			query.setDouble(5, sale_detail.getTotal());
			query.setDouble(6, sale_detail.getSellprice());
			query.executeUpdate();
			System.out.println("Registro correcto");
			query.close();
			conn.disconnect();
		} catch (Exception e) {
			System.out.println("Registro incorrecto "+e);			
		}
	}
	
	//Read all the sale_details
	public ArrayList <Sale_detailVO> readall() {
		ArrayList <Sale_detailVO> list=new ArrayList<>();
		Connect conn=new Connect();
		try {
			String querys="SELECT idsale_details,idsales,amount,vat,total,sellprice FROM sale_details";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			ResultSet rs=query.executeQuery();
			
			while(rs.next()) {
				Sale_detailVO sale_detail=new Sale_detailVO();
				sale_detail.setIdsale_details(rs.getLong("idsale_details"));
				sale_detail.setIdsales(rs.getLong("idsales"));
				sale_detail.setAmount(rs.getInt("amount"));
				sale_detail.setVat(rs.getDouble("vat"));
				sale_detail.setTotal(rs.getDouble("total"));
				sale_detail.setSellprice(rs.getDouble("sellprice"));
				list.add(sale_detail);
			}
			rs.close();
			query.close();
			conn.disconnect();
			
		} catch (Exception e) {
			System.out.println("Consulta incorrecta "+e);			
		}
		return list;
	}
	
	//Read sale_detail
	public ArrayList <Sale_detailVO> read(Long idsale_details) {
		ArrayList <Sale_detailVO> list=new ArrayList<>();
		Connect conn=new Connect();
		try {
			String querys="SELECT idsale_details,idsales,amount,vat,total,sellprice FROM sale_details "
					+ "WHERE idsale_details=?";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			query.setLong(1, idsale_details);
			ResultSet rs=query.executeQuery();
			
			while(rs.next()) {
				Sale_detailVO sale_detail=new Sale_detailVO();
				sale_detail.setIdsale_details(rs.getLong("idsale_details"));
				sale_detail.setIdsales(rs.getLong("idsales"));
				sale_detail.setAmount(rs.getInt("amount"));
				sale_detail.setVat(rs.getDouble("vat"));
				sale_detail.setTotal(rs.getDouble("total"));
				sale_detail.setSellprice(rs.getDouble("sellprice"));
				list.add(sale_detail);
			}
			rs.close();
			query.close();
			conn.disconnect();
			
		} catch (Exception e) {
			System.out.println("Consulta incorrecta "+e);			
		}
		return list;
	}
	
	//Update sale_detail
	public void update(Sale_detailVO sale_detail) {
		Connect conn=new Connect();
		try {
			String querys="UPDATE sale_details SET idsales=?, amount=?, vat=?, "
					+ "total=?, sellprice=? WHERE idsale_details=?";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			query.setLong(1, sale_detail.getIdsales());
			query.setLong(2, sale_detail.getAmount());
			query.setDouble(3, sale_detail.getVat());
			query.setDouble(4, sale_detail.getTotal());
			query.setDouble(5, sale_detail.getSellprice());
			query.setLong(6, sale_detail.getIdsale_details());
			query.executeUpdate();
			System.out.println("Actualización correcta");
			query.close();
			conn.disconnect();
		} catch (Exception e) {
			System.out.println("Actualización incorrecta "+e);			
		}
	}
	
	//Delete sale_detail
	public void delete(Long idsale_details) {
		Connect conn=new Connect();
		try {
			String querys="DELETE FROM sale_details WHERE idsale_details=?";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			query.setLong(1, idsale_details);
			query.executeUpdate();
			System.out.println("Borrado correcto");
			query.close();
			conn.disconnect();
		} catch (Exception e) {
			System.out.println("Borrado incorrecto "+e);			
		}
	}
	
}
