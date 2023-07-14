package com.shop.db;

public class SQL {
	// customer
	public static final String SELECT_CUSTOMER = "SELECT * from `customer` where `custId` =?";
	
	public static final String INSERT_CUSTOMER = "insert into `customer` set "
												+ "`custId` =?,"
												+ "`name` =?,"
												+ "`hp` =?,"
												+ "`addr` =?,"
												+ "`rdate` =now()";
	
	// order

//	SELECT a.*,
//	b.`name,
//	c.`prodName`
//FROM `order` AS a
//JOIN `customer` AS b ON a.orderId = b.custId
//JOIN `product` AS c ON a.orderProduct = c.proNo
//WHERE `orderId` = '';
//
	
	public static final String SELECT_ORDERS = "SELECT "
												+ "a.*,"
												+ "b.`name`,"
												+ "c.`prodName` "
												+ "FROM `Order` AS a "
												+ "JOIN `Customer` AS b ON a.orderId = b.custId "
												+ "JOIN `Product` AS c ON a.orderProduct = c.proNo "
												+ "WHERE `orderId`=?";	
	
	
	
	
	
	
	
	
	
	public static final String INSERT_ORDER = "insert into `order` set "
											+ "`orderId` = ?,"
											+ "`orderProduct` = ?,"
											+ "`orderCount` = ?,"
											+ "`orderDate` = now()";
	

	
	
	
	// product
	
	public static final String SELECT_PRODUCTS = "select * from `product` where `stock` > 0";
	
	public static final String SELECT_PRODUCT = "select * from `product` where `proNo` = ?";

	public static final String UPDATE_PRODUCT_STOCK_COUNT = "update `Product` set `stock` = `stock` - ? where `proNo` = ?";
	
}
