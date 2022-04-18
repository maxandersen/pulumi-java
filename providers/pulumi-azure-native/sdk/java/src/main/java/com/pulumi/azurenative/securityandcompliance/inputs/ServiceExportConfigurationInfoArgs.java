// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityandcompliance.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Export operation configuration information
 * 
 */
public final class ServiceExportConfigurationInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceExportConfigurationInfoArgs Empty = new ServiceExportConfigurationInfoArgs();

    /**
     * The name of the default export storage account.
     * 
     */
    @Import(name="storageAccountName")
      private final @Nullable Output<String> storageAccountName;

    public Output<String> storageAccountName() {
        return this.storageAccountName == null ? Codegen.empty() : this.storageAccountName;
    }

    public ServiceExportConfigurationInfoArgs(@Nullable Output<String> storageAccountName) {
        this.storageAccountName = storageAccountName;
    }

    private ServiceExportConfigurationInfoArgs() {
        this.storageAccountName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceExportConfigurationInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> storageAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceExportConfigurationInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.storageAccountName = defaults.storageAccountName;
        }

        public Builder storageAccountName(@Nullable Output<String> storageAccountName) {
            this.storageAccountName = storageAccountName;
            return this;
        }
        public Builder storageAccountName(@Nullable String storageAccountName) {
            this.storageAccountName = Codegen.ofNullable(storageAccountName);
            return this;
        }        public ServiceExportConfigurationInfoArgs build() {
            return new ServiceExportConfigurationInfoArgs(storageAccountName);
        }
    }
}
