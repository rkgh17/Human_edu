package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;


@SpringBootTest
class SbbApplicationTests {
    
    @Autowired
    private QuestionRepository questionRepository;

    @Transactional
    @Test
    void testJpa() {
    	// 질문id가 2인 데이터 찾기
    	Optional<Question> oq = this.questionRepository.findById(2);
    	assertTrue(oq.isPresent());
    	Question q = oq.get();
    	
    	// 질문에 달린 답변들 리스트
    	List<Answer> answerList = q.getAnswerList();
    	
    	// 리스트 확인
    	assertEquals(1, answerList.size());
    	assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
    	
    }
}