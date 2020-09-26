package _07_tea_party;

public class TeaParty {
	private String name; 
	private boolean isWoman; 
	private boolean isKnighted; 
    public String welcome(String name, boolean isWoman, boolean isKnighted) {
    	if(isWoman == false && isKnighted == true) {
    		return "Hello Sir "+name;
    	}
    	if(isWoman == false && isKnighted == false) {
    		return "Hello Mr. "+name; 
    	}
    	if(isWoman == true && isKnighted == true) {
    		return "Hello Lady "+name; 
    	}
    	if(isWoman == true && isKnighted == false) {
    		return "Hello Ms. "+name; 
    	}
		return name;
    }
    
    
    
    
}
