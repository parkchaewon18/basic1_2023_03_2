package com.ll.basic1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// 아래 있는 homecontroller는 컨트롤러이다.

public class HomeController {
    //만약에 /home/main이런 요청이 오면 아래 메서드를 실행해줘
    @GetMapping("/home/main")
    //아래 메서드를 실행한 후 그 리턴값을 응답으로 삼아줘
    @ResponseBody
    public String showMain() {
        return "안녕하세요.";
    }
}
