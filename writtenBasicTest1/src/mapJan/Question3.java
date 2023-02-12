package mapJan;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

//3.	Create hashset of 10 Strings. Remove elements from hashset of string contains
//more than one occurances of letter ‘e’.
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<>();
		HashSet<String> hs1 = new HashSet<>();
		hs.add("sameer"); // *
		hs.add("sajied");
		hs.add("abhijeet");// *
		hs.add("poojshree");// *
		hs.add("shivani");
		hs.add("shree");// *
		hs.add("smename");// *
		hs.add("sharean");
		hs.add("shreyash");
		hs.add("preatea");// *

		// for (String s:hs) {
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			String s = it.next();
			int count = 0;

			for (int i = 0; i < s.length(); i++) {

				if (s.charAt(i) == 'e') {
					count++;
				}
			}
			if (count > 1) {
				it.remove();
			}
		}
		System.out.println(hs);
	}
}
