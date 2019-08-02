package com.dg.pojo;


import java.io.Serializable;

public class TAdmin implements Serializable {

  private String adminId;
  private String adminname;
  private String adminpwd;

  public TAdmin() {
  }

  public TAdmin(String adminId, String adminname, String adminpwd) {
    this.adminId = adminId;
    this.adminname = adminname;
    this.adminpwd = adminpwd;
      System.out.println("555");
  }

  @Override
  public String toString() {
    return "TAdmin{" +
            "adminId='" + adminId + '\'' +
            ", adminname='" + adminname + '\'' +
            ", adminpwd='" + adminpwd + '\'' +
            '}';
  }

  public String getAdminId() {
    return adminId;
  }

  public void setAdminId(String adminId) {
    this.adminId = adminId;
  }


  public String getAdminname() {
    return adminname;
  }

  public void setAdminname(String adminname) {
    this.adminname = adminname;
  }


  public String getAdminpwd() {
    return adminpwd;
  }

  public void setAdminpwd(String adminpwd) {
    this.adminpwd = adminpwd;
  }

}
