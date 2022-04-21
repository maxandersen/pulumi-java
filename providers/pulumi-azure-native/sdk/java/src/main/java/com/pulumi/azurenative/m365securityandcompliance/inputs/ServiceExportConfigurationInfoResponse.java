// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.m365securityandcompliance.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Export operation configuration information
 * 
 */
public final class ServiceExportConfigurationInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServiceExportConfigurationInfoResponse Empty = new ServiceExportConfigurationInfoResponse();

    /**
     * The name of the default export storage account.
     * 
     */
    @Import(name="storageAccountName")
    private @Nullable String storageAccountName;

    public Optional<String> storageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }

    private ServiceExportConfigurationInfoResponse() {}

    private ServiceExportConfigurationInfoResponse(ServiceExportConfigurationInfoResponse $) {
        this.storageAccountName = $.storageAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceExportConfigurationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceExportConfigurationInfoResponse $;

        public Builder() {
            $ = new ServiceExportConfigurationInfoResponse();
        }

        public Builder(ServiceExportConfigurationInfoResponse defaults) {
            $ = new ServiceExportConfigurationInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder storageAccountName(@Nullable String storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        public ServiceExportConfigurationInfoResponse build() {
            return $;
        }
    }

}
