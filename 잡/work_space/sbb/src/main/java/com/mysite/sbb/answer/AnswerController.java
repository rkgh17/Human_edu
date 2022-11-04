// 경로 : sbb/src/main/java/com/mysite/sbb/answer/AnswerController.java
package com.mysite.sbb.answer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/answer") // URL 프리픽스
@RequiredArgsConstructor
@Controller
public class AnswerController {

    private final QuestionService questionService;
    
    // 변수 지정
    private final AnswerService answerService;

    // post요청만 받아들일 경우에 사용하는 에너테이션
    @PostMapping("/create/{id}") // (value=) 생략가능
    public String createAnswer(Model model, @PathVariable("id") Integer id,
    		@RequestParam String content) {
        Question question = this.questionService.getQuestion(id);
        
        // 답변저장
        this.answerService.create(question, content);
        return String.format("redirect:/question/detail/%s", id);
    }
}