package Manager;

import java.rmi.RemoteException;
import java.time.ZoneId;

import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheckService implements CheckService {



		
		public Result CheckIfRealPerson(string identityNumber, String firstName, String lastName, int birthYear) {
			KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
			
			
			boolean result = true;
			
			try {
				result = kpsPublicSoapProxy.TCKimlikNoDogrula(
						identityNumber,
						firstName.toUpperCase(),
						lastName.toUpperCase(), 
						birthYear
						);
			} catch (RemoteException e) {
				e.printStackTrace();
			}
			if(result) {
				return new SuccessResult();
			}else {
				return new ErrorResult(firstName.toUpperCase() + " " + lastName.toUpperCase() + " : Kimlik doğrulama başarısız.");
			}
				
		}
	}

