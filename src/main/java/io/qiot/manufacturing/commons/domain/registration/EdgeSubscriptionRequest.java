package io.qiot.manufacturing.commons.domain.registration;

import io.qiot.manufacturing.all.commons.domain.registration.AbstractSubscriptionRequest;
import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * @author andreabattaglia
 *
 */
@RegisterForReflection
public class EdgeSubscriptionRequest extends AbstractSubscriptionRequest {

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("EdgeSubscriptionRequest [serial=");
        builder.append(serial);
        builder.append(", name=");
        builder.append(name);
        builder.append(", keyStorePassword=");
        builder.append(keyStorePassword);
        builder.append("]");
        return builder.toString();
    }

}
