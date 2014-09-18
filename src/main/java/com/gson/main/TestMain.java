package com.gson.main;

import com.google.gson.Gson;

public class TestMain {

	public static void main(String[] args) {
		Objeto obj=new Objeto("1","2");
		Gson gson = new Gson();
		String json;
		json=gson.toJson(obj);
		System.out.println(json);
		Objeto valor;
		
		valor = gson.fromJson(json,Objeto.class);
		System.out.println(valor.getAtributo()+" "+valor.getAtributo2());

	}

}
