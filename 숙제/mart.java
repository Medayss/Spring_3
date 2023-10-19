package 숙제;

import java.util.Scanner;

public class mart {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Array ar = new Array();

        while(true){

            for(int i = 0; i < ar.Product.length; i++){
                System.out.printf("상품명 : %s     \t 가격 : %s \n", ar.Product[i], ar.Price[i]);
            }
            System.out.println("\n가격을 수정할 상품을 고르세요.");
            System.out.print("제품 선택  0)쉬폰케잌, 1)기저귀, 2)여행세트, 3)클렌징폼, 4)화분세트 5) 종료 : ");
            int no = sc.nextInt();

            if(no == 5){
                System.out.println("종료합니다.");
                return;
            }
            System.out.print("가격변경 1) 10%인하  2) 20%인하  3) 15%인상 : ");
            int pno = sc.nextInt();
            ar.change(no, pno);
        }
    }
}



class Array {
    static String[] Product = {"쉬폰케잌","기저귀","여행세트","클렌징폼","화분세트"};
    static int[] Price = {2000,15000,6000,4000,3500};

    public void change(int num, int pnum) {
        switch(pnum){
            case 1:
                Price[num] = (int) (Price[num] - (Price[num] * 0.1));
                break;
            case 2:
                Price[num] = (int) (Price[num] - (Price[num] * 0.2));
                break;
            case 3:
                Price[num] = (int) (Price[num] + (Price[num] * 0.15));
                break;
            default:
        }
    }
}
