package com.koreait.day1.controller;

import com.koreait.day1.model.MultiParam;
import org.springframework.web.bind.annotation.*;

@RestController //어노테이션 지정
@RequestMapping("/api") // localhost:8080/api
public class GetController {
    // localhost:8080/api/getMethod
    @RequestMapping(method = RequestMethod.GET, path = "/getMethod")
    public String getRequest(){ // method이름과 관계 없다.
          return "getMethod 호출";
    }
    // localhost:9090/api/getParameter?id=apple&pass=1234
    @GetMapping("/getParameter")
    public  String getPara(@RequestParam String id, @RequestParam String pass){
        System.out.println("id : "+ id);
        System.out.println("pass : " + pass);
        return "gePara() 호출";
    }
/*
    id
    name
    email
    age
*/
    // localhost:9090/api/getMultiParameter?id=apple&name=김사과&email=apple@apple.com&age=20
    @GetMapping("/getMultiParameter")
//    public String getMultiPara(@RequestParam String id,
//                               @RequestParam String name,
//                               @RequestParam String email,
//                               @RequestParam int age
//
//                               ){
//        System.out.println("id : " + id);
//        System.out.println("name : "+name);
//        System.out.println("email : "+email);
//        System.out.println("age : "+age);
//        return "ok";
//    }
    public MultiParam getMultipra(MultiParam multiParam){
          System.out.println("id : " + multiParam.getId());
        System.out.println("name : "+ multiParam.getName());
        System.out.println("email : "+ multiParam.getEmail());
        System.out.println("age : "+ multiParam.getAge());
        return multiParam;
    }
}
