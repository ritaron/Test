package _01;

import java.util.Properties;
import java.util.Set;

public class Java_SystemProperties {

	public static void main(String[] args) {
		Properties prop= System.getProperties();
		//System.out.println(prop);
		Set set = prop.keySet();
		for(Object o: set){
			System.out.println(o+"--->"+prop.get(o));
		}
	}

}
