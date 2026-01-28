package com.example.simpleBoard;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.simpleBoard.answer.AnswerRepository;
import com.example.simpleBoard.question.Question;
import com.example.simpleBoard.question.QuestionRepository;

import jakarta.transaction.Transactional;

@SpringBootTest
class MysiteApplicationTests {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;
	
	
	@Test
	void contextLoads() {
		/*
		Question q1 = new Question();
		q1.setSubject("궁금합니다.");
		q1.setContent("질문 내용입니다.");
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q1);
		
		Question q2 = new Question();
		q2.setSubject("git공부가 필요합니다.");
		q2.setContent("git에 대한 질문 내용입니다.");
		q2.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q2);
		
		
		List<Question> all = this.questionRepository.findAll();
		assertEquals(4, all.size());
		
		Question q = all.get(0);
		assertEquals("궁금합니다.", q.getSubject());
		
		
		
		Optional<Question> op = this.questionRepository.findById(4);
		if(op.isPresent()) {
			Question q = op.get();
			assertEquals("git에 대한 질문 내용입니다.", q.getContent());
			System.out.println(q.getContent());
		}
		
		this.questionRepository.deleteById(1);
		this.questionRepository.deleteById(2);
		Question q = this.questionRepository.findBySubjectAndContent("궁금합니다.","질문 내용입니다.");
		assertEquals(3, q.getId());
		
		List<Question> qList = this.questionRepository.findBySubjectLike("%니다%");
		Question q = qList.get(0);
		System.out.println(q.getSubject());
		
		
		Optional<Question> q = this.questionRepository.findById(4);
		assertTrue(q.isPresent());
		Question question = q.get();
		question.setSubject("수정된 제목");
		this.questionRepository.save(question);
		
		
		Answer a1 = new Answer();
		a1.setContent("답변 내용입니다.");
		
		Optional<Question> oq= this.questionRepository.findById(3);
		Question q = oq.get();
		a1.setCreateDate(LocalDateTime.now());
		a1.setQuestion(q);
		this.answerRepository.save(a1);
		*/
		for(int i=1; i<=200; i++) {
			Question q = new Question();
			q.setSubject("테스트 코드를 이용해 생성한 제목: [제목"+i+"]");
			q.setContent("테스트 코드를 이용해 생성한 내용: [내용"+i+"]");
			q.setCreateDate(LocalDateTime.now());
			this.questionRepository.save(q);
		}
		/*
		Optional<Question> oq= this.questionRepository.findById(3);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		
		List<Answer> answerList = q.getAnswerList();
		System.out.println(answerList.get(0).getContent());
		System.out.println(answerList.size());
		*/
	}
	

}








