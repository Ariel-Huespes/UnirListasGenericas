package unionListaGenericos;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class UnionListasTest {

	@Test
	public void test() {
		UnionListas<Integer> union = new UnionListas<Integer>();
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
		esperado.add(-1);
		esperado.add(2);
		esperado.add(3);
		esperado.add(4);
		esperado.add(5);
		esperado.add(7);
		esperado.add(40);
		esperado.add(12);
		
		union.union(l1, l2);
		
		assertEquals(esperado,union);
		
	}

}
