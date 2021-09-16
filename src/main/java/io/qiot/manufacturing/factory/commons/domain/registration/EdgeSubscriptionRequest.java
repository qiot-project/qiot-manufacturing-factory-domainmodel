package io.qiot.manufacturing.factory.commons.domain.registration;

import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * @author andreabattaglia
 *
 */
@RegisterForReflection
public class EdgeSubscriptionRequest {

    @JsonProperty(value = "serial")
    @NotNull
    public String serial;
    
    @JsonProperty(value = "name")
    @NotNull
    @Pattern(regexp = "[a-z0-9]([-a-z0-9]*[a-z0-9])?(\\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*")
    public String name;
    
    /**
     * KeyStore Password
     * 
     */
    @JsonProperty("keyStorePassword")
    public String keyStorePassword;

    @Override
    public int hashCode() {
        return Objects.hash(serial);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EdgeSubscriptionRequest other = (EdgeSubscriptionRequest) obj;
        return Objects.equals(serial, other.serial);
    }

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
