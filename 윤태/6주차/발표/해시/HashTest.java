import java.util.HashMap;

public class HashTest{
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        // 데이터 추가
        map.put("James", "555-123-4251");
        map.put("Ellen", "621-236-7423");
        map.put("Bill", "754-231-5342");
        map.put("Susan", "883-234-1236");
        map.put("Alex", "559-312-4512");

        // 데이터 조회
        System.out.println("James's phoneNum: " + map.get("James"));

        // 데이터 삭제
        map.remove("Bill");

        // 전체 출력
        System.out.println("HashMap: " + map);
    }
}
    