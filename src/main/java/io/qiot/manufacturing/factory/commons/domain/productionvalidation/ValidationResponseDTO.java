package io.qiot.manufacturing.factory.commons.domain.productionvalidation;

import java.util.UUID;

import io.qiot.manufacturing.all.commons.domain.production.ProductionChainStageEnum;
import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * @author andreabattaglia
 *
 */
@RegisterForReflection
public class ValidationResponseDTO {
    public UUID productLineId;
    public int itemId;
    public ProductionChainStageEnum stage;
    public boolean valid;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ValidationResponseDTO [productLineId=");
        builder.append(productLineId);
        builder.append(", itemId=");
        builder.append(itemId);
        builder.append(", stage=");
        builder.append(stage);
        builder.append(", valid=");
        builder.append(valid);
        builder.append("]");
        return builder.toString();
    }
}
