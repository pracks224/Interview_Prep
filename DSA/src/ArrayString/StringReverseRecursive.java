class StringReverseRecursive {
    static StringBuilder builder = new StringBuilder("");
    public static void main(String[] args) {
       System.out.println(reverseString("abcd"));
    }
    
    public static String reverseString(String str){
        if(str.length() == 0 || str.length() == 1){
            builder.append(str);
            return builder.toString();
        }else{
            String updatedStr  = str.substring(0,str.length()-1);
            builder.append(str.charAt(str.length()-1));
            return reverseString(updatedStr);
        }
    }
}
