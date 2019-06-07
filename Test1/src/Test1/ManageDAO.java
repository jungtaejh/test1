package Test1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ManageDAO {

	/*
	 * public ManageDTO select(String BUSI, String CUS) throws Exception {
	 * 
	 * String url = "jdbc:oracle:thin:@localhost:1521:oracle"; String user =
	 * "system"; String password = "1234";
	 * 
	 * Class.forName("oracle.jdbc.OracleDriver"); System.out.println("driver load");
	 * 
	 * Connection con = DriverManager.getConnection(url, user, password);
	 * System.out.println("db연결");
	 * 
	 * String sql =
	 * "select BUSI_NUM from custom where BISU_NUM like'?%' or CUSTOM like'?%'";
	 * PreparedStatement ps = con.prepareStatement(sql);
	 * 
	 * ps.setString(1, BUSI); ps.setString(2, CUS);
	 * 
	 * ResultSet rs = ps.executeQuery(); ManageDTO dto = new ManageDTO();
	 * 
	 * while(rs.next()) {
	 * 
	 * String BUSI_NUM = rs.getString(1); String CUSTOM = rs.getString(2);
	 * 
	 * dto.setBUSI_NUM(BUSI_NUM); dto.setCUSTOM(CUSTOM); } return dto;
	 * 
	 * }
	 */
	
	
	public ArrayList<ManageDTO> account() throws Exception { 
		
		String url = "jdbc:oracle:thin:@localhost:1521:oracle";
		String user = "system";
		String password = "1234";
		
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("driver load");
		
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("db연결");
		
		String sql = "select * from ACCOUNT where BUSI_NUM = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		
		ManageDTO dto = null;
		ArrayList<ManageDTO> list = new ArrayList<>();
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			dto = new ManageDTO();
			
			String BUSI_NUM = rs.getString(1);
			String FACTORY = rs.getString(2);
			String TRADE_BANK = rs.getString(3);
			String ACCOUYNT_NUM = rs.getString(4);
			
			dto.setBUSI_NUM(FACTORY);
			dto.setTRADE_BANK(TRADE_BANK);
			dto.setACCOUNT_NUM(ACCOUYNT_NUM);
			list.add(dto);	
	}
		return list;
	
}
	
	public ArrayList<ManageDTO> select() throws Exception { 
		
		String url = "jdbc:oracle:thin:@localhost:1521:oracle";
		String user = "system";
		String password = "1234";
		
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("driver load");
		
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("db연결");
		
		String sql = "select BUSI_NUM from custom where BUSI_NUM like'?%' or CUSTOM like'?%'";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		
		
		ResultSet rs = ps.executeQuery();
		
		ArrayList<ManageDTO> list = new ArrayList<>();
		
		System.out.println("22");
		
		while(rs.next()) {
			
			System.out.println("33");
			
			ManageDTO dto = new ManageDTO();
			
			String BUSI_NUM = rs.getString(1);
			String CUSTOM = rs.getString(2);
			String SHORT = rs.getString(3);
			String CEO = rs.getString(4);
			String CHARGE_PERSON = rs.getString(5);
			String BUSI_CONDITION = rs.getString(6);
			String ITEM = rs.getString(7);
			String POST_NUM = rs.getString(8);
			String ADDR1 = rs.getString(9);
			String ADDR2 = rs.getString(10);
			String TEL = rs.getString(11);
			String FAX = rs.getString(12);
			String HOMEPAGE = rs.getString(13);
			String CO_YN = rs.getString(14);
			String FOREIGN_YN = rs.getString(15);
			String TAX_YN = rs.getString(16);
			String COUNTRY_ENG = rs.getString(17);
			String COUNTRY_KOR = rs.getString(18);
			String SPECIAL_RELATION = rs.getString(19);
			String TRADE_STOP = rs.getString(20);
			
			System.out.println("11");
			
			/*
			 * Timestamp CONTRACT_PERIOD_S = rs.getTimestamp(21); Timestamp
			 * CONTRACT_PERIOD_E = rs.getTimestamp(22); String REGI_INFO_MAN =
			 * rs.getString(23); Timestamp REGI_INFO_DATE = rs.getTimestamp(24); String
			 * MODI_INFO_MAN = rs.getString(25); Timestamp MODI_INFO_DATE =
			 * rs.getTimestamp(26);
			 */
			
			dto.setBUSI_NUM(BUSI_NUM);
			dto.setCUSTOM(CUSTOM);
			dto.setSHOPT(SHORT);
			dto.setCEO(CEO);
			dto.setCHARGE_PERSON(CHARGE_PERSON);
			dto.setBUSI_CONDITION(BUSI_CONDITION);
			dto.setITEM(ITEM);
			dto.setPOST_NUM(POST_NUM);
			dto.setADDR1(ADDR1);
			dto.setADDR2(ADDR2);
			dto.setTEL(TEL);
			dto.setFAX(FAX);
			dto.setHOMEPAGE(HOMEPAGE);
			dto.setCO_YN(CO_YN);
			dto.setFOREIGN_YN(FOREIGN_YN);
			dto.setTAX_YN(TAX_YN);
			dto.setTAX_YN(TAX_YN);
			dto.setCOUNTRY_ENG(COUNTRY_ENG);
			dto.setCOUNTRY_KOR(COUNTRY_KOR);
			dto.setSPECIAL_RELATION(SPECIAL_RELATION);
			dto.setTRADE_STOP(TRADE_STOP);
			
			/*
			 * dto.setCONTRACT_PERIOD_S(CONTRACT_PERIOD_S);
			 * dto.setCONTRACT_PERIOD_E(CONTRACT_PERIOD_E);
			 * dto.setREGI_INFO_MAN(REGI_INFO_MAN); dto.setREGI_INFO_DATE(REGI_INFO_DATE);
			 * dto.setMODI_INFO_MAN(MODI_INFO_MAN); dto.setMODI_INFO_DATE(MODI_INFO_DATE);
			 */
			
			System.out.println("22");
			
			list.add(dto);	
	}
		
		return list;
}

public ArrayList<ManageDTO> selectLeft(String custom) throws Exception { 
		
		String url = "jdbc:oracle:thin:@localhost:1521:oracle";
		String user = "system";
		String password = "1234";
		
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("driver load");
		
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("db연결");
		
		String sql = "select * from CUSTOM where BUSI_NUM like ?||'%' or CUSTOM like ?||'%'";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, custom);
		ps.setString(2, custom);
		
		ResultSet rs = ps.executeQuery();
		
		ManageDTO dto = null;
		ArrayList<ManageDTO> list = new ArrayList<>();
		
		while(rs.next()) {
			
			dto = new ManageDTO();
			
				dto.setBUSI_NUM(rs.getString(1));
				dto.setCUSTOM(rs.getString(2));
				dto.setSHOPT(rs.getString(3));
				dto.setCEO(rs.getString(4));
				dto.setCHARGE_PERSON(rs.getString(5));
				dto.setBUSI_CONDITION(rs.getString(6));
				dto.setITEM(rs.getString(7));
				dto.setPOST_NUM(rs.getString(8));
				dto.setADDR1(rs.getString(9));
				dto.setADDR2(rs.getString(10));
				dto.setTEL(rs.getString(11));
				dto.setFAX(rs.getString(12));
				dto.setHOMEPAGE(rs.getString(13));
				dto.setCO_YN(rs.getString(14));
				dto.setFOREIGN_YN(rs.getString(15));
				dto.setTAX_YN(rs.getString(16));
				dto.setCOUNTRY_ENG(rs.getString(17));
				dto.setCOUNTRY_KOR(rs.getString(18));
				dto.setSPECIAL_RELATION(rs.getString(19));
				dto.setTRADE_STOP(rs.getString(20));
				dto.setCONTRACT_PERIOD_S(rs.getString(21));
				dto.setCONTRACT_PERIOD_E(rs.getString(22));
				dto.setREGI_INFO_MAN(rs.getString(23));
				dto.setREGI_INFO_DATE(rs.getString(24));
				dto.setMODI_INFO_MAN(rs.getString(25));
				dto.setMODI_INFO_DATE(rs.getString(26));
				
			/*
			 * dto.setCONTRACT_PERIOD_S(CONTRACT_PERIOD_S);
			 * dto.setCONTRACT_PERIOD_E(CONTRACT_PERIOD_E);
			 * dto.setREGI_INFO_MAN(REGI_INFO_MAN); dto.setREGI_INFO_DATE(REGI_INFO_DATE);
			 * dto.setMODI_INFO_MAN(MODI_INFO_MAN); dto.setMODI_INFO_DATE(MODI_INFO_DATE);
			 */
				
			list.add(dto);	
	}
		
		return list;
}
	

	public void insert(ManageDTO dto) throws Exception{
		
			String url = "jdbc:oracle:thin:@localhost:1521:oracle";
			String user = "system";
			String password = "1234";
			
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("driver load");
			
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("db연결");
			
			String sql = "insert into CUSTOM(BUSI_NUM,CUSTOM,SHORT,CEO,CHARGE_PERSON,BUSI_CONDITION,ITEM,"
					+ "POST_NUM,ADDR1,ADDR2,TEL,FAX,HOMEPAGE,CO_YN,FOREIGN_YN,TAX_YN,COUNTRY_ENG,COUNTRY_KOR"
					+ ",SPECIAL_RELATION,TRADE_STOP)"
					+ " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
		/* 원래 SQL문
		 * String sql =
		 * "insert into CUSTOM(BUSI_NUM,CUSTOM,SHORT,CEO,CHARGE_PERSON,BUSI_CONDITION,ITEM,"
		 * +
		 * "POST_NUM,ADDR1,ADDR2,TEL,FAX,HOMEPAGE,CO_YN,FOREIGN_YN,TAX_YN,COUNTRY_ENG,COUNTRY_KOR"
		 * + ",SPECIAL_RELATION,TRADE_STOP,CONTRACT_PERIOD_S,CONTRACT_PERIOD_E" +
		 * ",REGI_INFO_MAN,REGI_INFO_DATE,MODI_INFO_MAN,MODI_INFO_DATE)" +
		 * " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		 */
			
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, dto.getBUSI_NUM());
			ps.setString(2, dto.getCUSTOM());
			ps.setString(3, dto.getSHOPT());
			ps.setString(4, dto.getCEO());
			ps.setString(5, dto.getCHARGE_PERSON());
			ps.setString(6, dto.getBUSI_CONDITION());
			ps.setString(7, dto.getITEM());
			ps.setString(8, dto.getPOST_NUM());
			ps.setString(9, dto.getADDR1());
			ps.setString(10, dto.getADDR2());
			ps.setString(11, dto.getTEL());
			ps.setString(12, dto.getFAX());
			ps.setString(13, dto.getHOMEPAGE());
			ps.setString(14, dto.getCO_YN());
			ps.setString(15, dto.getFOREIGN_YN());
			ps.setString(16, dto.getTAX_YN());
			ps.setString(17, dto.getCOUNTRY_ENG());
			ps.setString(18, dto.getCOUNTRY_KOR());
			ps.setString(19, dto.getSPECIAL_RELATION());
			ps.setString(20, dto.getTRADE_STOP());
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			
			//넣어야할 DATE 타입 6개
			//ps.setString(21, sdf.format(dto.getCONTRACT_PERIOD_S()));
			//ps.setString(22, sdf.format(dto.getCONTRACT_PERIOD_E()));
			//ps.setString(23, dto.getREGI_INFO_MAN());
			//ps.setString(24, sdf1.format(dto.getREGI_INFO_DATE()));
			//ps.setString(25, dto.getMODI_INFO_MAN());
			//ps.setString(26, sdf1.format(dto.getMODI_INFO_DATE()));
			
			ps.executeUpdate();
			con.close();
			ps.close();
		}
	
	public void update(ManageDTO dto) throws Exception{
		
		String url = "jdbc:oracle:thin:@localhost:1521:oracle";
		String user = "system";
		String password = "1234";
		
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("driver load");
		
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("db연결");
		
		String sql = "update custom set CUSTOM = ?, SHORT = ?, CEO = ?, CHARGE_PERSON = ?, BUSI_CONDITION = ?, ITEM = ?, "
				+ "POST_NUM = ?, ADDR1 = ?, ADDR2 = ?, TEL = ?, FAX = ?, HOMEPAGE = ?, CO_YN = ?, FOREIGN_YN = ?, "
				+ "TAX_YN = ?, COUNTRY_ENG = ?, COUNTRY_KOR = ?, SPECIAL_RELATION = ?, TRADE_STOP = ?  where trim(BUSI_NUM) = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, dto.getCUSTOM());
		ps.setString(2, dto.getSHOPT());
		ps.setString(3, dto.getCEO());
		ps.setString(4, dto.getCHARGE_PERSON());
		ps.setString(5, dto.getBUSI_CONDITION());
		ps.setString(6, dto.getITEM());
		ps.setString(7, dto.getPOST_NUM());
		ps.setString(8, dto.getADDR1());
		ps.setString(9, dto.getADDR2());
		ps.setString(10, dto.getTEL());
		ps.setString(11, dto.getFAX());
		ps.setString(12, dto.getHOMEPAGE());
		ps.setString(13, dto.getCO_YN());
		ps.setString(14, dto.getFOREIGN_YN());
		ps.setString(15, dto.getTAX_YN());
		ps.setString(16, dto.getCOUNTRY_ENG());
		ps.setString(17, dto.getCOUNTRY_KOR());
		ps.setString(18, dto.getSPECIAL_RELATION());
		ps.setString(19, dto.getTRADE_STOP());
		ps.setString(20, dto.getBUSI_NUM());
		
		
		/*
		 * ps.setTimestamp(21, dto.getCONTRACT_PERIOD_S()); ps.setTimestamp(22,
		 * dto.getCONTRACT_PERIOD_E()); ps.setString(23, dto.getREGI_INFO_MAN());
		 * ps.setTimestamp(24, dto.getREGI_INFO_DATE()); ps.setString(25,
		 * dto.getMODI_INFO_MAN()); ps.setTimestamp(26, dto.getMODI_INFO_DATE());
		 */
		
		ps.executeUpdate();
		con.close();
		
		System.out.println("22");
		
	}

		
	
		public void delete(String deleteNum) throws Exception {
			
			String url = "jdbc:oracle:thin:@localhost:1521:oracle";
			String user = "system";
			String password = "1234";
			
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("driver load");
			
			Connection con = DriverManager.getConnection(url, user, password);
			
			System.out.println("db연결");
			System.out.println(deleteNum);
			
			String sql = "delete from CUSTOM where trim(BUSI_NUM) = ?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, deleteNum);
			
			int result = ps.executeUpdate();
			System.out.println(result);
			
			ps.executeUpdate();
			con.close();
			ps.close();
		}
		
	}

