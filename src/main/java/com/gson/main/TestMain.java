package com.gson.main;

import java.io.StringWriter;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

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
		
		
		//xml
		Serializer serializer = new Persister();
		StringWriter stringWriter=new StringWriter();
		try {
			serializer.write(valor, stringWriter);
			System.out.println(stringWriter.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
