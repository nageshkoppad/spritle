package login.sign.student.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import login.sign.student.entity.DetailsEntity;
import login.sign.student.repository.SignLoginIn;

@Component
public class SignServiceImpl implements SignService {

	@Autowired
	private SignLoginIn repo;
	
	@Override
	public boolean saveAndValidate(DetailsEntity entity) {
		// TODO Auto-generated method stub
		return repo.save(entity);
	}

	@Override
	public Optional<DetailsEntity> LoginByStudentId(String email, String passsword) {
		
		return repo.LoginByMasterId(email, passsword);
	}

	@Override
	public Optional<DetailsEntity> LoginByMasterId(String email, String passsword) {
		
		return repo.LoginByMasterId(email, passsword);
	}

}
