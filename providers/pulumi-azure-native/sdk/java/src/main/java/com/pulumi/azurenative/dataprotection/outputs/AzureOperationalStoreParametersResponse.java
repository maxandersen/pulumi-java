// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureOperationalStoreParametersResponse {
    /**
     * type of datastore; Operational/Vault/Archive
     * 
     */
    private final String dataStoreType;
    /**
     * Type of the specific object - used for deserializing
     * Expected value is &#39;AzureOperationalStoreParameters&#39;.
     * 
     */
    private final String objectType;
    /**
     * Gets or sets the Snapshot Resource Group Uri.
     * 
     */
    private final @Nullable String resourceGroupId;

    @CustomType.Constructor
    private AzureOperationalStoreParametersResponse(
        @CustomType.Parameter("dataStoreType") String dataStoreType,
        @CustomType.Parameter("objectType") String objectType,
        @CustomType.Parameter("resourceGroupId") @Nullable String resourceGroupId) {
        this.dataStoreType = dataStoreType;
        this.objectType = objectType;
        this.resourceGroupId = resourceGroupId;
    }

    /**
     * type of datastore; Operational/Vault/Archive
     * 
    */
    public String dataStoreType() {
        return this.dataStoreType;
    }
    /**
     * Type of the specific object - used for deserializing
     * Expected value is &#39;AzureOperationalStoreParameters&#39;.
     * 
    */
    public String objectType() {
        return this.objectType;
    }
    /**
     * Gets or sets the Snapshot Resource Group Uri.
     * 
    */
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureOperationalStoreParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataStoreType;
        private String objectType;
        private @Nullable String resourceGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureOperationalStoreParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataStoreType = defaults.dataStoreType;
    	      this.objectType = defaults.objectType;
    	      this.resourceGroupId = defaults.resourceGroupId;
        }

        public Builder dataStoreType(String dataStoreType) {
            this.dataStoreType = Objects.requireNonNull(dataStoreType);
            return this;
        }
        public Builder objectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }        public AzureOperationalStoreParametersResponse build() {
            return new AzureOperationalStoreParametersResponse(dataStoreType, objectType, resourceGroupId);
        }
    }
}
