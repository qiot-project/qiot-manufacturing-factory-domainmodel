package io.qiot.manufacturing.commons.domain.productionvalidation;

import java.util.UUID;

import io.qiot.manufacturing.all.commons.domain.production.ProductionChainStageEnum;
import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * @author andreabattaglia
 *
 */
@RegisterForReflection
public abstract class AbstractProductionChainEventDTO {
    public UUID productLineId;
    public int itemId;
    public ProductionChainStageEnum stage;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("AbstractProductionChainEventDTO [productLineId=");
        builder.append(productLineId);
        builder.append(", itemId=");
        builder.append(itemId);
        builder.append(", stage=");
        builder.append(stage);
        builder.append("]");
        return builder.toString();
    }

}
