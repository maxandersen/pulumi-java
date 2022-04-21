// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.subscription.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Put subscription creation result properties.
 * 
 */
public final class PutAliasResponsePropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final PutAliasResponsePropertiesResponse Empty = new PutAliasResponsePropertiesResponse();

    /**
     * The provisioning state of the resource.
     * 
     */
    @Import(name="provisioningState")
    private @Nullable String provisioningState;

    public Optional<String> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    /**
     * Newly created subscription Id.
     * 
     */
    @Import(name="subscriptionId", required=true)
    private String subscriptionId;

    public String subscriptionId() {
        return this.subscriptionId;
    }

    private PutAliasResponsePropertiesResponse() {}

    private PutAliasResponsePropertiesResponse(PutAliasResponsePropertiesResponse $) {
        this.provisioningState = $.provisioningState;
        this.subscriptionId = $.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PutAliasResponsePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PutAliasResponsePropertiesResponse $;

        public Builder() {
            $ = new PutAliasResponsePropertiesResponse();
        }

        public Builder(PutAliasResponsePropertiesResponse defaults) {
            $ = new PutAliasResponsePropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder provisioningState(@Nullable String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder subscriptionId(String subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        public PutAliasResponsePropertiesResponse build() {
            $.subscriptionId = Objects.requireNonNull($.subscriptionId, "expected parameter 'subscriptionId' to be non-null");
            return $;
        }
    }

}
