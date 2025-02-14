// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.healthcareapis.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceExportConfigurationInfoResponse {
    /**
     * @return The name of the default export storage account.
     * 
     */
    private final @Nullable String storageAccountName;

    @CustomType.Constructor
    private ServiceExportConfigurationInfoResponse(@CustomType.Parameter("storageAccountName") @Nullable String storageAccountName) {
        this.storageAccountName = storageAccountName;
    }

    /**
     * @return The name of the default export storage account.
     * 
     */
    public Optional<String> storageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceExportConfigurationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String storageAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceExportConfigurationInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.storageAccountName = defaults.storageAccountName;
        }

        public Builder storageAccountName(@Nullable String storageAccountName) {
            this.storageAccountName = storageAccountName;
            return this;
        }        public ServiceExportConfigurationInfoResponse build() {
            return new ServiceExportConfigurationInfoResponse(storageAccountName);
        }
    }
}
