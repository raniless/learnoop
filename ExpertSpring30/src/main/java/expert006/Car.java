package expert006;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
//	@Autowired
//	Tire tire;
	
//	@Resource
//	Tire tire;

//	@Autowired
//	@Qualifier("tire1")
//	Tire tire;

//	@Resource(name="tire1")
//	Tire tire;

	@Resource(name="tire")
	Tire tire;

	public String getTireBrand() {
		return "������ Ÿ�̾� : " + tire.getBrand();
	}
}
