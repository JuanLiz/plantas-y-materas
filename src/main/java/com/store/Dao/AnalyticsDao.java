package com.store.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

import com.store.Dto.ClientVO;
import com.store.Dto.ProductVO;
import com.store.Dto.SalesClientVO;

public class AnalyticsDao {
	
	//Count users
	public int count_users() {
		int count=0;
		Connect conn=new Connect();
		try {
			String querys="SELECT COUNT(*) FROM users";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			ResultSet rs=query.executeQuery();	
			while(rs.next()) {
				count=rs.getInt("COUNT(*)");
			}
			rs.close();
			query.close();
			conn.disconnect();
			
		} catch (Exception e) {
			System.out.println("Consulta incorrecta "+e);			
		}
		return count;
	}
	
	
	//Count clients
	public int count_clients() {
		int count=0;
		Connect conn=new Connect();
		try {
			String querys="SELECT COUNT(*) FROM clients";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			ResultSet rs=query.executeQuery();	
			while(rs.next()) {
				count=rs.getInt("COUNT(*)");
			}
			rs.close();
			query.close();
			conn.disconnect();
			
		} catch (Exception e) {
			System.out.println("Consulta incorrecta "+e);			
		}
		return count;
	}
	
	//Count providers
	public int count_providers() {
		int count=0;
		Connect conn=new Connect();
		try {
			String querys="SELECT COUNT(*) FROM providers";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			ResultSet rs=query.executeQuery();	
			while(rs.next()) {
				count=rs.getInt("COUNT(*)");
			}
			rs.close();
			query.close();
			conn.disconnect();
			
		} catch (Exception e) {
			System.out.println("Consulta incorrecta "+e);			
		}
		return count;
	}
	
	//Count sales
	public int count_sales() {
		int count=0;
		Connect conn=new Connect();
		try {
			String querys="SELECT COUNT(*) FROM sales";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			ResultSet rs=query.executeQuery();	
			while(rs.next()) {
				count=rs.getInt("COUNT(*)");
			}
			rs.close();
			query.close();
			conn.disconnect();
			
		} catch (Exception e) {
			System.out.println("Consulta incorrecta "+e);			
		}
		return count;
	}
	
	//Count products
	public int count_products() {
		int count=0;
		Connect conn=new Connect();
		try {
			String querys="SELECT COUNT(*) FROM products";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			ResultSet rs=query.executeQuery();	
			while(rs.next()) {
				count=rs.getInt("COUNT(*)");
			}
			rs.close();
			query.close();
			conn.disconnect();
			
		} catch (Exception e) {
			System.out.println("Consulta incorrecta "+e);			
		}
		return count;
	}
	
	//Count earnings
	public long count_earnings() {
		long count=0;
		Connect conn=new Connect();
		try {
			//Sum directly from SQL
			String querys="SELECT SUM(total) total FROM sales;";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			ResultSet rs=query.executeQuery();	
			while(rs.next()) {
				count=rs.getLong("total");
			}
			rs.close();
			query.close();
			conn.disconnect();
			
		} catch (Exception e) {
			System.out.println("Consulta incorrecta "+e);			
		}
		return count;
	}
	
	//List last 5 products added
	public ArrayList<ProductVO> lastproducts(){
		ArrayList<ProductVO> list= new ArrayList<>();
		Connect conn=new Connect();
		try {
			String querys="SELECT name,sellprice FROM products ORDER BY added_date DESC LIMIT 5";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			ResultSet rs=query.executeQuery();
			
			while(rs.next()) {
				ProductVO product=new ProductVO();
				product.setName(rs.getString("name"));
				product.setSellprice(rs.getDouble("sellprice"));
				list.add(product);
			}
			rs.close();
			query.close();
			conn.disconnect();
			
		} catch (Exception e) {
			System.out.println("Consulta incorrecta "+e);			
		}
		return list;	
	}
	
	//Read users added last 7 days
	public ArrayList <Integer> lastusers() {
		ArrayList <Integer> list=new ArrayList<>();
		Connect conn=new Connect();
		try {
			for(int i=0; i<=6; i++) {
				String querys="SELECT COUNT(*) FROM users WHERE DAY(added_date)=DAY(NOW())-"+i;
				PreparedStatement query=conn.getConnection().prepareStatement(querys);
				ResultSet rs=query.executeQuery();
				while (rs.next()) {
					list.add(rs.getInt("COUNT(*)"));					
				}	
				rs.close();
				query.close();
			}
			conn.disconnect();		
		} catch (Exception e) {
			System.out.println("Consulta incorrecta "+e);			
		}
		Collections.reverse(list);
		return list;
	}
	
	//Read last 7 days sales
	public ArrayList <Integer> lastsales() {
		ArrayList <Integer> list=new ArrayList<>();
		Connect conn=new Connect();
		try {
			for(int i=0; i<=6; i++) {
				String querys="SELECT COUNT(*) FROM sales WHERE DAY(added_date)=DAY(NOW())-"+i;
				PreparedStatement query=conn.getConnection().prepareStatement(querys);
				ResultSet rs=query.executeQuery();
				while (rs.next()) {
					list.add(rs.getInt("COUNT(*)"));					
				}	
				rs.close();
				query.close();
			}
			conn.disconnect();		
		} catch (Exception e) {
			System.out.println("Consulta incorrecta "+e);			
		}
		Collections.reverse(list);
		return list;
	}
	
	//Read dates from last 7 days
	public ArrayList<String> sevendays(){
		ArrayList<String> days=new ArrayList<>();
		DateTimeFormatter daymonth= DateTimeFormatter.ofPattern("dd/MMM").withLocale(new Locale("es", "ES"));
		for (int i=0; i<=6; i++) {
			LocalDate date=LocalDate.now().minusDays(i);
			days.add(date.format(daymonth));
		}
		Collections.reverse(days);
		return days;
	}
	
	//Read sales per client
	public ArrayList <SalesClientVO> sales_per_client() {
		//For hang name and ids
		ArrayList <ClientVO> list=new ArrayList<>();
		//SalesClient array
		ArrayList <SalesClientVO> clientlist=new ArrayList<>();
		Connect conn=new Connect();
		//Get idclients and name for query in sales
		try {
			String querys="SELECT idclients,name FROM clients";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			ResultSet rs=query.executeQuery();
			while(rs.next()) {
				ClientVO client=new ClientVO();
				client.setIdclients(rs.getLong("idclients"));
				client.setName(rs.getString("name"));
				list.add(client);
			}
			rs.close();
			query.close();
			//Query total sales per client
			for (ClientVO clients:list) {
				long id=clients.getIdclients();
				String name=clients.getName();
				//Sum directly from SQL
				String queryprice="SELECT SUM(total) total FROM sales WHERE idclients="+id;
				PreparedStatement queryloop=conn.getConnection().prepareStatement(queryprice);
				ResultSet rset=queryloop.executeQuery();
				while(rset.next()) {
					SalesClientVO sc=new SalesClientVO();
					sc.setIdclients(id);
					sc.setName(name);
					sc.setTotal(rset.getLong("total"));
					clientlist.add(sc);

				}	
				rset.close();
				queryloop.close();
			}			
			rs.close();
			query.close();
			conn.disconnect();
		} catch (Exception e) {
			System.out.println("Consulta incorrecta "+e);			
		}
		return clientlist;
	}
	
}
