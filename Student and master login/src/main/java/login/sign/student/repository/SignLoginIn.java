package login.sign.student.repository;

import java.util.Optional;

import login.sign.student.entity.DetailsEntity;

public interface SignLoginIn{
	 boolean save(DetailsEntity entity);
	Optional<DetailsEntity> LoginByStudentId(String email, String passsword);
	Optional<DetailsEntity> LoginByMasterId(String email, String passsword);
}
