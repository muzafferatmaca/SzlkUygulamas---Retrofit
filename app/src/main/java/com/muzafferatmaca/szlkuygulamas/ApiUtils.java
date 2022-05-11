package com.muzafferatmaca.szlkuygulamas;

public class ApiUtils {

    public static final String BASE_URL = "http://kasimadalan.pe.hu";

    public static KelimelerDaoInterface kisilerDataAccessObject(){

        return RetrofitClient.getClient(BASE_URL).create(KelimelerDaoInterface.class);

    }

}
