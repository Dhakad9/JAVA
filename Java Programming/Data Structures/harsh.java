import java.util.*;

class harsh
{                            //Constructor Overloading
	int birthdate;
	harsh(){
		birthdate=17;  //Default Constructor giving value 17 to birthdate
	}
	harsh(int input){
		birthdate=input;   //Parameterized Constructor giving value input to birthdate
	}
	public static void main(String[] args) {
		harsh ob=new harsh();         //Calling Default Constructor
		System.out.println(ob.birthdate);

		harsh _ob2=new harsh(13);      //Calling Parameterized Constructor
		System.out.println(_ob2.birthdate);
	}
}