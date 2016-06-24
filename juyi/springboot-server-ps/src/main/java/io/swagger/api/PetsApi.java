package io.swagger.api;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.AuthorizationScope;
import io.swagger.model.Pet;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;

@Controller
@RequestMapping(value = "/pets", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/pets", description = "the pets API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-18T07:52:50.368Z")
public class PetsApi {

  @ApiOperation(value = "Add a new pet to the store", notes = "", response = Void.class, authorizations = {
    @Authorization(value = "petstore_auth", scopes = {
      @AuthorizationScope(scope = "write_pets", description = "modify pets in your account"),
      @AuthorizationScope(scope = "read_pets", description = "read your pets")
      })
  })
  @ApiResponses(value = { 
    @ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
  @RequestMapping(value = "",
    produces = { "application/json", "application/xml" }, 
    consumes = { "application/json", "application/xml" },
    method = RequestMethod.POST)
  public ResponseEntity<Void> addPet(

@ApiParam(value = "Pet object that needs to be added to the store"  ) @RequestBody Pet body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Void>(HttpStatus.OK);
  }


  @ApiOperation(value = "Deletes a pet", notes = "", response = Void.class, authorizations = {
    @Authorization(value = "petstore_auth", scopes = {
      @AuthorizationScope(scope = "write_pets", description = "modify pets in your account"),
      @AuthorizationScope(scope = "read_pets", description = "read your pets")
      })
  })
  @ApiResponses(value = { 
    @ApiResponse(code = 400, message = "Invalid pet value", response = Void.class) })
  @RequestMapping(value = "/{petId}",
    produces = { "application/json", "application/xml" }, 
    
    method = RequestMethod.DELETE)
  public ResponseEntity<Void> deletePet(
@ApiParam(value = "" ,required=true ) @RequestHeader(value="api_key", required=true) String apiKey

,
    
@ApiParam(value = "Pet id to delete",required=true ) @PathVariable("petId") Long petId

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Void>(HttpStatus.OK);
  }


  @ApiOperation(value = "Finds Pets by status", notes = "Multiple status values can be provided with comma seperated strings", response = Pet.class, responseContainer = "List", authorizations = {
    @Authorization(value = "petstore_auth", scopes = {
      @AuthorizationScope(scope = "write_pets", description = "modify pets in your account"),
      @AuthorizationScope(scope = "read_pets", description = "read your pets")
      })
  })
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation", response = Pet.class),
    @ApiResponse(code = 400, message = "Invalid status value", response = Pet.class) })
  @RequestMapping(value = "/findByStatus",
    produces = { "application/json", "application/xml" }, 
    
    method = RequestMethod.GET)
  public ResponseEntity<List<Pet>> findPetsByStatus(@ApiParam(value = "Status values that need to be considered for filter") @RequestParam(value = "status", required = false) List<String> status


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<Pet>>(HttpStatus.OK);
  }


  @ApiOperation(value = "Finds Pets by tags", notes = "Muliple tags can be provided with comma seperated strings. Use tag1, tag2, tag3 for testing.", response = Pet.class, responseContainer = "List", authorizations = {
    @Authorization(value = "petstore_auth", scopes = {
      @AuthorizationScope(scope = "write_pets", description = "modify pets in your account"),
      @AuthorizationScope(scope = "read_pets", description = "read your pets")
      })
  })
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation", response = Pet.class),
    @ApiResponse(code = 400, message = "Invalid tag value", response = Pet.class) })
  @RequestMapping(value = "/findByTags",
    produces = { "application/json", "application/xml" }, 
    
    method = RequestMethod.GET)
  public ResponseEntity<List<Pet>> findPetsByTags(@ApiParam(value = "Tags to filter by") @RequestParam(value = "tags", required = false) List<String> tags


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<Pet>>(HttpStatus.OK);
  }


  @ApiOperation(value = "Find pet by ID", notes = "Returns a pet when ID < 10.  ID > 10 or nonintegers will simulate API error conditions", response = Pet.class, authorizations = {
    @Authorization(value = "petstore_auth", scopes = {
      @AuthorizationScope(scope = "write_pets", description = "modify pets in your account"),
      @AuthorizationScope(scope = "read_pets", description = "read your pets")
      }),
    @Authorization(value = "api_key")
  })
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation", response = Pet.class),
    @ApiResponse(code = 400, message = "Invalid ID supplied", response = Pet.class),
    @ApiResponse(code = 404, message = "Pet not found", response = Pet.class) })
  @RequestMapping(value = "/{petId}",
    produces = { "application/json", "application/xml" }, 
    
    method = RequestMethod.GET)
  public ResponseEntity<Pet> getPetById(
@ApiParam(value = "ID of pet that needs to be fetched",required=true ) @PathVariable("petId") Long petId

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Pet>(HttpStatus.OK);
  }


  @ApiOperation(value = "Update an existing pet", notes = "", response = Void.class, authorizations = {
    @Authorization(value = "petstore_auth", scopes = {
      @AuthorizationScope(scope = "write_pets", description = "modify pets in your account"),
      @AuthorizationScope(scope = "read_pets", description = "read your pets")
      })
  })
  @ApiResponses(value = { 
    @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
    @ApiResponse(code = 404, message = "Pet not found", response = Void.class),
    @ApiResponse(code = 405, message = "Validation exception", response = Void.class) })
  @RequestMapping(value = "",
    produces = { "application/json", "application/xml" }, 
    consumes = { "application/json", "application/xml" },
    method = RequestMethod.PUT)
  public ResponseEntity<Void> updatePet(

@ApiParam(value = "Pet object that needs to be added to the store"  ) @RequestBody Pet body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Void>(HttpStatus.OK);
  }


  @ApiOperation(value = "Updates a pet in the store with form data", notes = "", response = Void.class, authorizations = {
    @Authorization(value = "petstore_auth", scopes = {
      @AuthorizationScope(scope = "write_pets", description = "modify pets in your account"),
      @AuthorizationScope(scope = "read_pets", description = "read your pets")
      })
  })
  @ApiResponses(value = { 
    @ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
  @RequestMapping(value = "/{petId}",
    produces = { "application/json", "application/xml" }, 
    consumes = { "application/x-www-form-urlencoded" },
    method = RequestMethod.POST)
  public ResponseEntity<Void> updatePetWithForm(
@ApiParam(value = "ID of pet that needs to be updated",required=true ) @PathVariable("petId") String petId

,
    


@ApiParam(value = "Updated name of the pet", required=true ) @RequestPart(value="name", required=true)  String name
,
    


@ApiParam(value = "Updated status of the pet", required=true ) @RequestPart(value="status", required=true)  String status
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Void>(HttpStatus.OK);
  }

}
