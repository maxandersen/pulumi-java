// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork;

import io.pulumi.azurenative.hybridnetwork.enums.SkuDeploymentMode;
import io.pulumi.azurenative.hybridnetwork.enums.SkuType;
import io.pulumi.azurenative.hybridnetwork.inputs.NetworkFunctionTemplateArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VendorSkusArgs extends io.pulumi.resources.ResourceArgs {

    public static final VendorSkusArgs Empty = new VendorSkusArgs();

    /**
     * The sku deployment mode.
     * 
     */
    @Import(name="deploymentMode")
      private final @Nullable Output<Either<String,SkuDeploymentMode>> deploymentMode;

    public Output<Either<String,SkuDeploymentMode>> deploymentMode() {
        return this.deploymentMode == null ? Codegen.empty() : this.deploymentMode;
    }

    /**
     * The parameters for the managed application to be supplied by the vendor.
     * 
     */
    @Import(name="managedApplicationParameters")
      private final @Nullable Output<Object> managedApplicationParameters;

    public Output<Object> managedApplicationParameters() {
        return this.managedApplicationParameters == null ? Codegen.empty() : this.managedApplicationParameters;
    }

    /**
     * The template for the managed application deployment.
     * 
     */
    @Import(name="managedApplicationTemplate")
      private final @Nullable Output<Object> managedApplicationTemplate;

    public Output<Object> managedApplicationTemplate() {
        return this.managedApplicationTemplate == null ? Codegen.empty() : this.managedApplicationTemplate;
    }

    /**
     * The template definition of the network function.
     * 
     */
    @Import(name="networkFunctionTemplate")
      private final @Nullable Output<NetworkFunctionTemplateArgs> networkFunctionTemplate;

    public Output<NetworkFunctionTemplateArgs> networkFunctionTemplate() {
        return this.networkFunctionTemplate == null ? Codegen.empty() : this.networkFunctionTemplate;
    }

    /**
     * Indicates if the vendor sku is in preview mode.
     * 
     */
    @Import(name="preview")
      private final @Nullable Output<Boolean> preview;

    public Output<Boolean> preview() {
        return this.preview == null ? Codegen.empty() : this.preview;
    }

    /**
     * The name of the sku.
     * 
     */
    @Import(name="skuName")
      private final @Nullable Output<String> skuName;

    public Output<String> skuName() {
        return this.skuName == null ? Codegen.empty() : this.skuName;
    }

    /**
     * The sku type.
     * 
     */
    @Import(name="skuType")
      private final @Nullable Output<Either<String,SkuType>> skuType;

    public Output<Either<String,SkuType>> skuType() {
        return this.skuType == null ? Codegen.empty() : this.skuType;
    }

    /**
     * The name of the vendor.
     * 
     */
    @Import(name="vendorName", required=true)
      private final Output<String> vendorName;

    public Output<String> vendorName() {
        return this.vendorName;
    }

    public VendorSkusArgs(
        @Nullable Output<Either<String,SkuDeploymentMode>> deploymentMode,
        @Nullable Output<Object> managedApplicationParameters,
        @Nullable Output<Object> managedApplicationTemplate,
        @Nullable Output<NetworkFunctionTemplateArgs> networkFunctionTemplate,
        @Nullable Output<Boolean> preview,
        @Nullable Output<String> skuName,
        @Nullable Output<Either<String,SkuType>> skuType,
        Output<String> vendorName) {
        this.deploymentMode = deploymentMode;
        this.managedApplicationParameters = managedApplicationParameters;
        this.managedApplicationTemplate = managedApplicationTemplate;
        this.networkFunctionTemplate = networkFunctionTemplate;
        this.preview = preview;
        this.skuName = skuName;
        this.skuType = skuType;
        this.vendorName = Objects.requireNonNull(vendorName, "expected parameter 'vendorName' to be non-null");
    }

    private VendorSkusArgs() {
        this.deploymentMode = Codegen.empty();
        this.managedApplicationParameters = Codegen.empty();
        this.managedApplicationTemplate = Codegen.empty();
        this.networkFunctionTemplate = Codegen.empty();
        this.preview = Codegen.empty();
        this.skuName = Codegen.empty();
        this.skuType = Codegen.empty();
        this.vendorName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VendorSkusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,SkuDeploymentMode>> deploymentMode;
        private @Nullable Output<Object> managedApplicationParameters;
        private @Nullable Output<Object> managedApplicationTemplate;
        private @Nullable Output<NetworkFunctionTemplateArgs> networkFunctionTemplate;
        private @Nullable Output<Boolean> preview;
        private @Nullable Output<String> skuName;
        private @Nullable Output<Either<String,SkuType>> skuType;
        private Output<String> vendorName;

        public Builder() {
    	      // Empty
        }

        public Builder(VendorSkusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentMode = defaults.deploymentMode;
    	      this.managedApplicationParameters = defaults.managedApplicationParameters;
    	      this.managedApplicationTemplate = defaults.managedApplicationTemplate;
    	      this.networkFunctionTemplate = defaults.networkFunctionTemplate;
    	      this.preview = defaults.preview;
    	      this.skuName = defaults.skuName;
    	      this.skuType = defaults.skuType;
    	      this.vendorName = defaults.vendorName;
        }

        public Builder deploymentMode(@Nullable Output<Either<String,SkuDeploymentMode>> deploymentMode) {
            this.deploymentMode = deploymentMode;
            return this;
        }
        public Builder deploymentMode(@Nullable Either<String,SkuDeploymentMode> deploymentMode) {
            this.deploymentMode = Codegen.ofNullable(deploymentMode);
            return this;
        }
        public Builder managedApplicationParameters(@Nullable Output<Object> managedApplicationParameters) {
            this.managedApplicationParameters = managedApplicationParameters;
            return this;
        }
        public Builder managedApplicationParameters(@Nullable Object managedApplicationParameters) {
            this.managedApplicationParameters = Codegen.ofNullable(managedApplicationParameters);
            return this;
        }
        public Builder managedApplicationTemplate(@Nullable Output<Object> managedApplicationTemplate) {
            this.managedApplicationTemplate = managedApplicationTemplate;
            return this;
        }
        public Builder managedApplicationTemplate(@Nullable Object managedApplicationTemplate) {
            this.managedApplicationTemplate = Codegen.ofNullable(managedApplicationTemplate);
            return this;
        }
        public Builder networkFunctionTemplate(@Nullable Output<NetworkFunctionTemplateArgs> networkFunctionTemplate) {
            this.networkFunctionTemplate = networkFunctionTemplate;
            return this;
        }
        public Builder networkFunctionTemplate(@Nullable NetworkFunctionTemplateArgs networkFunctionTemplate) {
            this.networkFunctionTemplate = Codegen.ofNullable(networkFunctionTemplate);
            return this;
        }
        public Builder preview(@Nullable Output<Boolean> preview) {
            this.preview = preview;
            return this;
        }
        public Builder preview(@Nullable Boolean preview) {
            this.preview = Codegen.ofNullable(preview);
            return this;
        }
        public Builder skuName(@Nullable Output<String> skuName) {
            this.skuName = skuName;
            return this;
        }
        public Builder skuName(@Nullable String skuName) {
            this.skuName = Codegen.ofNullable(skuName);
            return this;
        }
        public Builder skuType(@Nullable Output<Either<String,SkuType>> skuType) {
            this.skuType = skuType;
            return this;
        }
        public Builder skuType(@Nullable Either<String,SkuType> skuType) {
            this.skuType = Codegen.ofNullable(skuType);
            return this;
        }
        public Builder vendorName(Output<String> vendorName) {
            this.vendorName = Objects.requireNonNull(vendorName);
            return this;
        }
        public Builder vendorName(String vendorName) {
            this.vendorName = Output.of(Objects.requireNonNull(vendorName));
            return this;
        }        public VendorSkusArgs build() {
            return new VendorSkusArgs(deploymentMode, managedApplicationParameters, managedApplicationTemplate, networkFunctionTemplate, preview, skuName, skuType, vendorName);
        }
    }
}
