/*
Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning,
so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.


without2("HelloHe") → "lloHe"
without2("HelloHi") → "HelloHi"
without2("Hi") → ""
*/

public String without2(String str) {
  int len = str.length();
  if (len == 1) return str;
  else if (len > 2) {
    String first = str.substring(0, 2);
    String last = str.substring(len-2);
    if(first.equals(last)) {
      return str.substring(2);
    } else {
      return str;
    }
  }
  return "";
}
