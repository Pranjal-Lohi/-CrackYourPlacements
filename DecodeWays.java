import java.util.HashMap;
import java.util.Map;

public class DecodeWays {
    private Map<String, Integer> hash;

    public DecodeWays(){
        this.hash = new HashMap<>();
    }
    public int numDecodings(String s) {
        return rec(s);
    }

    private int rec(String s) {
        if(hash.containsKey(s)) {
            return hash.get(s);
        }

        if(s.startsWith("0")) {
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
        if(s.length() == 0){
            return 1;
        }

        int res = rec(s.substring(1));

        if(Integer.parseInt(s.substring(0, 2)) <= 26) {
            res += rec(s.substring(2));
        }
        hash.put(s, res);
        return res;
    }
}

