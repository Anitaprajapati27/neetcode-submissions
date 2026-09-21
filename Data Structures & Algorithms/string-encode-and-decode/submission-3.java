class Solution {

    public String encode(List<String> strs) {
        StringBuilder enc=new StringBuilder();
        for(String curr:strs){
            enc.append(curr.length());
            enc.append('#');
            enc.append(curr);
        }
        return enc.toString();
    }

    public List<String> decode(String str) {
        List<String> dec=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(j<str.length() && str.charAt(j)!='#'){
                j++;
            }
            int len=Integer.parseInt(str.substring(i,j));
            i=j+1;
            dec.add(str.substring(i,i+len));
            i=i+len;
        }
        return dec;
    }
}
