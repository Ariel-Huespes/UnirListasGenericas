package unionListaGenericos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class UnionListas<T extends Comparable<? super T>>{

	
	public List<T> union (List<T> l1, List<T> l2){
		List<T> union = new ArrayList<T>();
		
		Set<T> conjunto = new HashSet<T>();
		List<T> aux = new LinkedList<T>();
		
		for (T t : l1) {
			conjunto.add(t);
		}
		for (T t : conjunto) {
			aux.add(t);
		}
		
		Set<T> conjunto2 = new HashSet<T>();
		List<T> aux2 = new LinkedList<T>();
		
		for (T t : l2) {
			conjunto2.add(t);
		}
		for (T t : conjunto2) {
			aux2.add(t);
		}
		
		for (T t : aux) {
			union.add(t);
		}
		
		for (T t : aux2) {
			union.add(t);
		}
		
		Set<T> conjunto3 = new HashSet<T>();
		List<T> aux3 = new LinkedList<T>();
		
		for (T t : union) {
			conjunto3.add(t);
		}
		for (T t : conjunto3) {
			aux3.add(t);
		}
		
		
		return aux3;
	}
	public List<T> interseccion (List<T> l1, List<T> l2){
		List<T> union = new ArrayList<T>();
		
		Set<T> conjunto = new HashSet<T>();
		List<T> aux = new LinkedList<T>();
		
		for (T t : l1) {
			for (T t2 : l2) {
				if(t.equals(t2)) {
					aux.add(t2);
				}
			}
		}
		
		for (T t : aux) {
			conjunto.add(t);
		}
		for (T t : conjunto) {
			union.add(t);
		}
		
		
		return union;
	}
	public static void main(String[] args) {
		UnionListas union = new UnionListas();
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		
		l1.add(3);
		l1.add(2);
		l1.add(-1);
		l1.add(-1);
		l1.add(4);
		l1.add(5);
		l1.add(7);
		
		l2.add(-1);
		l2.add(3);
		l2.add(3);
		l2.add(40);
		l2.add(5);
		l2.add(-1);
		l2.add(12);
		
		List<Integer> esperado = new ArrayList<Integer>();
		esperado.add(3);
		esperado.add(2);
		esperado.add(-1);
		esperado.add(4);
		esperado.add(5);
		esperado.add(7);
		esperado.add(40);
		esperado.add(12);
		
		System.out.println(union.union(l1, l2));
		
		System.out.println(union.interseccion(l1, l2));
		
		List<String> l3 = new ArrayList<String>();
		List<String> l4 = new ArrayList<String>();
		
		l3.add(" Hola");
		l3.add(" Mundo");
		l3.add(" Java");
		l3.add(" Hola");
		l3.add(" Mundo");
		
		l4.add(" Hola");
		l4.add(" Programo");
		l4.add(" Carlos");
		l4.add(" Mundo");
		
		System.out.println(union.union(l3, l4));
		System.out.println(union.interseccion(l3, l4));
		
	}
	
}
