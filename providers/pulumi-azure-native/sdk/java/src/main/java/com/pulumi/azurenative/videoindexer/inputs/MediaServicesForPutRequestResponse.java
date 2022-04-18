// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoindexer.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The media services details
 * 
 */
public final class MediaServicesForPutRequestResponse extends com.pulumi.resources.InvokeArgs {

    public static final MediaServicesForPutRequestResponse Empty = new MediaServicesForPutRequestResponse();

    /**
     * The media services resource id
     * 
     */
    @Import(name="resourceId")
      private final @Nullable String resourceId;

    public Optional<String> resourceId() {
        return this.resourceId == null ? Optional.empty() : Optional.ofNullable(this.resourceId);
    }

    /**
     * The user assigned identity to be used to grant permissions
     * 
     */
    @Import(name="userAssignedIdentity")
      private final @Nullable String userAssignedIdentity;

    public Optional<String> userAssignedIdentity() {
        return this.userAssignedIdentity == null ? Optional.empty() : Optional.ofNullable(this.userAssignedIdentity);
    }

    public MediaServicesForPutRequestResponse(
        @Nullable String resourceId,
        @Nullable String userAssignedIdentity) {
        this.resourceId = resourceId;
        this.userAssignedIdentity = userAssignedIdentity;
    }

    private MediaServicesForPutRequestResponse() {
        this.resourceId = null;
        this.userAssignedIdentity = null;
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
