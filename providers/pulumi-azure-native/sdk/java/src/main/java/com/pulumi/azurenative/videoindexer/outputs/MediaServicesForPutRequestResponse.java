// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoindexer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MediaServicesForPutRequestResponse {
    /**
     * The media services resource id
     * 
     */
    private final @Nullable String resourceId;
    /**
     * The user assigned identity to be used to grant permissions
     * 
     */
    private final @Nullable String userAssignedIdentity;

    @CustomType.Constructor
    private MediaServicesForPutRequestResponse(
        @CustomType.Parameter("resourceId") @Nullable String resourceId,
        @CustomType.Parameter("userAssignedIdentity") @Nullable String userAssignedIdentity) {
        this.resourceId = resourceId;
        this.userAssignedIdentity = userAssignedIdentity;
    }

    /**
     * The media services resource id
     * 
    */
    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    /**
     * The user assigned identity to be used to grant permissions
     * 
    */
    public Optional<String> userAssignedIdentity() {
        return Optional.ofNullable(this.userAssignedIdentity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MediaServicesForPutRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resourceId;
        private @Nullable String userAssignedIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(MediaServicesForPutRequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
    	      this.userAssignedIdentity = defaults.userAssignedIdentity;
        }

        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder userAssignedIdentity(@Nullable String userAssignedIdentity) {
            this.userAssignedIdentity = userAssignedIdentity;
            return this;
        }        public MediaServicesForPutRequestResponse build() {
            return new MediaServicesForPutRequestResponse(resourceId, userAssignedIdentity);
        }
    }
}
