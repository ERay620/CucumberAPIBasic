package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {

	@Before("@DeletePlace")  //Before executing any scenario which is tagged with @DeletePlace execute this block
	public void beforeScenario() throws IOException
	{		//execute this code only when place id is null
		//write a code that will give you place id

		 PlaceValidationStepDef m =new PlaceValidationStepDef();
		if(PlaceValidationStepDef.place_id==null)
		{
		
		m.add_Place_Payload_with("Shetty", "French", "Asia");
		m.user_calls_with_http_request("AddPlaceAPI", "POST");
		m.verify_place_Id_created_maps_to_using("Shetty", "getPlaceAPI");
		}
	}
}
