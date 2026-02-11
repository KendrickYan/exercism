class ReverseString {

    String reverse(String inputString) {
        StringBuilder reversedString = new StringBuilder(inputString);
        reversedString.reverse();
        return reversedString.toString();
    }
  
}
