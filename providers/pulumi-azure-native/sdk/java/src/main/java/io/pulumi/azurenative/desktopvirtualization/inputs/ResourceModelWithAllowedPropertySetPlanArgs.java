// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceModelWithAllowedPropertySetPlanArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceModelWithAllowedPropertySetPlanArgs Empty = new ResourceModelWithAllowedPropertySetPlanArgs();

    /**
     * A user defined name of the 3rd Party Artifact that is being procured.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The 3rd Party artifact that is being procured. E.g. NewRelic. Product maps to the OfferID specified for the artifact at the time of Data Market onboarding.
     * 
     */
    @Import(name="product", required=true)
      private final Output<String> product;

    public Output<String> product() {
        return this.product;
    }

    /**
     * A publisher provided promotion code as provisioned in Data Market for the said product/artifact.
     * 
     */
    @Import(name="promotionCode")
      private final @Nullable Output<String> promotionCode;

    public Output<String> promotionCode() {
        return this.promotionCode == null ? Codegen.empty() : this.promotionCode;
    }

    /**
     * The publisher of the 3rd Party Artifact that is being bought. E.g. NewRelic
     * 
     */
    @Import(name="publisher", required=true)
      private final Output<String> publisher;

    public Output<String> publisher() {
        return this.publisher;
    }

    /**
     * The version of the desired product/artifact.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public ResourceModelWithAllowedPropertySetPlanArgs(
        Output<String> name,
        Output<String> product,
        @Nullable Output<String> promotionCode,
        Output<String> publisher,
        @Nullable Output<String> version) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.product = Objects.requireNonNull(product, "expected parameter 'product' to be non-null");
        this.promotionCode = promotionCode;
        this.publisher = Objects.requireNonNull(publisher, "expected parameter 'publisher' to be non-null");
        this.version = version;
    }

    private ResourceModelWithAllowedPropertySetPlanArgs() {
        this.name = Codegen.empty();
        this.product = Codegen.empty();
        this.promotionCode = Codegen.empty();
        this.publisher = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceModelWithAllowedPropertySetPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<String> product;
        private @Nullable Output<String> promotionCode;
        private Output<String> publisher;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceModelWithAllowedPropertySetPlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.product = defaults.product;
    	      this.promotionCode = defaults.promotionCode;
    	      this.publisher = defaults.publisher;
    	      this.version = defaults.version;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder product(Output<String> product) {
            this.product = Objects.requireNonNull(product);
            return this;
        }
        public Builder product(String product) {
            this.product = Output.of(Objects.requireNonNull(product));
            return this;
        }
        public Builder promotionCode(@Nullable Output<String> promotionCode) {
            this.promotionCode = promotionCode;
            return this;
        }
        public Builder promotionCode(@Nullable String promotionCode) {
            this.promotionCode = Codegen.ofNullable(promotionCode);
            return this;
        }
        public Builder publisher(Output<String> publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }
        public Builder publisher(String publisher) {
            this.publisher = Output.of(Objects.requireNonNull(publisher));
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public ResourceModelWithAllowedPropertySetPlanArgs build() {
            return new ResourceModelWithAllowedPropertySetPlanArgs(name, product, promotionCode, publisher, version);
        }
    }
}
