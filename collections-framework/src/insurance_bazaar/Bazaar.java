package insurance_bazaar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Bazaar {
    private Map<Integer, String> policyMap = new HashMap<>();

    public Bazaar(Map<Integer, String> policyMap) {
        this.policyMap = policyMap;
    }

    public Bazaar() {
    }

    public Map<Integer, String> getPolicyMap() {
        return policyMap;
    }

    public void setPolicyMap(Map<Integer, String> policyMap) {
        this.policyMap = policyMap;
    }

    public void addPolicyDetails(int policyId, String policyName) {
        this.policyMap.put(policyId, policyName);
    }

    public List<Integer> searchBasedOnPolicyType(String policyType) {
        return this.policyMap.entrySet()
                .stream()
                .filter(x -> x.getValue().contains(policyType))
                .map(x-> x.getKey())
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        String result = "";
        TreeMap<Integer, String> sorted = new TreeMap<>(this.policyMap);
        for (Integer key : policyMap.keySet()) {
            String value = policyMap.get(key);
            result += key + " " + value + "\n";
        }
        return result;
    }
}