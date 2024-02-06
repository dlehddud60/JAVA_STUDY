package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstructer member1 = new MemberConstructer("user1", 15, 90);
        MemberConstructer member2 = new MemberConstructer("user2", 16);

        MemberConstructer[] members = {member1,member2};

        for (MemberConstructer s : members) {
            System.out.println("이름 : " + s.name + "나이 : " + s.age + "성적 : " + s.grade);

        }
    }
}
