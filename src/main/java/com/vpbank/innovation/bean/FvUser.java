/*
 * Created on 2022-04-14 ( Time 09:45:05 )
 * Generated by Telosys Tools Generator ( version 3.1.2 )
 */
package com.vpbank.innovation.bean;

import java.io.Serializable;

import javax.validation.constraints.*;

import java.math.BigDecimal;
import java.util.Date;

public class FvUser implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @NotNull
    private BigDecimal id;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Size( max = 255 )
    private String fullName;

    @Size( max = 20 )
    private String mobileNumber;

    @Size( max = 255 )
    private String email;

    @Size( max = 255 )
    private String userName;

    @Size( max = 255 )
    private String passWord;

    @Size( max = 20 )
    private String status;


    private Date createdOn;

    @Size( max = 250 )
    private String createdBy;


    private Date modifiedOn;

    @Size( max = 250 )
    private String modifiedBy;


    private Date lastLoginDate;

    @Size( max = 255 )
    private String lastLoginIp;

    @Size( max = 255 )
    private String role;


    private BigDecimal regionId;


    private BigDecimal provinceId;

    @Size( max = 32 )
    private String mbca;

    @Size( max = 200 )
    private String gps;

    @Size( max = 200 )
    private String branchName;


    private BigDecimal adNewDefault;


    private BigDecimal adUploadDefault;

    @Size( max = 250 )
    private String deviceId;

    @Size( max = 250 )
    private String playerId;



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setId( BigDecimal id ) {
        this.id = id ;
    }

    public BigDecimal getId() {
        return this.id;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setFullName( String fullName ) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return this.fullName;
    }

    public void setMobileNumber( String mobileNumber ) {
        this.mobileNumber = mobileNumber;
    }
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public void setEmail( String email ) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }

    public void setUserName( String userName ) {
        this.userName = userName;
    }
    public String getUserName() {
        return this.userName;
    }

    public void setPassWord( String passWord ) {
        this.passWord = passWord;
    }
    public String getPassWord() {
        return this.passWord;
    }

    public void setStatus( String status ) {
        this.status = status;
    }
    public String getStatus() {
        return this.status;
    }

    public void setCreatedOn( Date createdOn ) {
        this.createdOn = createdOn;
    }
    public Date getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedBy( String createdBy ) {
        this.createdBy = createdBy;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setModifiedOn( Date modifiedOn ) {
        this.modifiedOn = modifiedOn;
    }
    public Date getModifiedOn() {
        return this.modifiedOn;
    }

    public void setModifiedBy( String modifiedBy ) {
        this.modifiedBy = modifiedBy;
    }
    public String getModifiedBy() {
        return this.modifiedBy;
    }

    public void setLastLoginDate( Date lastLoginDate ) {
        this.lastLoginDate = lastLoginDate;
    }
    public Date getLastLoginDate() {
        return this.lastLoginDate;
    }

    public void setLastLoginIp( String lastLoginIp ) {
        this.lastLoginIp = lastLoginIp;
    }
    public String getLastLoginIp() {
        return this.lastLoginIp;
    }

    public void setRole( String role ) {
        this.role = role;
    }
    public String getRole() {
        return this.role;
    }

    public void setRegionId( BigDecimal regionId ) {
        this.regionId = regionId;
    }
    public BigDecimal getRegionId() {
        return this.regionId;
    }

    public void setProvinceId( BigDecimal provinceId ) {
        this.provinceId = provinceId;
    }
    public BigDecimal getProvinceId() {
        return this.provinceId;
    }

    public void setMbca( String mbca ) {
        this.mbca = mbca;
    }
    public String getMbca() {
        return this.mbca;
    }

    public void setGps( String gps ) {
        this.gps = gps;
    }
    public String getGps() {
        return this.gps;
    }

    public void setBranchName( String branchName ) {
        this.branchName = branchName;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public void setAdNewDefault( BigDecimal adNewDefault ) {
        this.adNewDefault = adNewDefault;
    }
    public BigDecimal getAdNewDefault() {
        return this.adNewDefault;
    }

    public void setAdUploadDefault( BigDecimal adUploadDefault ) {
        this.adUploadDefault = adUploadDefault;
    }
    public BigDecimal getAdUploadDefault() {
        return this.adUploadDefault;
    }

    public void setDeviceId( String deviceId ) {
        this.deviceId = deviceId;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public void setPlayerId( String playerId ) {
        this.playerId = playerId;
    }
    public String getPlayerId() {
        return this.playerId;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 
        public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(id);
        sb.append("|");
        sb.append(fullName);
        sb.append("|");
        sb.append(mobileNumber);
        sb.append("|");
        sb.append(email);
        sb.append("|");
        sb.append(userName);
        sb.append("|");
        sb.append(passWord);
        sb.append("|");
        sb.append(status);
        sb.append("|");
        sb.append(createdOn);
        sb.append("|");
        sb.append(createdBy);
        sb.append("|");
        sb.append(modifiedOn);
        sb.append("|");
        sb.append(modifiedBy);
        sb.append("|");
        sb.append(lastLoginDate);
        sb.append("|");
        sb.append(lastLoginIp);
        sb.append("|");
        sb.append(role);
        sb.append("|");
        sb.append(regionId);
        sb.append("|");
        sb.append(provinceId);
        sb.append("|");
        sb.append(mbca);
        sb.append("|");
        sb.append(gps);
        sb.append("|");
        sb.append(branchName);
        sb.append("|");
        sb.append(adNewDefault);
        sb.append("|");
        sb.append(adUploadDefault);
        sb.append("|");
        sb.append(deviceId);
        sb.append("|");
        sb.append(playerId);
        return sb.toString(); 
    } 


}
