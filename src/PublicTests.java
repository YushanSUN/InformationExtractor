import java.io.IOException;

public class PublicTests extends BaseTests {
	
	public PublicTests() throws IOException {
		super();
	}
	
	public void test1() {
		assertTrue(dateTriples.contains(new Triple("South Africa", "hasDate", "May 31, 1910")));
	}
	
	public void test2() {
		assertTrue(dateTriples.contains(new Triple("Karl Marx", "hasDate", "May 5, 1818")));
	}
	
	public void test3() {
		assertTrue(dateTriples.contains(new Triple("Michelangelo", "hasDate", "March 6, 1475")));		
	}
	
	public void test4() {
		assertTrue(dateTriples.contains(new Triple("Henry Ford", "hasDate", "July 30, 1863")));		
	}
	
	public void test5() {
		assertTrue(dateTriples.contains(new Triple("Joseph Stalin", "hasDate", "March 5, 1953")));		
	}
	
	public void test6() {
		assertTrue(dateTriples.contains(new Triple("Napoleon Bonaparte", "hasDate", "August 15, 1769")));		
	}
	
	public void test7() {
		assertTrue(dateTriples.contains(new Triple("James I of Scotland", "hasDate", "December 10, 1394")));		
	}
	
	public void test8() {
		assertTrue(dateTriples.contains(new Triple("John Hutton", "hasDate", "May 6, 1955")));		
	}
	
	public void test9() {
		assertTrue(dateTriples.contains(new Triple("Hoang Hoa Tham", "hasDate", "February 10, 1913")));		
	}

	public void test10() {
		assertTrue(dateTriples.contains(new Triple("Julio Lugo", "hasDate", "November 16, 1975")));		
	}	
	
	public void test11() {
		assertTrue(typeTriples.contains(new Triple("Chemistry", "type", "science")));				
	}

	public void test12() {
		assertTrue(typeTriples.contains(new Triple("Montreal", "type", "city")));				
	}	
	
	public void test13() {
		assertTrue(typeTriples.contains(new Triple("1999", "type", "year")));
	}
	
	public void test14() {
		assertTrue(
				typeTriples.contains(new Triple("Galileo Galilei", "type", "Italian astronomer"))
				|| typeTriples.contains(new Triple("Galileo Galilei", "type", "astronomer"))
				);
	}
	
	public void test15() {
		assertTrue(
				typeTriples.contains(new Triple("Willem Einthoven", "type", "Dutch doctor"))
				|| typeTriples.contains(new Triple("Willem Einthoven", "type", "doctor"))
				);
	}
	
	public void test16() {
		assertTrue(
				typeTriples.contains(new Triple("Alan Turing", "type", "English mathematician")) 
				|| typeTriples.contains(new Triple("Alan Turing", "type", "mathematician"))
				);
	}
	
	public void test17() {
		assertTrue(typeTriples.contains(new Triple("Cuba", "type", "country")));
	}
	
	public void test18() {
		assertTrue(typeTriples.contains(new Triple("Louvagny", "type", "commune")));
	}
	
	public void test19() {
		assertTrue(
				typeTriples.contains(new Triple("Zard", "type", "J-pop music group"))
				|| 	typeTriples.contains(new Triple("Zard", "type", "music group"))
				|| 	typeTriples.contains(new Triple("Zard", "type", "group"))
				);
	}
	
	public void test20() {
		assertTrue(
				typeTriples.contains(new Triple("Ciara", "type", "American singer"))
				|| 	typeTriples.contains(new Triple("Ciara", "type", "singer")));
	}
}