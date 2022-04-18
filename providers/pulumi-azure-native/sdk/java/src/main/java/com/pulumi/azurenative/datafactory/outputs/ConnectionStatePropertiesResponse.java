// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectionStatePropertiesResponse {
    /**
     * The actions required on the managed private endpoint
     * 
     */
    private final String actionsRequired;
    /**
     * The managed private endpoint description
     * 
     */
    private final String description;
    /**
     * The approval status
     * 
     */
    private final String status;

    @CustomType.Constructor
    private ConnectionStatePropertiesResponse(
        @CustomType.Parameter("actionsRequired") String actionsRequired,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("status") String status) {
        this.actionsRequired = actionsRequired;
        this.description = description;
        this.status = status;
    }

    /**
     * The actions required on the managed private endpoint
     * 
    */
    public String actionsRequired() {
        return this.actionsRequired;
    }
    /**
     * The managed private endpoint description
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * The approval status
     * 
    */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionStatePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionsRequired;
        private String description;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionStatePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsRequired = defaults.actionsRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder actionsRequired(String actionsRequired) {
            this.actionsRequired = Objects.requireNonNull(actionsRequired);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public ConnectionStatePropertiesResponse build() {
            return new ConnectionStatePropertiesResponse(actionsRequired, description, status);
        }
    }
}
