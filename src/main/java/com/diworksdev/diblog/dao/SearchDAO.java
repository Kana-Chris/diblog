package com.diworksdev.diblog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.diworksdev.diblog.dto.SelectDTO;
import com.diworksdev.diblog.util.DBConnector;

public class SearchDAO {
  DBConnector dbconnector = new DBConnector();
  private String sql;
  private int errorFlag=0;
  SelectDTO selectDTO = new SelectDTO();
  List<SelectDTO> searchList = new ArrayList<SelectDTO>();
  Connection connection;
  public List<SelectDTO> search(String family_name,
		  					  String last_name,
		  					  String family_name_kana,
		  					  String last_name_kana,
		  					  String mail,
		  					  String gender,
		  					  String authority){
	  
	  try {
		  connection = dbconnector.getConnection();
		  int num = 0; //検索する要素数
		  
		  PreparedStatement preparedStatement;
		  if(family_name.equals("")&&
			 last_name.equals("")&&
			 family_name_kana.equals("")&&
			 last_name_kana.equals("")&&
			 mail.equals("")){	
			  sql ="SELECT * FROM user_info ";
			  	if(gender.equals("男")) {
			  		sql +=" WHERE gender=0 ";
			  	}else {
			  		sql +=" WHERE gender=1 ";
			  	}
			  	
			  	if(authority.equals("一般")) {
			  		sql += "and authority=0;";
			  	}else {
			  		sql += "and authority=1;";
			  	}
			
			 preparedStatement = connection.prepareStatement(sql);
		  	 
		  }else {
			  sql ="SELECT * FROM user_info WHERE ";     //検索欄に入力があれば一部検索
			  					
			  if(!family_name.equals("")) {
				  sql = sql + "family_name LIKE ?";
				  num++;
				  
			  }
			  if(!last_name.equals("")) {
				  if(num>=1) {
					  sql+=" and ";
				  }
				  sql+=" last_name LIKE ?";
				  num++;
			  }
			  if(!family_name_kana.equals("")) {
				  if(num>=1) {
					  sql+=" and ";
				  }
				  sql+="family_name_kana LIKE ?";
				  num++;
			  }
			  if(!last_name_kana.equals("")) {
				  if(num>=1) {
					  sql+=" and ";
				  }
				  sql+=" last_name_kana LIKE ?";
				  num++;
			  }
			  if(!mail.equals("")) {
				  if(num>=1) {
					  sql+=" and ";
				  }
				  sql+=" mail LIKE ?";
				  num++;
			  }
			  if(gender.equals("男")) {
				  sql+=" and gender=0 ";
				  num++;
			  }else if(gender.equals("女")) {
				  sql+=" and gender=1 ";
				  num++;
			  }
			  if(authority.equals("一般")) {
				  sql+=" and authority=0";
				  num++;
			  }else if(authority.equals("管理者")) {
				  sql+=" and authority=1";
				  num++;
			  }
			 
		  }
		  
		  preparedStatement = connection.prepareStatement(sql);	
		  int count=1;			
		  if(!family_name.equals("")) {
			  family_name = "%"+family_name+"%";
			  preparedStatement.setString(count,family_name);	
			  count++;
		  }
		  if(!last_name.equals("")) {
			  last_name = "%"+last_name+"%";
			  preparedStatement.setString(count,last_name);
			  count++;
		  }
		  if(!family_name_kana.equals("")) {
			  family_name_kana = "%"+family_name_kana+"%";
			  preparedStatement.setString(count,family_name_kana);
			  count++;
		  }
		  if(!last_name_kana.equals("")) {
			  last_name_kana = "%"+last_name_kana+"%";
			  preparedStatement.setString(count,last_name_kana);
			  count++;
		  }
		  if(!mail.equals("")) {
			  mail = "%"+mail+"%";
			  preparedStatement.setString(count,mail);
		  }
		  
		  ResultSet resultSet = preparedStatement.executeQuery();
		  while(resultSet.next()) {
			  SelectDTO selectDTO = new SelectDTO();
			  selectDTO.setId(resultSet.getInt("id"));
			  selectDTO.setFamily_name(resultSet.getString("family_name"));
			  selectDTO.setLast_name(resultSet.getString("last_name"));
			  selectDTO.setFamily_name_kana(resultSet.getString("family_name_kana"));
			  selectDTO.setLast_name_kana(resultSet.getString("last_name_kana"));
			  selectDTO.setMail(resultSet.getString("mail"));
			 if(resultSet.getInt("gender")==0){
				 selectDTO.setGender("男");
			 }else {
				 selectDTO.setGender("女");
			 }
			  
			  selectDTO.setPostal_code(resultSet.getString("postal_code"));
			  selectDTO.setPrefecture(resultSet.getString("prefecture"));
			  selectDTO.setAddress_1(resultSet.getString("address_1"));
			  selectDTO.setAddress_2(resultSet.getString("address_2"));
			  
			 if(resultSet.getInt("authority")==0) {
				 selectDTO.setAuthority("一般");
			 }else {
				 selectDTO.setAuthority("管理者");
			 }
			 if(resultSet.getInt("delete_flag")==0){
				 selectDTO.setDelete_flag("有効");
			 }else {
				 selectDTO.setDelete_flag("無効");
			 }	
			
			String registared_time = resultSet.getDate("registared_time").toString();
			selectDTO.setRegistared_time(registared_time);
			
			if(resultSet.getString("update_time")!=null){
				String update_time = resultSet.getDate("update_time").toString();
				selectDTO.setUpdate_time(update_time);
			}else {
					selectDTO.setUpdate_time("");
			}
		
			searchList.add(selectDTO);
			  	
		  }
	  }catch(SQLException e) {
		 setErrorFlag(1);
		 System.out.println(sql);
		 
	  }catch(Exception e) {
		 setErrorFlag(1);
		 System.out.println(sql);
	  }
	  finally {
		  if(connection!=null) {
			  try {
			  connection.close();
			  }catch(SQLException e) {
				  e.printStackTrace();
			  }
		  }
	  }
	  return searchList;
  }
  
  public void setErrorFlag(int errorFlag) {
	  this.errorFlag = errorFlag;
  }
  public int getErrorFlag() {
	  return errorFlag;
  }
  
}
