package main.java.br.com.easy.ap_TimfromMarketing;

public class Badge {
    public String print(Integer id, String name, String department) {
        String idPart = (id != null) ? "[" + id + "] - " : "";
        String departmentPart = (department != null) ? department.toUpperCase() : "OWNER";
        return idPart + name + " - " + departmentPart;
    }
}
