// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of Storage Account.
 * 
 */
public final class StorageAccountPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final StorageAccountPropertiesResponse Empty = new StorageAccountPropertiesResponse();

    /**
     * ARM resource ID of the Azure Storage Account to store CLI specific files. If not provided one will be created. This cannot be changed once the cluster is created.
     * 
     */
    @Import(name="resourceId")
      private final @Nullable String resourceId;

    public Optional<String> resourceId() {
        return this.resourceId == null ? Optional.empty() : Optional.ofNullable(this.resourceId);
    }

    public StorageAccountPropertiesResponse(@Nullable String resourceId) {
        this.resourceId = resourceId;
    }

    private StorageAccountPropertiesResponse() {
        this.resourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
        }

        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }        public StorageAccountPropertiesResponse build() {
            return new StorageAccountPropertiesResponse(resourceId);
        }
    }
}
