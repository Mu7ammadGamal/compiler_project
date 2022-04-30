class test6{
  public static void main(String[] args) {
    
    // create null, empty, and regular strings
    String str1 = null;
    String str2 = "";
    String str3 = "  ";

    // check if str1 is null or empty
    isNullEmpty(str1);

    // check if str2 is null or empty
    // isNullEmpty(str2);

    // check if str3 is null or empty
    isNullEmpty(str3);
    return;
  }

  // method check if string is null or empty
  public static String isNullEmpty(String str) {
    // check if string is null
    if (str == null) {
      return "NULL";
    }
    // check if string is empty
    else if(str.isEmpty()){
      return "EMPTY";
    }
    else {
      return "neither NULL nor EMPTY";
    }
  }
}
