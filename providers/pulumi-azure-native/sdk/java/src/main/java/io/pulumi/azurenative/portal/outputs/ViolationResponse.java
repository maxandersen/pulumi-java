// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ViolationResponse {
    /**
     * Error message.
     * 
     */
    private final String errorMessage;
    /**
     * Id of the item that violates tenant configuration.
     * 
     */
    private final String id;
    /**
     * Id of the user who owns violated item.
     * 
     */
    private final String userId;

    @CustomType.Constructor
    private ViolationResponse(
        @CustomType.Parameter("errorMessage") String errorMessage,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("userId") String userId) {
        this.errorMessage = errorMessage;
        this.id = id;
        this.userId = userId;
    }

    /**
     * Error message.
     * 
    */
    public String errorMessage() {
        return this.errorMessage;
    }
    /**
     * Id of the item that violates tenant configuration.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Id of the user who owns violated item.
     * 
    */
    public String userId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ViolationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String errorMessage;
        private String id;
        private String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(ViolationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorMessage = defaults.errorMessage;
    	      this.id = defaults.id;
    	      this.userId = defaults.userId;
        }

        public Builder errorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }        public ViolationResponse build() {
            return new ViolationResponse(errorMessage, id, userId);
        }
    }
}
