package login.sign.student.service;

import java.util.Optional;

import login.sign.student.entity.DetailsEntity;

public interface SignService {
   boolean saveAndValidate(DetailsEntity entity);
   Optional<DetailsEntity> LoginByStudentId(String email, String passsword);
	Optional<DetailsEntity> LoginByMasterId(String email, String passsword);
}
