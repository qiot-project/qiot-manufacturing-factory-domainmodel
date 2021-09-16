package io.qiot.manufacturing.factory.commons.domain.productionvalidation;

import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * @author andreabattaglia
 *
 */
//
//@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
//@JsonSubTypes({
//        @JsonSubTypes.Type(value = RequestWeavingValidationEvent.class, name = "RequestWeavingValidationEvent"),
//        @JsonSubTypes.Type(value = RequestColoringValidationEvent.class, name = "RequestColoringValidationEvent"),
//        @JsonSubTypes.Type(value = RequestPrintingValidationEvent.class, name = "RequestPrintingValidationEvent"),
//        @JsonSubTypes.Type(value = RequestPackagingValidationEvent.class, name = "RequestPackagingValidationEvent") })
@RegisterForReflection
public class AbstractValidationRequestEventDTO
        extends AbstractProductionChainEventDTO {
    public String machineryId;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("AbstractValidationRequestEventDTO [productLineId=");
        builder.append(productLineId);
        builder.append(", itemId=");
        builder.append(itemId);
        builder.append(", stage=");
        builder.append(stage);
        builder.append(", machineryId=");
        builder.append(machineryId);
        builder.append("]");
        return builder.toString();
    }

}
