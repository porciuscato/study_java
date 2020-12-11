package c.inheritance;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;
    
    public MemberDTO() {
        // without any information
    }
    public MemberDTO(String name) {
        this.name = name;
    }
    public MemberDTO(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public MemberDTO(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public boolean equals(Object obj) {  // overrode java.lang.Object.equals
        if(this == obj) return true;  // 주소가 같다.
        if(obj == null) return false; 
        if(getClass() != obj.getClass()) return false; // 클래스 종류가 다르다.

        MemberDTO other = (MemberDTO)obj;  // 같은 클래스므로 다시 형변환을 한다.
        if(name == null) {
            if(other.email != null) return false;
        }
        else if(!name.equals(other.name)) return false;

        if(email == null) {
            if(other.email != null) return false;
        }
        else if(!email.equals(other.email)) return false;

        if(phone == null) {
            if(other.phone != null) return false;
        }
        else if(!phone.equals(other.phone)) return false;

        return true;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((name == null) ? 0 : email.hashCode());
        result = prime * result + ((phone == null) ? 0 : email.hashCode());
        return result;
    }
}
