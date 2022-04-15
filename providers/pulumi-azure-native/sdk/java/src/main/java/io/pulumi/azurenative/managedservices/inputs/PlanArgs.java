// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managedservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Plan details for the managed services.
 * 
 */
public final class PlanArgs extends io.pulumi.resources.ResourceArgs {

    public static final PlanArgs Empty = new PlanArgs();

    /**
     * The plan name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The product code.
     * 
     */
    @Import(name="product", required=true)
      private final Output<String> product;

    public Output<String> product() {
        return this.product;
    }

    /**
     * The publisher ID.
     * 
     */
    @Import(name="publisher", required=true)
      private final Output<String> publisher;

    public Output<String> publisher() {
        return this.publisher;
    }

    /**
     * The plan's version.
     * 
     */
    @Import(name="version", required=true)
      private final Output<String> version;

    public Output<String> version() {
        return this.version;
    }

    public PlanArgs(
        Output<String> name,
        Output<String> product,
        Output<String> publisher,
        Output<String> version) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.product = Objects.requireNonNull(product, "expected parameter 'product' to be non-null");
        this.publisher = Objects.requireNonNull(publisher, "expected parameter 'publisher' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private PlanArgs() {
        this.name = Codegen.empty();
        this.product = Codegen.empty();
        this.publisher = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<String> product;
        private Output<String> publisher;
        private Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(PlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.product = defaults.product;
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
        public Builder publisher(Output<String> publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }
        public Builder publisher(String publisher) {
            this.publisher = Output.of(Objects.requireNonNull(publisher));
            return this;
        }
        public Builder version(Output<String> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder version(String version) {
            this.version = Output.of(Objects.requireNonNull(version));
            return this;
        }        public PlanArgs build() {
            return new PlanArgs(name, product, publisher, version);
        }
    }
}
