package com.gana;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Even {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add(20);
		al.add(50);
		al.add(30);
		al.add(15);
		al.add(25);
		System.out.println(al);
		List<Integer>l=al.stream().map  (I->I*2).collect(Collectors.toList());
		System.out.println(l);
	}

}
