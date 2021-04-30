import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class GetMaxLength 
{
	public void calculateMaxLength(String s)
	{
		String [] words=s.split(" ");
		ArrayList<Integer> lengthOfWords=new ArrayList<Integer>();
		for(String word:words)
		{
			lengthOfWords.add(word.length());
		}
        Collections.sort(lengthOfWords);
        Integer maxLength=lengthOfWords.get(lengthOfWords.size()-1);
        for(String word:words)
        {
        	if(word.length()==maxLength)
        		System.out.println(word+" - "+maxLength);
        }
	}
	public static void main(String[]args)
	{
		GetMaxLength obj=new GetMaxLength();
		obj.calculateMaxLength("good morning");
	}

}
