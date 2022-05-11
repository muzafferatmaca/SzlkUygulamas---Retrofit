package com.muzafferatmaca.szlkuygulamas;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class KelimelerCevap {

	@SerializedName("kelimeler")
	private List<Kelimeler> kelimeler;

	@SerializedName("success")
	private int success;

	public List<Kelimeler> getKelimeler(){
		return kelimeler;
	}

	public int getSuccess(){
		return success;
	}
}