package com.example.simpleBoard.answer;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerForm {
	@NotEmpty(message="내용은 필수입력 항목입니다.")
	@Size(max=10, message="10글자 미만으로 입력가능합니다.")
	private String content;
}
