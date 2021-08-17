package io.qiot.manufacturing.commons.domain.productionvalidation;

import io.qiot.manufacturing.all.commons.domain.production.PackagingMetricsDTO;
import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * @author andreabattaglia
 *
 */
@RegisterForReflection
public class PackagingValidationRequestEventDTO
        extends AbstractValidationRequestEventDTO {
    public PackagingMetricsDTO data;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PackagingValidationRequestEventDTO [machineryId=");
        builder.append(machineryId);
        builder.append(", productLineId=");
        builder.append(productLineId);
        builder.append(", itemId=");
        builder.append(itemId);
        builder.append(", stage=");
        builder.append(stage);
        builder.append(", data=");
        builder.append(data);
        builder.append("]");
        return builder.toString();
    }
}
