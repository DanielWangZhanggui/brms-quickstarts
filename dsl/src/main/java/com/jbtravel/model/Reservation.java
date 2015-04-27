package com.jbtravel.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Reservation implements Serializable {
	private static final long serialVersionUID = 1L;


	private Integer reservationid;

	private Integer checkedin;

	private String comment;
	
	private boolean upgradeclass;
	private BigDecimal classFee = new BigDecimal(0.00);
	private boolean mealUpgrade;
	private BigDecimal mealFee = new BigDecimal(0.00);
	private boolean upgradecomfort;
	private boolean bagcheck;
	private Integer bags = 0;
	private boolean upgradeentertainment;
	private boolean upgradedrink;
	private boolean tripinsurance;
	

	public Reservation() {
	}

	public Integer getReservationid() {
		return this.reservationid;
	}

	public void setReservationid(Integer reservationid) {
		this.reservationid = reservationid;
	}

	public Integer getCheckedin() {
		return this.checkedin;
	}

	public void setCheckedin(Integer checkedin) {
		this.checkedin = checkedin;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean isUpgradeclass() {
		return upgradeclass;
	}

	public void setUpgradeclass(boolean upgradeclass) {
		this.upgradeclass = upgradeclass;
	}

	public boolean isMealUpgrade() {
		return mealUpgrade;
	}

	public void setMealUpgrade(boolean mealUpgrade) {
		this.mealUpgrade = mealUpgrade;
	}

	public boolean isUpgradecomfort() {
		return upgradecomfort;
	}

	public void setUpgradecomfort(boolean upgradecomfort) {
		this.upgradecomfort = upgradecomfort;
	}

	public boolean isBagcheck() {
		return bagcheck;
	}

	public void setBagcheck(boolean bagcheck) {
		this.bagcheck = bagcheck;
	}

	public Integer getBags() {
		return bags;
	}

	public void setBags(Integer bags) {
		this.bags = bags;
	}

	public boolean isUpgradeentertainment() {
		return upgradeentertainment;
	}

	public void setUpgradeentertainment(boolean upgradeentertainment) {
		this.upgradeentertainment = upgradeentertainment;
	}

	public boolean isUpgradedrink() {
		return upgradedrink;
	}

	public void setUpgradedrink(boolean upgradedrink) {
		this.upgradedrink = upgradedrink;
	}

	public boolean isTripinsurance() {
		return tripinsurance;
	}

	public void setTripinsurance(boolean tripinsurance) {
		this.tripinsurance = tripinsurance;
	}

	public BigDecimal getMealFee() {
		return mealFee;
	}

	public void setMealFee(BigDecimal mealFee) {
		this.mealFee = mealFee;
	}

	public BigDecimal getClassFee() {
		return classFee;
	}

	public void setClassFee(BigDecimal classFee) {
		this.classFee = classFee;
	}

}