class toggle{
    public static void main(String args[]){
       String input="HellO, #4 WorLd";
        System.out.println("original string "+input);
    System.out.println("After toggle");
       for(int i=0;i<input.length();i++){
        char word=input.charAt(i);
       if(Character.isUpperCase(word)){
        System.out.print(Character.toLowerCase(word));
        }
       else if(Character.isLowerCase(word)){
        System.out.print(Character.toUpperCase(word));
        }
        else{
            System.out.print(word);
        }
    }
}
}