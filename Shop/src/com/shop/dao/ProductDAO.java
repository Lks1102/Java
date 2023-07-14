package com.shop.dao;


import java.util.ArrayList;
import java.util.List;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.ProductVO;

public class ProductDAO extends DBHelper {
	// 싱글톤
	
	private static ProductDAO instance = new ProductDAO();
	public static ProductDAO getInstance() {
		return instance;
	}
	private ProductDAO() {}
	
	// 기본 CRUD method
	
	public int insertProduct(ProductVO vo) {
		return 0;
	}
	
	
	
	public ProductVO selectProduct(int proNo) {
		
		ProductVO vo = null;
		
		try {
			
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_PRODUCT);
			psmt.setInt(1, proNo);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				vo = new ProductVO();
				vo.setProNo(rs.getInt("proNo"));
				vo.setProName(rs.getString("prodName"));
				vo.setStock(rs.getInt("stock"));
				vo.setPrice(rs.getInt("price"));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return vo;
	}
	
	
	
	public List<ProductVO> selectProducts() {
		
		List<ProductVO> products = new ArrayList<>();
		
		try {
			
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_PRODUCTS);
			
			while(rs.next()) {
				
				ProductVO vo = new ProductVO();
				vo.setProNo(rs.getInt(1));
				vo.setProName(rs.getString(2));
				vo.setStock(rs.getInt(3));
				vo.setPrice(rs.getInt(4));
				vo.setCompany(rs.getString("company")); // 컬럼 명으로도 가능.
				
				products.add(vo);
				
			}
			
			close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}
	
	
	public int updateProduct(ProductVO vo) {
		return 0;
	}
	
	public void updateProductStock(int proNo, int stock) {
		
		try {
			
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.UPDATE_PRODUCT_STOCK_COUNT);
			psmt.setInt(1, stock);
			psmt.setInt(2, proNo);
			
			psmt.executeUpdate();
			close();
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public int deleteProduct(String proNo) {
		return 0;
	}
	
	
}
