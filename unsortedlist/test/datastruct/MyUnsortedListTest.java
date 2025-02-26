package datastruct;

import static org.junit.Assert.*;

import org.junit.Test;


public class MyUnsortedListTest {
	
	public MyUnsortedListTest() {
	}
	
	@Test
	public void creat() {
		UnsortedList<Integer> integers = MyUnsortedList.of();
		assertNotNull("Liste non vide conciderait comme vide",integers);
	}

	@Test
	public void notEmptyListe() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1, 2, 3, 4);
		assertFalse("Liste non vide conciderait comme vide",integers.isEmpty());
	}
	
	@Test
	public void emptyListe() {
		UnsortedList<Integer> integers = MyUnsortedList.of();
		assertTrue("Liste vide conciderait comme non vide",integers.isEmpty());
	}
	
	@Test
	public void size0() {
		UnsortedList<Integer> integers = MyUnsortedList.of();
		assertEquals("Liste taille 0 mais renvois autre",integers.size(),0);
	}
	
	@Test
	public void size1() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1);
		assertEquals("Liste taille 1 mais renvois autre",integers.size(),1);
	}
	
	@Test
	public void sizeSup() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1, 2, 3, 4);
		assertEquals("Liste taille 4 mais renvois autre",integers.size(),4);
	}
	
	@Test
	public void equalBass() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1, 2, 3, 4);
		UnsortedList<Integer> integers2 = MyUnsortedList.of(1, 2, 3, 4);
		assertEquals("Liste identique mais ici non",integers,integers2);
	}
	
	@Test
	public void equalVide() {
		UnsortedList<Integer> integers = MyUnsortedList.of();
		UnsortedList<Integer> integers2 = MyUnsortedList.of();
		assertEquals("Liste identique mais ici non",integers,integers2);
	}
	
	@Test
	public void equalOne() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1);
		UnsortedList<Integer> integers2 = MyUnsortedList.of(1);
		assertEquals("Liste identique mais ici non",integers,integers2);
	}
	
	
	@Test
	public void prependOne() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1);
		UnsortedList<Integer> integers2 = MyUnsortedList.of(2,1);
		integers.prepend(2);
		assertEquals("prepend a 1 lement erreur",integers,integers2);
	}
	
	@Test
	public void prependVide() {
		UnsortedList<Integer> integers = MyUnsortedList.of();
		UnsortedList<Integer> integers2 = MyUnsortedList.of(2);
		integers.prepend(2);
		assertEquals("apend dans une liste vide erreur",integers,integers2);
	}
	
	@Test
	public void prependbass() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1,3,5);
		UnsortedList<Integer> integers2 = MyUnsortedList.of(2,1,3,5);
		integers.prepend(2);
		assertEquals("append liste grande taille",integers,integers2);
	}
	
	@Test
	public void appendOne() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1);
		UnsortedList<Integer> integers2 = MyUnsortedList.of(1,2);
		integers.append(2);
		assertEquals("prepend a 1 lement erreur",integers,integers2);
	}
	
	@Test
	public void appendVide() {
		UnsortedList<Integer> integers = MyUnsortedList.of();
		UnsortedList<Integer> integers2 = MyUnsortedList.of(2);
		integers.append(2);
		assertEquals("apend dans une liste vide erreur",integers,integers2);
	}
	
	@Test
	public void appendbass() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1,3,5);
		UnsortedList<Integer> integers2 = MyUnsortedList.of(1,3,5,2);
		integers.append(2);
		assertEquals("append liste grande taille",integers,integers2);
	}
	
	@Test
	public void popOneListe() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1);
		UnsortedList<Integer> integers2 = MyUnsortedList.of();
		integers.pop();
		assertEquals("liste [1] ne devien pas []",integers,integers2);
		
	}
	
	@Test
	public void popbassListe() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1,3,5);
		UnsortedList<Integer> integers2 = MyUnsortedList.of(3,5);
		integers.pop();
		assertEquals("liste [1,3,5] ne devient pas [3,5]",integers,integers2);
	}
	
	@Test
	public void popOneElement() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1);
		int e = integers.pop();
		assertTrue("element pop n'est pas bon",e==1);
		
	}
	
	@Test
	public void popbassElement() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1,3,5);
		int e = integers.pop();
		assertTrue("element pop n'est pas bon",e==1);
	}
	
	@Test(expected = EmptyListException.class)
	public void popVide() throws Exception{
		UnsortedList<Integer> integers = MyUnsortedList.of();
		integers.pop();
	}
	
	@Test
	public void popLastOneListe() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1);
		UnsortedList<Integer> integers2 = MyUnsortedList.of();
		integers.popLast();
		assertEquals("liste [1] ne devien pas []",integers,integers2);
		
	}
	
	@Test
	public void popLastbassListe() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1,3,5);
		UnsortedList<Integer> integers2 = MyUnsortedList.of(1,3);
		integers.popLast();
		assertEquals("liste [1,3,5] ne devient pas [1,3]",integers,integers2);
	}
	
	@Test
	public void popLastOneElement() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1);
		int e = integers.popLast();
		assertTrue("element pop n'est pas bon",e==1);
		
	}
	
	@Test
	public void popLastbassElement() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1,3,5);
		int e = integers.popLast();
		assertTrue("element pop n'est pas bon",e==5);
	}
	
	@Test(expected = EmptyListException.class)
	public void popLastVide() throws Exception{
		UnsortedList<Integer> integers = MyUnsortedList.of();
		integers.popLast();
	}
	
	@Test
	public void InsertVide() {
		UnsortedList<Integer> integers = MyUnsortedList.of();
		UnsortedList<Integer> integers2 = MyUnsortedList.of(1);
		integers.insert(1, 0);
		assertEquals("liste [] ne devient pas [1]",integers,integers2);
	}
	
	@Test
	public void InsertOneDebut() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1);
		UnsortedList<Integer> integers2 = MyUnsortedList.of(2,1);
		integers.insert(2, 0);
		assertEquals("liste [1] ne devient pas [2,1]",integers,integers2);
	}
	
	@Test
	public void InsertOneFin() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1);
		UnsortedList<Integer> integers2 = MyUnsortedList.of(1,2);
		integers.insert(2, 1);
		assertEquals("liste [1] ne devient pas [1,2]",integers,integers2);
	}
	
	@Test
	public void InsertBaseDebut() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1,2,3,4);
		UnsortedList<Integer> integers2 = MyUnsortedList.of(5,1,2,3,4);
		integers.insert(5, 0);
		assertEquals("liste [1,2,3,4] ne devient pas [5,1,2,3,4]",integers,integers2);
	}
	
	@Test
	public void InsertBaseMid() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1,2,3,4);
		UnsortedList<Integer> integers2 = MyUnsortedList.of(1,2,3,5,4);
		integers.insert(5, 3);
		assertEquals("liste [1,2,3,4] ne devient pas [1,2,3,5,4]",integers,integers2);
	}
	
	@Test
	public void InsertBaseFin() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1,2,3,4);
		UnsortedList<Integer> integers2 = MyUnsortedList.of(1,2,3,4,5);
		integers.insert(5,4);
		assertEquals("liste [1,2,3,4] ne devient pas [1,2,3,4,5]",integers,integers2);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void InsertOut() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1,2,3,4);
		integers.insert(5,40);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void InsertNeg() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1,2,3,4);
		integers.insert(5,-1);
	}
	
	@Test
	public void removeOne() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1);
		UnsortedList<Integer> integers2 = MyUnsortedList.of();
		integers.remove(0);
		assertEquals("liste [1] ne devient pas []",integers,integers2);
	}
	
	@Test
	public void remove2Debut() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1,2);
		UnsortedList<Integer> integers2 = MyUnsortedList.of(2);
		integers.remove(0);
		assertEquals("liste [1,2] ne devient pas [2]",integers,integers2);
	}
	
	@Test
	public void remove2Fin() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1,2);
		UnsortedList<Integer> integers2 = MyUnsortedList.of(1);
		integers.remove(1);
		assertEquals("liste [1,2] ne devient pas [1]",integers,integers2);
	}
	
	@Test
	public void removeBasseDebut() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1,2,3,4,5);
		UnsortedList<Integer> integers2 = MyUnsortedList.of(2,3,4,5);
		integers.remove(0);
		assertEquals("liste [1,2] ne devient pas [2]",integers,integers2);
	}
	
	@Test
	public void removeBasseFin() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1,2,3,4,5);
		UnsortedList<Integer> integers2 = MyUnsortedList.of(1,2,3,4);
		integers.remove(4);
		assertEquals("liste [1,2,3,4,5] ne devient pas [1,2,3,4]",integers,integers2);
	}
	
	@Test
	public void removeBasseMid() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1,2,3,4,5);
		UnsortedList<Integer> integers2 = MyUnsortedList.of(1,2,4,5);
		integers.remove(2);
		assertEquals("liste [1,2,3,4,5] ne devient pas [1,2,4,5]",integers,integers2);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void removeOut() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1,2,3,4);
		integers.remove(42);
	}
	
	@Test
	public void notequalBass() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1,2,3,4,5);
		UnsortedList<Integer> integers2 = MyUnsortedList.of(1,2,4,5);
		assertNotEquals("liste [1,2,3,4,5] == [1,2,4,5]",integers,integers2);
	}
	
	@Test
	public void notequalOne() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1);
		UnsortedList<Integer> integers2 = MyUnsortedList.of(5);
		assertNotEquals("liste [1] == [5]",integers,integers2);
	}
	
	@Test
	public void pasUneList() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1,2,3,4,5);
		assertNotEquals("pour le 100%",integers,42);
	}
	
	@Test
	public void affiche() {
		UnsortedList<Integer> integers = MyUnsortedList.of(1,2,3,4,5);
		assertNotNull("100% afficher",integers.toString());
	}
}