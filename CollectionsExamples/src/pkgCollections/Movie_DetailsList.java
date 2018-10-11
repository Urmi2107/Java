package pkgCollections;
import java.util.*;
public class Movie_DetailsList {
	static ArrayList<Movie_Details>l=new ArrayList<Movie_Details>();

	public void add_movie(Movie_Details m)
	{
		l.add(m);
	}
	public void remove_movie(String mName)
	{
		Iterator<Movie_Details> itr=l.iterator();
		while(itr.hasNext())
		{
		   Movie_Details m=(Movie_Details)itr.next();
		   if(m.getMov_Name().equals(mName))
			   l.remove(m);
		}
	}
	public void remove_AllMovies()
	{
		l.removeAll(l);
	}
	public void find_movie_By_mov_Name(String mName)
	{
		Iterator<Movie_Details> itr=l.iterator();
		while(itr.hasNext())
		{
		   Movie_Details m=(Movie_Details)itr.next();
		   if(m.getMov_Name().equals(mName))
			   System.out.println("Movie name:"+m.getMov_Name()+ " Lead Actor:"+m.getLead_actor()+" Lead actress:"+m.getLead_actress()+" Genre:"+m.getGenre());
		}
	}
	public void find_movie_By_Genre(String gen)
	{
		Iterator<Movie_Details> itr=l.iterator();
		while(itr.hasNext())
		{
		   Movie_Details m=(Movie_Details)itr.next();
		   if(m.getGenre().equals(gen))
			   System.out.println("Movie name:"+m.getMov_Name()+ " Lead Actor:"+m.getLead_actor()+" Lead actress:"+m.getLead_actress()+" Genre:"+m.getGenre());
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie_DetailsList movie=new Movie_DetailsList();
		Movie_Details m1=new Movie_Details("MI6","Tom Cruise","xyz","Action");
		Movie_Details m2=new Movie_Details("ABC","aaa","bbb","thriller");
		Movie_Details m3=new Movie_Details("Infinty War","CE","SJ","Action");
		Movie_Details m4=new Movie_Details("Jurassic World","CP","xyz","Action");
		movie.add_movie(m1);
		movie.add_movie(m2);
		movie.add_movie(m3);
		movie.add_movie(m4);
		System.out.println("Comparison by genre:");
		movie.find_movie_By_Genre("Action");
		System.out.println("Comparison by movie name:");
		movie.find_movie_By_mov_Name("ABC");
		System.out.println("Sorting by Name:");
		Collections.sort(l,Movie_Details.sortName);
		Iterator<Movie_Details> itr1=l.iterator();
		while(itr1.hasNext())
		{
		   Movie_Details m=(Movie_Details)itr1.next();
		   System.out.println("Movie name:"+m.getMov_Name()+ " Lead Actor:"+m.getLead_actor()+" Lead actress:"+m.getLead_actress()+" Genre:"+m.getGenre());
		}
		System.out.println("Sorting by Genre:");
		Collections.sort(l,Movie_Details.sortGenre);
		Iterator<Movie_Details> itr2=l.iterator();
		while(itr2.hasNext())
		{
		   Movie_Details m=(Movie_Details)itr2.next();
		   System.out.println("Movie name:"+m.getMov_Name()+ " Lead Actor:"+m.getLead_actor()+" Lead actress:"+m.getLead_actress()+" Genre:"+m.getGenre());
		}		
		

	}

}
