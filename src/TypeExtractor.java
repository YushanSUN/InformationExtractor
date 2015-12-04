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
 * This extractor extracts the type of the article entity.
 */
	public class TypeExtractor extends Extractor {
		 /** Extracts the type of the article entity*/
		 @Override
		 public Triple extract(Page page) {
		        String firstSen = page.firstSentence();
		        
		        Triple resultat = null;
		        
		        //String name = " ";
		        //String typeName = " ";
		        String pattern0 = "(is|was)\\s(a|an|the)\\s([a-zA-Z-\\s]+)";
		        String pattern1 = "(is|was)\\s(a|an|the)\\s([a-zA-Z-\\s]+)\\s(in)\\s([a-zA-Z-\\s]+)of";
		        String pattern2 = "(is|was)\\s(a|an|the)\\s([a-zA-Z-\\s]+)\\s(who|that|which|in|of|from|at|and)";
		        String pattern3 = "(is|was)\\s(a|an|the)\\s(member|way)\\s(of)\\s([a-zA-Z-\\s]+)";
		        
		        Pattern pat=Pattern.compile(pattern0);
		        Matcher matcher0 =pat.matcher(firstSen);
		        
		        Pattern pat1=Pattern.compile(pattern1);
		        Matcher matcher1=pat1.matcher(firstSen);
		                
		        Pattern pat2=Pattern.compile(pattern2);
		        Matcher matcher2=pat2.matcher(firstSen);
		        
		        Pattern pat3=Pattern.compile(pattern3);
		        Matcher matcher3=pat3.matcher(firstSen);
		       
		               
		        while(matcher0.find()) {
		         while(matcher1.find()){
		             resultat = new Triple(page.title,"type",matcher1.group(3));
		          return resultat;
		         }
		         
		          if(matcher2.find()) resultat = new Triple(page.title,"type",matcher2.group(3));
		          else if (matcher3.find()) resultat = new Triple(page.title,"type",matcher3.group(5));
		          else resultat = new Triple(page.title,"type",matcher0.group(3));
		           //return fSentence;
		         //matcher.start()
		         //String a = fSentence.substring(matcher.end(0));
		               // resultat = new Triple(page.title,"type",
		                  //fSentence.substring(matcher.end(0)));
		        }
		        return resultat;

		 }
		 
		 public static void main(String[] args) throws IOException {
		  for(Triple triple : new TypeExtractor().run(new File("text"))) {
		            System.out.println(triple);
		          }
		 }
	}