// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The user owned storage for Cognitive Services account.
 * 
 */
public final class UserOwnedStorageResponse extends io.pulumi.resources.InvokeArgs {

    public static final UserOwnedStorageResponse Empty = new UserOwnedStorageResponse();

    /**
     * Full resource id of a Microsoft.Storage resource.
     * 
     */
    @Import(name="resourceId")
      private final @Nullable String resourceId;

    public Optional<String> resourceId() {
        return this.resourceId == null ? Optional.empty() : Optional.ofNullable(this.resourceId);
    }

    public UserOwnedStorageResponse(@Nullable String resourceId) {
        this.resourceId = resourceId;
    }

    private UserOwnedStorageResponse() {
        this.resourceId = null;
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
