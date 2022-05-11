package com.muzafferatmaca.szlkuygulamas;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Kelimeler implements Serializable {

	@SerializedName("turkce")
	private String turkce;

	@SerializedName("kelime_id")
	private String kelimeId;

	@SerializedName("ingilizce")
	private String ingilizce;

	public String getTurkce() {
		return turkce;
	}

	public void setTurkce(String turkce) {
		this.turkce = turkce;
	}

	public String getKelimeId() {
		return kelimeId;
	}

	public void setKelimeId(String kelimeId) {
		this.kelimeId = kelimeId;
	}

	public String getIngilizce() {
		return ingilizce;
	}

	public void setIngilizce(String ingilizce) {
		this.ingilizce = ingilizce;
	}
}