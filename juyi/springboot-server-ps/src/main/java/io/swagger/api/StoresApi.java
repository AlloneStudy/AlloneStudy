package io.swagger.api;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.Order;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/stores", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/stores", description = "the stores API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-18T07:52:50.368Z")
public class StoresApi {

  @ApiOperation(value = "Delete purchase order by ID", notes = "For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
    @ApiResponse(code = 404, message = "Order not found", response = Void.class) })
  @RequestMapping(value = "/order/{orderId}",
    produces = { "application/json", "application/xml" }, 
    
    method = RequestMethod.DELETE)
  public ResponseEntity<Void> deleteOrder(
@ApiParam(value = "ID of the order that needs to be deleted",required=true ) @PathVariable("orderId") String orderId

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Void>(HttpStatus.OK);
  }


  @ApiOperation(value = "Find purchase order by ID", notes = "For valid response try integer IDs with value <= 5 or > 10. Other values will generated exceptions", response = Order.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation", response = Order.class),
    @ApiResponse(code = 400, message = "Invalid ID supplied", response = Order.class),
    @ApiResponse(code = 404, message = "Order not found", response = Order.class) })
  @RequestMapping(value = "/order/{orderId}",
    produces = { "application/json", "application/xml" }, 
    
    method = RequestMethod.GET)
  public ResponseEntity<Order> getOrderById(
@ApiParam(value = "ID of pet that needs to be fetched",required=true ) @PathVariable("orderId") String orderId

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Order>(HttpStatus.OK);
  }


  @ApiOperation(value = "Place an order for a pet", notes = "", response = Order.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation", response = Order.class),
    @ApiResponse(code = 400, message = "Invalid Order", response = Order.class) })
  @RequestMapping(value = "/order",
    produces = { "application/json", "application/xml" }, 
    
    method = RequestMethod.POST)
  public ResponseEntity<Order> placeOrder(

@ApiParam(value = "order placed for purchasing the pet"  ) @RequestBody Order body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Order>(HttpStatus.OK);
  }

}
