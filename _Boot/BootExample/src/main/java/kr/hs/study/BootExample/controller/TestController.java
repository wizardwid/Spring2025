package kr.hs.study.BootExample.controller;

import kr.hs.study.BootExample.DTO.intDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
    public int evenSum = 0;
    public int oddSum = 0;
    public int sum = 0;
    public double avg = 0.0;
    public int n = 0;

//    @PostMapping("/test1")
//    public String result(@RequestParam("int1") int int1,
//                         @RequestParam("int2") int int2,
//                         @RequestParam("int3") int int3,
//                         @RequestParam("int4") int int4,
//                         @RequestParam("int5") int int5){
//
//        int[] numbers = {int1, int2, int3, int4, int5};
//
//        for (int num : numbers) {
//            if (num % 2 == 0)
//                evenSum += num;
//            else
//                oddSum += num;
//        }
//
//        System.out.println("짝수 합계 : " + evenSum);
//        System.out.println("홀수 합계 : " + oddSum);
//        return "result";
//    }

//    @PostMapping("/test1")
//    public String test1(@ModelAttribute intDTO dto){
//        for(int i=1; i<=100; i++){
//            if(i % dto.getIntN() == 0)
//                System.out.println(i);
//        }
//
//        return "result";
//    }

//    @PostMapping("/test1")
//    public String test1(@ModelAttribute intDTO dto){
//        for(int i =dto.getInt1(); i<=dto.getInt2(); i++){
//            System.out.println(i);
//        }
//        return "result";
//    }


//        @PostMapping("/test1")
//        public String test1(@ModelAttribute intDTO dto){
//            for(int i=1; i<=dto.getIntN(); i++){
//                if(i % 5 == 0)
//                    sum += i;
//            }
//            System.out.println("합 : " + sum);
//            return "result";
//        }

//    @PostMapping("/test1")
//    public String result(@RequestParam("int1") int int1,
//                         @RequestParam("int2") int int2,
//                         @RequestParam("int3") int int3,
//                         @RequestParam("int4") int int4,
//                         @RequestParam("int5") int int5,
//                         @RequestParam("int6") int int6,
//                         @RequestParam("int7") int int7,
//                         @RequestParam("int8") int int8,
//                         @RequestParam("int9") int int9,
//                         @RequestParam("int10") int int10){
//
//        int[] numbers = {int1, int2, int3, int4, int5, int6, int7, int8, int9, int10};
//
//        for (int num : numbers) {
//            if (num % 2 == 0)
//                evenSum += 1;
//            else
//                oddSum += 1;
//        }
//         System.out.println("짝수 개수 : " + evenSum);
//        System.out.println("홀수 개수 : " + oddSum);
//        return "result";
//    }

//    @PostMapping("/test1")
//    public String test1(@ModelAttribute intDTO dto){
//        for(int i =dto.getInt1(); i<=dto.getInt2(); i++){
//            if(i % 3 == 0 || i % 5 == 0){
//                n++;
//                sum += i;
//                avg = sum / n;
//            }
//        }
//        System.out.println("합 : " + sum);
//        System.out.println("평균 : " + avg);
//        return "result";
//    }

    @PostMapping("/test1")
    public String test1(@ModelAttribute intDTO dto){
        for(int i=1; i<=10; i++){
            System.out.println(dto.getInt1() * i);
        }
        return "result";
    }
}
