package com.market.citymarket.api.hateoas;

import com.market.citymarket.api.controller.PaymentController;
import com.market.citymarket.api.entity.PaymentEntity;
import com.market.citymarket.api.model.Payment;
import org.springframework.beans.BeanUtils;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;

import static java.util.stream.Collectors.toList;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


@Component
public class PaymentRepresentationModelAssembler extends
        RepresentationModelAssemblerSupport<PaymentEntity, Payment> {

    /**
     * Creates a new {@link RepresentationModelAssemblerSupport} using the given controller class and
     * resource type.
     */
    public PaymentRepresentationModelAssembler() {
        super(PaymentController.class, Payment.class);
    }

    /**
     * Coverts the Payment entity to resource
     *
     * @param entity
     */
    @Override
    public Payment toModel(PaymentEntity entity) {
        Payment resource = createModelWithId(entity.getId(), entity);
        BeanUtils.copyProperties(entity, resource);
        resource.setId(entity.getId().toString());
        // Self link generated by createModelWithId has missing api path. Therefore, generating additionally.
        // can be removed once fixed.
        resource.add(linkTo(
                methodOn(PaymentController.class).getOrdersPaymentAuthorization(entity.getId().toString()))
                .withSelfRel());
        return resource;
    }

    /**
     * Coverts the collection of Product entities to list of resources.
     *
     * @param entities
     */
    public List<Payment> toListModel(Iterable<PaymentEntity> entities) {
        if (Objects.isNull(entities)) {
            return List.of();
        }
        return StreamSupport.stream(entities.spliterator(), false).map(this::toModel)
                .collect(toList());
    }

}
