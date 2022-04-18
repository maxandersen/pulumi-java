// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The custom setup of installing 3rd party components.
 * 
 */
public final class ComponentSetupResponse extends com.pulumi.resources.InvokeArgs {

    public static final ComponentSetupResponse Empty = new ComponentSetupResponse();

    /**
     * The name of the 3rd party component.
     * 
     */
    @Import(name="componentName", required=true)
      private final String componentName;

    public String componentName() {
        return this.componentName;
    }

    /**
     * The license key to activate the component.
     * 
     */
    @Import(name="licenseKey")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> licenseKey;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> licenseKey() {
        return this.licenseKey == null ? null : this.licenseKey;
    }

    /**
     * The type of custom setup.
     * Expected value is 'ComponentSetup'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public ComponentSetupResponse(
        String componentName,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> licenseKey,
        String type) {
        this.componentName = Objects.requireNonNull(componentName, "expected parameter 'componentName' to be non-null");
        this.licenseKey = licenseKey;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ComponentSetupResponse() {
        this.componentName = null;
        this.licenseKey = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentSetupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String componentName;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> licenseKey;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentSetupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentName = defaults.componentName;
    	      this.licenseKey = defaults.licenseKey;
    	      this.type = defaults.type;
        }

        public Builder componentName(String componentName) {
            this.componentName = Objects.requireNonNull(componentName);
            return this;
        }
        public Builder licenseKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> licenseKey) {
            this.licenseKey = licenseKey;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ComponentSetupResponse build() {
            return new ComponentSetupResponse(componentName, licenseKey, type);
        }
    }
}
