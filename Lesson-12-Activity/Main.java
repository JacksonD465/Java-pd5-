class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
  
    System.out.println(creditCardType("6011-1234-5678-9012"));
    System.out.println(pigLatin("pig"));
    System.out.println(nycLocate("10001"));
    System.out.println(getMonth("07/21/2023"));
    System.out.println(validatePswd("passw"));

   
  }


String creditCardType(String cardNum){
  if(cardNum.substring(0,1).equals("4"))
    return "Visa";
  else if(cardNum.substring(0,2).equals("34") || cardNum.substring(0,2).equals("37"))
    return "America Express";
  else if(cardNum.substring(0,2).equals("36"))
    return "Diner Club";
  else if(cardNum.substring(0,2).equals("51") || cardNum.substring(0,2).equals("55"))
    return "Mastercard";
  else if(cardNum.substring(0,4).equals("6011") || cardNum.substring(0,2).equals("65"))
    return "Discovery";
  else
    return "Unknown Card Type";
}

String pigLatin(String word){
  return word.substring(1) + word.substring(0,1) + "ay";
}

String nycLocate(String zip){
  if(zip.substring(0,3).equals("100") || zip.substring(0,3).equals("101") || zip.substring(0,3).equals("102"))
    return "Manhattan";
  else if(zip.substring(0,3).equals("103"))
    return "Staten Island";
  else if(zip.substring(0,3).equals("104"))
    return "Bronx";
  else if(zip.substring(0,3).equals("112"))
    return "Brooklyn";
  else if(zip.substring(0,3).equals("113") || zip.substring(0,3).equals("114") || zip.substring(0,3).equals("111"))
    return "Queens";
  else
    return "Unknown Location";
}


String getMonth(String date){
  String month = date.substring(0,2);
  if(month.equals("01"))
    return "January";
  else if(month.equals("02"))
    return "February";
  else if(month.equals("03"))
    return "March";
  else if(month.equals("04"))
    return "April";
  else if(month.equals("05"))
    return "May";
  else if(month.equals("06"))
    return "June";
  else if(month.equals("07"))
    return "July";
  else if(month.equals("08"))
    return "August";
  else if(month.equals("09"))
    return "September";
  else if(month.equals("10"))
    return "October";
  else if(month.equals("11"))
    return "November";
  else if(month.equals("12"))
    return "December";
  else
    return "Unknown Month";
}

boolean validatePswd(String pswd){
  if(pswd.length() >= 5 && pswd.length() <= 8 && !pswd.contains("^") && !pswd.contains("*") && !pswd.contains("(") && !pswd.contains(")"))
    return true;
  else
    return false;
}
}