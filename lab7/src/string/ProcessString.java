package string;

public class ProcessString implements StringInterface{

    @Override
    public int countS(char ch, String s) {
        int count = 0;
        if(s.isEmpty()) return 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }

    @Override
    public String nech(String s) {
        StringBuilder nechS = new StringBuilder();
        if(s.isEmpty()) return "";
        for(int i = 0; i<s.length(); i++){
            if(i%2==1){
                nechS.append(s.charAt(i));
            }
        }
        return nechS.toString();
    }

    @Override
    public String invert(String s) {
        StringBuilder invert = new StringBuilder();
        if(s.isEmpty()) return "";
        for(int i = s.length()-1; i>=0; i--){
            invert.append(s.charAt(i));
        }
        return invert.toString();
    }
}
