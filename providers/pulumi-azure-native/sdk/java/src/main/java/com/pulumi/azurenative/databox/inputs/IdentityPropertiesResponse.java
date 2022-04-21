// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.azurenative.databox.inputs.UserAssignedPropertiesResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Managed identity properties.
 * 
 */
public final class IdentityPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final IdentityPropertiesResponse Empty = new IdentityPropertiesResponse();

    /**
     * Managed service identity type.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * User assigned identity properties.
     * 
     */
    @Import(name="userAssigned")
    private @Nullable UserAssignedPropertiesResponse userAssigned;

    public Optional<UserAssignedPropertiesResponse> userAssigned() {
        return Optional.ofNullable(this.userAssigned);
    }

    private IdentityPropertiesResponse() {}

    private IdentityPropertiesResponse(IdentityPropertiesResponse $) {
        this.type = $.type;
        this.userAssigned = $.userAssigned;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IdentityPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IdentityPropertiesResponse $;

        public Builder() {
            $ = new IdentityPropertiesResponse();
        }

        public Builder(IdentityPropertiesResponse defaults) {
            $ = new IdentityPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public Builder userAssigned(@Nullable UserAssignedPropertiesResponse userAssigned) {
            $.userAssigned = userAssigned;
            return this;
        }

        public IdentityPropertiesResponse build() {
            return $;
        }
    }

}
