package junit;

public class q2_string {
	boolean ispalindrome(String str1) {
		int len=str1.length()-1;
		int i=0;
		while(i<=len) {
			if(str1.charAt(i)!=str1.charAt(len)) {
				return false;
			}
			i++;
			len--;
		}
		return true;
	}
	
	boolean isSimilar(String str1,String str2) {
		int len1=str1.length();
		int len2=str2.length();
		if(len1!=len2) {
			return false;
		}
		for(int i=0;i<len1;i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				return false;
			}
		}
		
		return true;
	}
}
