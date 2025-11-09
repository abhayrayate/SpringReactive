package in.abhayit.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="CustomerMongo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerMongo {

	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private long contactId;

	

}