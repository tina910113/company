package Dao.porder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.DbConnection;
import Model.porder;
public class implDao implements porderDao{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//porder p=new porder("D桌",2,1,1);
		//new implDao().add(p);
		//System.out.println(new implDao().queryAll());
		//System.out.println(new implDao().querySum(500, 1000));
		//System.out.println(new implDao().queryId(8));
		/*porder p=new implPorder().queryId(5);
		p.setDesk("E桌");
		p.setA(10);
		
		new implDao().update(p);*/
		
		new implDao().delete(5);
	}

	@Override
	public void add(porder p) {
		// TODO Auto-generated method stub
		Connection conn=DbConnection.getDb();//選java.sql
		String SQL="insert into porder(desk,A,B,C,sum) "
				+ "values(?,?,?,?,?)";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);//打這行後，右鍵選try catch
			ps.setString(1, p.getDesk());//1等於第一個問號
			ps.setInt(2, p.getA());
			ps.setInt(3, p.getB());
			ps.setInt(4, p.getC());
			ps.setInt(5, p.getSum());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<porder> queryAll() {
		// TODO Auto-generated method stub
		Connection conn=DbConnection.getDb();
		String SQL="select * from porder";
		List<porder> l=new ArrayList();
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ResultSet rs=ps.executeQuery();
			
				while(rs.next())
				{
					porder p=new porder();
					p.setId(rs.getInt("id"));
					p.setDesk(rs.getString("desk"));
					p.setA(rs.getInt("A"));
					p.setB(rs.getInt("B"));
					p.setC(rs.getInt("C"));
					p.setSum(rs.getInt("sum"));
				
					l.add(p);
				
				}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		return l;
	}

	@Override
	public List<porder> querySum(int start, int end) {
		// TODO Auto-generated method stub
		Connection conn=DbConnection.getDb();
		String SQL="select * from porder where sum>=? and sum<=?";
		List<porder> l=new ArrayList();
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);//連資料庫
			ps.setInt(1, start);
			ps.setInt(2, end);
			
			ResultSet rs=ps.executeQuery();//顯示資料
			while(rs.next())
			{
				porder p=new porder();
				p.setId(rs.getInt("id"));
				p.setDesk(rs.getString("desk"));
				p.setA(rs.getInt("A"));
				p.setB(rs.getInt("B"));
				p.setC(rs.getInt("C"));
				p.setSum(rs.getInt("sum"));
				
				l.add(p);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public porder queryId(int id) {
		// TODO Auto-generated method stub
		Connection conn=DbConnection.getDb();
		String SQL="select * from porder where id=?";
		porder p=null;
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				p=new porder();
				p.setId(rs.getInt("id"));
				p.setDesk(rs.getString("desk"));
				p.setA(rs.getInt("A"));
				p.setB(rs.getInt("B"));
				p.setC(rs.getInt("C"));
				p.setSum(rs.getInt("sum"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return p;
	}

	

	@Override
	public void update(porder p) {
		// TODO Auto-generated method stub
		Connection conn=DbConnection.getDb();
		String SQL="update porder set desk=?,A=?,B=?,C=?,sum=? "
				+ "where id=?";
	
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, p.getDesk());
			ps.setInt(2, p.getA());
			ps.setInt(3, p.getB());
			ps.setInt(4, p.getC());
			ps.setInt(5, p.getSum());
			ps.setInt(6, p.getId());
			
			ps.executeUpdate();//執行SQL語法
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Connection conn=DbConnection.getDb();
		String Sql="delete from porder where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(Sql);
			ps.setInt(1, id);
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
