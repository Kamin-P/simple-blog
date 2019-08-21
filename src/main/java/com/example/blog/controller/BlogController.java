package com.example.blog.controller;

import com.example.blog.vo.Member;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

@RestController
public class BlogController {
    @RequestMapping(value="/sayHello", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello, Jaewook.";
    }
    @RequestMapping(value="/getInfo", method = RequestMethod.GET)
    public Member getInfo() {
        Member member= new Member(1,"Jaewook Kim","jwkim199637@gmail.com");
        member.setId(1);
        member.setName("Jaewook, Kim");
        member.setEmail("jwkim199637@gmail.com");

        return member;
    }
    @RequestMapping(value="/list", method = RequestMethod.GET)
    public List<Member> list() {
        List<Member> memberList = Arrays.asList(
                new Member[]{new Member(1,"Jaewook1 Kim","1jwkim199637@gmail.com"),
                        new Member(1,"Jaewook2 Kim","2jwkim199637@gmail.com"),
                        new Member(1,"Jaewook3 Kim","3jwkim199637@gmail.com"),
                        new Member(1,"Jaewook4 Kim","4jwkim199637@gmail.com"),
                        new Member(1,"Jaewook5 Kim","5jwkim199637@gmail.com")}
                        );

//        long startTime = System.currentTimeMillis();
//        for (Member member : memberList) {
//            System.out.println(member);
//        }
//        System.out.println("for-loop:" + (System.currentTimeMillis() -  startTime) + " ms " );
//
//        startTime = System.currentTimeMillis();
//        memberList.forEach(System.out::println);
//        System.out.println("lamda:" + (System.currentTimeMillis() -  startTime) + " ms " );

        return memberList;
    }
}
