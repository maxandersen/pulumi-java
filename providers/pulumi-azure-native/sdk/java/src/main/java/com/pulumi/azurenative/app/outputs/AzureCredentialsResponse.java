// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.app.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureCredentialsResponse {
    /**
     * @return Subscription Id.
     * 
     */
    private final @Nullable String subscriptionId;

    @CustomType.Constructor
    private AzureCredentialsResponse(@CustomType.Parameter("subscriptionId") @Nullable String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * @return Subscription Id.
     * 
     */
    public Optional<String> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }        public AzureCredentialsResponse build() {
            return new AzureCredentialsResponse(subscriptionId);
        }
    }
}
