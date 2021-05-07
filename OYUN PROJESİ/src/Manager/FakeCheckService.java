package Manager;

import Entities.Gamer;

public class FakeCheckService implements CheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		return(true);
	}

}
