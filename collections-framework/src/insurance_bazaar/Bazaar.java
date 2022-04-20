package insurance_bazaar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Bazaar {
  private Map<Integer, String> policyMap = new HashMap<>();

  public Bazaar(Map<Integer, String> policyMap) {
    this.policyMap = policyMap;
  }

  public Bazaar() {}

  public Map<Integer, String> getPolicyMap() {
    return policyMap;
  }

  public void setPolicyMap(Map<Integer, String> policyMap) {
    this.policyMap = policyMap;
  }

  public void addPolicyDetails(int policyId, String policyName) {
    this.policyMap.put(policyId, policyName);
  }

  @Override
  public String toString() {
    String map =
        policyMap.keySet().stream()
            .sorted()
            .map(key -> key + " " + policyMap.get(key) + "\n")
            .collect(Collectors.joining());
    return map;
  }

  public List<Integer> searchBasedOnPolicyType(String policyType) {
    List<Integer> policyCodes =
        policyMap.keySet().stream()
            .filter(key -> policyMap.get(key).contains(policyType))
            .sorted()
            .collect(Collectors.toList());
    return policyCodes;
  }
}
