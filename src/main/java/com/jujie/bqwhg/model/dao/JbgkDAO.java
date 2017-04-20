package com.jujie.bqwhg.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.jujie.bqwhg.model.utils.Page;
import com.jujie.bqwhg.model.utils.PageUtil;
import com.jujie.bqwhg.model.utils.SpringJDBCTemplate;
import com.jujie.bqwhg.struts.bean.Jbgk;
import com.jujie.bqwhg.struts.bean.SysUser;

public class JbgkDAO extends SpringJDBCTemplate {
	/**
	 *查询所有 
	 */
	@SuppressWarnings("unchecked")
	public List<Jbgk> queryJbgkList(Object[] objs , Page page) throws Exception{
		String sql = "select * from jbgk where 1=1 ";
		List<Object> list = new ArrayList<Object>();
		if(objs!=null&&objs.length>0){
			if(objs.length>=1&&objs[0]!=null&&!"".equals(objs[0])){
				sql+=" and jbgk_id = ? ";
				list.add(objs[0]);
			}
			if(objs.length>=2&&objs[1]!=null&!"".equals(objs[1])){
				sql += " and jbgk_title like ? ";
				list.add("%" +objs[1] + "%" );
			}
		}
		sql += " and jbgk_title <> '' order by jbgk_id desc limit 0,1";
		return this.getJdbcTemplate().query(PageUtil.fyPage(sql, list.toArray(), page, this.getJdbcTemplate(), Page.DATABASE_TYPE_MYSQL),list.toArray(), new Jbgk());
	}
	
	
	/**
	 *按id查询一条记录
	 */
	@SuppressWarnings("unchecked")
	public Jbgk findJbgkByID() throws Exception{
		String sql = " select * from jbgk where jbgk_id = 1 ";
		List<Jbgk> jbgkList = this.getJdbcTemplate().query(sql, new Jbgk());
		if(jbgkList!=null&&jbgkList.size()>0){
			return jbgkList.get(0);
		}
		return null;
	}
	
	/**
	 *查询发布人
	 */
	@SuppressWarnings("unchecked")
	public SysUser findUserByID() throws Exception {
		String sql = " select t2.* from jbgk t1 , sys_user t2 where t1.user_id = t2.user_id and t1.jbgk_id= 1 ";
		List<SysUser> userList = this.getJdbcTemplate().query(sql,new SysUser());
		if(userList!=null&&userList.size()>0){
			return userList.get(0);
		}
		return null;
	}
//	
//	/**
//	 *保存
//	 */
//	public int saveJbgk(Jbgk jbgk) throws Exception {
//		final String sql = "insert into jbgk (jbgk_title,jbgk_type,jbgk_content,sub_date,user_id,hold) values (?,?,?,?,?,?)";
//		final Object[] objs = {jbgk.getJbgkTitle(),jbgk.getJbgkType(),jbgk.getJbgkContent(),jbgk.getSubDate(),jbgk.getSysUser().getUserID(),jbgk.getHold()};
//		KeyHolder keyHolder = new GeneratedKeyHolder(); 
//		try {
//			this.getJdbcTemplate().update(new PreparedStatementCreator(){
//				public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
//					int i = 0;
//					int n = 0;
//					PreparedStatement pst = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
//					pst.setString(++i, DataUtil.toString(objs[n++])); 
//					pst.setInt(++i, DataUtil.toInt(objs[n++]));
//					pst.setString(++i, DataUtil.toString(objs[n++])); 
//					pst.setTimestamp(++i, DataUtil.toTimestamp(objs[n++]));
//					pst.setInt(++i, DataUtil.toInt(objs[n++]));
//					pst.setString(++i, DataUtil.toString(objs[n++]));    
//					return pst;
//				}}, keyHolder);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return keyHolder.getKey().intValue();
//	}
	
	
	/**
	 *修改
	 */
	public void editJbgk(Jbgk jbgk) throws Exception {
		String sql = " update jbgk set jbgk_title=?,jbgk_type=?,jbgk_content=?,sub_date=?,user_id=?,hold=?  where jbgk_id=? ";
		Object[] objs = {jbgk.getJbgkTitle(),jbgk.getJbgkType(),jbgk.getJbgkContent(),jbgk.getSubDate(),jbgk.getSysUser().getUserID(),jbgk.getHold(),jbgk.getJbgkID()};
		this.getJdbcTemplate().update(sql,objs);   
	}
	
//	/**
//	 *删除
//	 */
//	public void deleteJbgkByID(int id) throws Exception {
//		String sql = " delete from jbgk where jbgk_id="+id;
//		this.getJdbcTemplate().update(sql);
//	}
	
	 
	
 
	
	
	 
	

}
