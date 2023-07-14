package Sub_5;

public class SQL {
	
	public final static String INSERT_USER = "insert into `user3` values (?,?,?,?)";
	public final static String SELECT_USERS = "SELECT * FROM `user3`";
	public final static String SELECT_USER = "SELECT * from `user3` where `uid` =?";
	public final static String UPDATE_USER = "Update `user3` set "
											+ "`name` =?,"
											+ "`hp` =?,"
											+ "`age` =? "
											+ "where `uid`=?";
	public final static String DELETE_USER = "delete from `user3` where `uid` = ?";
	
	
}
