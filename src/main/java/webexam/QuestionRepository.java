package webexam;

import org.springframework.data.repository.CrudRepository;

import webexam.Question;

public interface QuestionRepository extends CrudRepository<Question, Integer> {

}
