package com.diworksdev.diblog.dto;

public class LoginDTO {
  private String mail;
  private String password;
  private String authority;
  
  public void setMail(String mail) {
	  this.mail=mail;
  }
  
  public String getMail() {
	  return mail;
  }
  
  public void setPassword(String password) {
	  this.password = password;
  }
  
  public String getPassword() {
	  return password;
  }
  
  public void setAuthority(String authority) {
	  this.authority = authority;
  }
  
  public String getAuthority() {
	  return authority;
  }
}
