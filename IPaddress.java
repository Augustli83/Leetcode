public class IPaddress {
    List<String> ipAdd = new ArrayList<>();
    List<String> list = new ArrayList<>();
	public List<String> restoreIpAddresses(String s) {
        restoreIP(s,0);
        return ipAdd;
    }
	public void restoreIP(String s, int pos){
		if(pos==s.length() && list.size()==4){
			ipAdd.add(list.get(0) + "." + list.get(1) + "." + list.get(2) +"." + list.get(3));
			return;
		}
		if(list.size()>4){
			return;
		}
		if(s.length()-pos<=0){
			return;
		}
		for(int i=1;i<4;i++){
			if(s.length()-pos>=i){
				String sub=s.substring(pos,pos+i);
				int subNum=Integer.parseInt(sub);
				if(sub.length()>1 && sub.startsWith("0")){
					continue;
				}
				if(subNum >= 0 && subNum <=255){
					list.add(sub);
					restoreIP(s,pos+i);
					list.remove(list.size()-1);
				}
			}
		}
	}
}