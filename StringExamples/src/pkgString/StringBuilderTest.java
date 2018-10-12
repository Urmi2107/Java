package pkgString;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE";
		String str1[]=str.split("\\\\");
		StringBuilder s=new StringBuilder();
		System.out.println("Drive:"+str1[0]+"\\");
		s.append(str1[1]);
		s.append("||");
		s.append(str1[2]);
		s.append("||");
		s.append(str1[3]);
		System.out.println("Folders:"+s);
		System.out.println("File:"+str1[4]);
		

	}

}
