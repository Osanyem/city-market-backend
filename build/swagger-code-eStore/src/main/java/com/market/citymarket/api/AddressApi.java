/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.market.citymarket.api;

import com.market.citymarket.api.model.AddAddressReq;
import com.market.citymarket.api.model.Address;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Tag(name = "Address", description = "Operations about user's address")
public interface AddressApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /api/v1/addresses : Creates a new user addresses
     * Creates a new user addresses. Does nothing if address already exists.
     *
     * @param addAddressReq  (optional)
     * @return For successful fetch. (status code 200)
     */
    @Operation(
        operationId = "createAddress",
        summary = "Creates a new user addresses",
        tags = { "address" },
        responses = {
            @ApiResponse(responseCode = "200", description = "For successful fetch.", content = {
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Address.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = Address.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v1/addresses",
        produces = { "application/xml", "application/json" },
        consumes = { "application/xml", "application/json" }
    )
    default ResponseEntity<Address> createAddress(
        @Parameter(name = "AddAddressReq", description = "") @Valid @RequestBody(required = false) AddAddressReq addAddressReq
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"residency\" : \"residency\", \"number\" : \"number\", \"country\" : \"country\", \"pincode\" : \"pincode\", \"city\" : \"city\", \"street\" : \"street\", \"state\" : \"state\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Address> <number>aeiou</number> <residency>aeiou</residency> <street>aeiou</street> <city>aeiou</city> <state>aeiou</state> <country>aeiou</country> <pincode>aeiou</pincode> </Address>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /api/v1/addresses/{id} : Deletes user&#39;s address
     * Deletes user&#39;s address based on given address ID.
     *
     * @param id address Identifier (required)
     * @return Accepts the deletion request and perform deletion. If ID does not exist, does nothing. (status code 202)
     */
    @Operation(
        operationId = "deleteAddressesById",
        summary = "Deletes user's address",
        tags = { "address" },
        responses = {
            @ApiResponse(responseCode = "202", description = "Accepts the deletion request and perform deletion. If ID does not exist, does nothing.")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/v1/addresses/{id}"
    )
    default ResponseEntity<Void> deleteAddressesById(
        @Parameter(name = "id", description = "address Identifier", required = true) @PathVariable("id") String id
    ) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/addresses/{id} : Returns user&#39;s address
     * Returns user&#39;s address based on given address ID.
     *
     * @param id address Identifier (required)
     * @return For successful fetch. (status code 200)
     */
    @Operation(
        operationId = "getAddressesById",
        summary = "Returns user's address",
        tags = { "address" },
        responses = {
            @ApiResponse(responseCode = "200", description = "For successful fetch.", content = {
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Address.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = Address.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/addresses/{id}",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<Address> getAddressesById(
        @Parameter(name = "id", description = "address Identifier", required = true) @PathVariable("id") String id
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"residency\" : \"residency\", \"number\" : \"number\", \"country\" : \"country\", \"pincode\" : \"pincode\", \"city\" : \"city\", \"street\" : \"street\", \"state\" : \"state\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Address> <number>aeiou</number> <residency>aeiou</residency> <street>aeiou</street> <city>aeiou</city> <state>aeiou</state> <country>aeiou</country> <pincode>aeiou</pincode> </Address>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/addresses : Returns all user&#39;s addresses
     * Returns all user&#39;s addresses, else empty collection
     *
     * @return For successful fetch. (status code 200)
     */
    @Operation(
        operationId = "getAllAddresses",
        summary = "Returns all user's addresses",
        tags = { "address" },
        responses = {
            @ApiResponse(responseCode = "200", description = "For successful fetch.", content = {
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Address.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = Address.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/addresses",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<List<Address>> getAllAddresses(
        
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"residency\" : \"residency\", \"number\" : \"number\", \"country\" : \"country\", \"pincode\" : \"pincode\", \"city\" : \"city\", \"street\" : \"street\", \"state\" : \"state\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Address> <number>aeiou</number> <residency>aeiou</residency> <street>aeiou</street> <city>aeiou</city> <state>aeiou</state> <country>aeiou</country> <pincode>aeiou</pincode> </Address>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
