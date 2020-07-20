import java.math.BigDecimal;
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @program:test_7.20
 * @author:Nine_odes
 * @description:大整数排序
 * @create:2020-07-20 13:33
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<BigDecimal> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextBigDecimal());
        }
        Collections.sort(list);
        for (BigDecimal b:list) {
            System.out.println(b);
        }
    }
}
