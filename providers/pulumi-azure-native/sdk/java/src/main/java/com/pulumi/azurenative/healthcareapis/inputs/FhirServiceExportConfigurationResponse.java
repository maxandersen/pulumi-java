// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.healthcareapis.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Export operation configuration information
 * 
 */
public final class FhirServiceExportConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final FhirServiceExportConfigurationResponse Empty = new FhirServiceExportConfigurationResponse();

    /**
     * The name of the default export storage account.
     * 
     */
    @Import(name="storageAccountName")
    private @Nullable String storageAccountName;

    public Optional<String> storageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }

    private FhirServiceExportConfigurationResponse() {}

    private FhirServiceExportConfigurationResponse(FhirServiceExportConfigurationResponse $) {
        this.storageAccountName = $.storageAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FhirServiceExportConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FhirServiceExportConfigurationResponse $;

        public Builder() {
            $ = new FhirServiceExportConfigurationResponse();
        }

        public Builder(FhirServiceExportConfigurationResponse defaults) {
            $ = new FhirServiceExportConfigurationResponse(Objects.requireNonNull(defaults));
        }

        public Builder storageAccountName(@Nullable String storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        public FhirServiceExportConfigurationResponse build() {
            return $;
        }
    }

}
