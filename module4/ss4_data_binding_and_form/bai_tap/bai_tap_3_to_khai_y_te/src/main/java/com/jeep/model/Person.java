package com.jeep.model;

public class Person {
    private String fullName;
    private int yearOfBirth;
    private String gender;
    private String nationality;
    private String idCard;
    private String travelInfo;
    private String signalPlate;
    private String seatNumber;
    private String startDate;
    private String endDate;
    private String travel14DaysInfo;

    public Person() {
    }

    public Person(String fullName, int yearOfBirth, String gender, String nationality,
                  String idCard, String travelInfo, String signalPlate, String seatNumber,
                  String startDate, String endDate, String travel14DaysInfo) {
        this.fullName = fullName;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.nationality = nationality;
        this.idCard = idCard;
        this.travelInfo = travelInfo;
        this.signalPlate = signalPlate;
        this.seatNumber = seatNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.travel14DaysInfo = travel14DaysInfo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getTravelInfo() {
        return travelInfo;
    }

    public void setTravelInfo(String travelInfo) {
        this.travelInfo = travelInfo;
    }

    public String getSignalPlate() {
        return signalPlate;
    }

    public void setSignalPlate(String signalPlate) {
        this.signalPlate = signalPlate;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getTravel14DaysInfo() {
        return travel14DaysInfo;
    }

    public void setTravel14DaysInfo(String travel14DaysInfo) {
        this.travel14DaysInfo = travel14DaysInfo;
    }
}
