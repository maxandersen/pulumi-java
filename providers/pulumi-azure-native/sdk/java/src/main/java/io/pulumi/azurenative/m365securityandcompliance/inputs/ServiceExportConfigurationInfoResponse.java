// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.m365securityandcompliance.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Export operation configuration information
 * 
 */
public final class ServiceExportConfigurationInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceExportConfigurationInfoResponse Empty = new ServiceExportConfigurationInfoResponse();

    /**
     * The name of the default export storage account.
     * 
     */
    @Import(name="storageAccountName")
      private final @Nullable String storageAccountName;

    public Optional<String> storageAccountName() {
        return this.storageAccountName == null ? Optional.empty() : Optional.ofNullable(this.storageAccountName);
    }

    public ServiceExportConfigurationInfoResponse(@Nullable String storageAccountName) {
        this.storageAccountName = storageAccountName;
    }

    private ServiceExportConfigurationInfoResponse() {
        this.storageAccountName = null;
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
