// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cognitiveservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserOwnedStorageResponse {
    /**
     * Full resource id of a Microsoft.Storage resource.
     * 
     */
    private final @Nullable String resourceId;

    @CustomType.Constructor
    private UserOwnedStorageResponse(@CustomType.Parameter("resourceId") @Nullable String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * Full resource id of a Microsoft.Storage resource.
     * 
    */
    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserOwnedStorageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserOwnedStorageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
        }

        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }        public UserOwnedStorageResponse build() {
            return new UserOwnedStorageResponse(resourceId);
        }
    }
}
