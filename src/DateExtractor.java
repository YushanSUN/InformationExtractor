import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Reference implementation for the class "Web Search - Information Extraction"
 * at Telecom ParisTech, Paris, France in Spring 2011
 *
 * @author Fabian M. Suchanek
 *
 * Extracts the first date from a page.
 */

public class DateExtractor extends Extractor {
	
	/** Extracts the first date from a page*/
	@Override
	public Triple extract(Page page) {
		String subject = page.title;
		String predicate = "hasDate";
		String object = null;
		
		Pattern pattern=Pattern.compile("(January|February|March|April|May|June|July|August|September|October|November|December) (\\d)?\\d, \\d\\d\\d\\d");
		Matcher matcher=pattern.matcher(page.content);
		boolean found = false;
		
		while(matcher.find()) {
			  // matcher.group(N) holds the N-th group of the match
			  // matcher.group() holds the entire match
			found = true;
			object = matcher.group();
			Triple triple = new Triple(subject,predicate,object);
			return triple;
		}
		
		return null;
       	//Triple triple = new Triple(subject,predicate,object);
	    //return triple;
	}
	
	public static void main(String[] args) throws IOException {
		for(Triple triple : new DateExtractor().run(new File(args[0]))) { 
		    System.out.println(triple); 
		  } 
		  // For example: new DateExtractor().run(new File(args[0])));
	}
}














