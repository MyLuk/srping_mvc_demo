package lucky.myluk.mvc;

import org.springframework.beans.factory.annotation.Value;

import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String LastName;
    private String country;
    private String favoriteLanguage;

    private String[] availableOperationSystems = {"MacOS", "Ubuntu", "Windows", "AstraLinux", "Suse"};

    private String[] operatingSystems;

    public String[] getAvailableOperationSystems() {
        return availableOperationSystems;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }




//    private LinkedHashMap<String, String> countryOptions;

//    public Student() {
//        countryOptions = new LinkedHashMap<>();
//        countryOptions.put("RU", "Russia");
//        countryOptions.put("DE", "Germany");
//        countryOptions.put("IN", "India");
//        countryOptions.put("US", "USA");
//    }

//    public LinkedHashMap<String, String> getCountryOptions() {
//        return countryOptions;
//    }


    public String getFirstName() {
        return firstName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getLastName() {
        return LastName;
    }
}
