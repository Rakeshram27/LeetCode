class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String[] expone = num1.split("\\+|i");
        String[] exptwo = num2.split("\\+|i");
        
        int realone = Integer.parseInt(expone[0]);
        int imgone = Integer.parseInt(expone[1]);

        int realtwo = Integer.parseInt(exptwo[0]);
        int imgtwo = Integer.parseInt(exptwo[1]);

        int realpro = realone * realtwo - imgone * imgtwo;
        int imgpro = realone * imgtwo + realtwo * imgone;

        return String.format("%d+%di", realpro, imgpro);
    }
}