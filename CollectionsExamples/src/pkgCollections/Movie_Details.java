package pkgCollections;

import java.util.Comparator;

public class Movie_Details {
	private String mov_Name;
	private String lead_actor;
	private String lead_actress;
	private String genre;
	public Movie_Details(String mov_Name, String lead_actor,
			String lead_actress, String genre) {
	
		this.mov_Name = mov_Name;
		this.lead_actor = lead_actor;
		this.lead_actress = lead_actress;
		this.genre = genre;
	}
	public String getMov_Name() {
		return mov_Name;
	}
	public void setMov_Name(String mov_Name) {
		this.mov_Name = mov_Name;
	}
	public String getLead_actor() {
		return lead_actor;
	}
	public void setLead_actor(String lead_actor) {
		this.lead_actor = lead_actor;
	}
	public String getLead_actress() {
		return lead_actress;
	}
	public void setLead_actress(String lead_actress) {
		this.lead_actress = lead_actress;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public static Comparator<Movie_Details>sortName=new Comparator<Movie_Details>() {
		
		@Override
		public int compare(Movie_Details o1, Movie_Details o2) {
			// TODO Auto-generated method stub
			return o1.mov_Name.compareTo(o2.mov_Name);
			
		}
	};
public static Comparator<Movie_Details>sortGenre=new Comparator<Movie_Details>() {
		
		@Override
		public int compare(Movie_Details o1, Movie_Details o2) {
			// TODO Auto-generated method stub
			return o1.genre.compareTo(o2.genre);
			
		}
	};

}
