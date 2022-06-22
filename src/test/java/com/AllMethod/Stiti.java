package com.AllMethod;
import java.io.FileNotFoundException;



import com.AllExecution.AllStudentsDetails;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class Stiti {

	AllStudentsDetails ref;
	@Given("Calling Get Method")
	public void calling_get_Method() {



	ref=new AllStudentsDetails();
	ref.getMethod0();
	}
	@And("Create Post")
	public void create_Post() throws FileNotFoundException {
	ref=new AllStudentsDetails();
	ref.createMethod();
	}
	@And("Update Put")
	public void put_Method() throws FileNotFoundException {
	ref=new AllStudentsDetails();
	ref.putMethod();
	}



	@Then("executed Successfully")
	public void executed_successfully() {
	System.out.println("Get Method executed successfully");
	}
	}


