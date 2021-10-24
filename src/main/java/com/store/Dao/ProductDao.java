package com.store.Dao;

import java.io.File;  
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.web.multipart.MultipartFile;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.store.Dto.ProductVO;


public class ProductDao {
	
	//Create product
	public void create(ProductVO product) {
		Connect conn=new Connect();
		try {
			String querys="INSERT INTO products(idproducts,idproviders,name,vat,buyprice,sellprice,added_date)"
					+ " VALUES(?,?,?,?,?,?,CURRENT_TIMESTAMP())";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			query.setLong(1, product.getIdproducts());
			query.setLong(2, product.getIdproviders());
			query.setString(3, product.getName());
			query.setDouble(4, product.getVat());
			query.setDouble(5, product.getBuyprice());
			query.setDouble(6, product.getSellprice());
			query.executeUpdate();
			System.out.println("Registro correcto");
			query.close();
			conn.disconnect();
		} catch (Exception e) {
			System.out.println("Registro incorrecto "+e);			
		}
	}
	
	//Upload products 
	public String upload(MultipartFile file) throws IOException {
		Connect conn=new Connect();
		String upload_folder = ".//src//main//resources//files//";
		String querys="INSERT INTO products(idproducts,idproviders,name,vat,buyprice,sellprice)"
					+ " VALUES(?,?,?,?,?,?)";
	    String returns="0";
		if(!file.isEmpty()){
			byte[] bytes = file.getBytes();
	        Path path = Paths.get(upload_folder + file.getOriginalFilename());
			Files.write(path,bytes);
	        FileReader filer = new FileReader(path.toString());
	        try (CSVReader csvReader = new CSVReaderBuilder(filer).withSkipLines(1).build()) {
	            String[] nextRecord;
	            // we are going to read data line by line
	            while ((nextRecord = csvReader.readNext()) != null) {
	            	PreparedStatement query=conn.getConnection().prepareStatement(querys);
		        	query.setLong(1, Long.parseLong(nextRecord[0]));
		        	query.setLong(2, Long.parseLong(nextRecord[1]));
		        	query.setString(3, (nextRecord[2]));
		        	query.setDouble(4, Double.parseDouble(nextRecord[3]));
		        	query.setDouble(5, Long.parseLong(nextRecord[4]));
		        	query.setDouble(6, Long.parseLong(nextRecord[5]));
		        	query.executeUpdate();
					query.close();
		        	System.out.println("Registro correcto");
	            }
				conn.disconnect();
				returns= "1";
			} catch (Exception e) {
	                e.printStackTrace();
	                returns= "2";
	        }
			//Delete file
			File f=new File(path.toString());
			f.delete();
		}
		return returns;
	}
	
	//Read all the products
	public ArrayList <ProductVO> readall() {
		ArrayList <ProductVO> list=new ArrayList<>();
		Connect conn=new Connect();
		try {
			String querys="SELECT idproducts,idproviders,name,vat,buyprice,sellprice FROM products";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			ResultSet rs=query.executeQuery();
			
			while(rs.next()) {
				ProductVO product=new ProductVO();
				product.setIdproducts(rs.getLong("idproducts"));
				product.setIdproviders(rs.getLong("idproviders"));
				product.setName(rs.getString("name"));
				product.setVat(rs.getDouble("vat"));
				product.setBuyprice(rs.getDouble("buyprice"));
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
	
	//Read product
	public ArrayList <ProductVO> read(Long idproducts) {
		ArrayList <ProductVO> list=new ArrayList<>();
		Connect conn=new Connect();
		try {
			String querys="SELECT idproducts,idproviders,name,vat,buyprice,sellprice FROM products "
					+ "WHERE idproducts=?";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			query.setLong(1, idproducts);
			ResultSet rs=query.executeQuery();
			
			while(rs.next()) {
				ProductVO product=new ProductVO();
				product.setIdproducts(rs.getLong("idproducts"));
				product.setIdproviders(rs.getLong("idproviders"));
				product.setName(rs.getString("name"));
				product.setVat(rs.getDouble("vat"));
				product.setBuyprice(rs.getDouble("buyprice"));
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
	
	//Update product
	public void update(ProductVO product) {
		Connect conn=new Connect();
		try {
			String querys="UPDATE products SET idproviders=?, name=?, vat=?, "
					+ "buyprice=?, sellprice=? WHERE idproducts=?";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			query.setLong(1, product.getIdproviders());
			query.setString(2, product.getName());
			query.setDouble(3, product.getVat());
			query.setDouble(4, product.getBuyprice());
			query.setDouble(5, product.getSellprice());
			query.setLong(6, product.getIdproducts());
			query.executeUpdate();
			System.out.println("Actualización correcta");
			query.close();
			conn.disconnect();
		} catch (Exception e) {
			System.out.println("Actualización incorrecta "+e);			
		}
	}
	
	//Delete product
	public void delete(Long idproducts) {
		Connect conn=new Connect();
		try {
			String querys="DELETE FROM products WHERE idproducts=?";
			PreparedStatement query=conn.getConnection().prepareStatement(querys);
			query.setLong(1, idproducts);
			query.executeUpdate();
			System.out.println("Borrado correcto");
			query.close();
			conn.disconnect();
		} catch (Exception e) {
			System.out.println("Borrado incorrecto "+e);			
		}
	}
	
}
