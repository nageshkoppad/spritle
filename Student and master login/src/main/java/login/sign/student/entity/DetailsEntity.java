package login.sign.student.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="student")
@NamedQuery(name = "LoginByStudentId", query = "select alia from DetailsEntity alia where alia.email=:sh and alia.password=:tag")
public class DetailsEntity
{
	@Id
	private String StudentEmail;
	private String StudentPassword;
	private String MasterEmail;
	private String MasterPassword;	
}
