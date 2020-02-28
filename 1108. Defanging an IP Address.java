class Solution {
    public String defangIPaddr(String address) {
        String defanged= address.replace(".", "[.]");
        return defanged;
    }
}