// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The parameters used to create a new virtual network rule while creating a new Data Lake Store account.
 * 
 */
public final class CreateVirtualNetworkRuleWithAccountParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final CreateVirtualNetworkRuleWithAccountParametersArgs Empty = new CreateVirtualNetworkRuleWithAccountParametersArgs();

    /**
     * The unique name of the virtual network rule to create.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The resource identifier for the subnet.
     * 
     */
    @Import(name="subnetId", required=true)
      private final Output<String> subnetId;

    public Output<String> subnetId() {
        return this.subnetId;
    }

    public CreateVirtualNetworkRuleWithAccountParametersArgs(
        Output<String> name,
        Output<String> subnetId) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
    }

    private CreateVirtualNetworkRuleWithAccountParametersArgs() {
        this.name = Codegen.empty();
        this.subnetId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CreateVirtualNetworkRuleWithAccountParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(CreateVirtualNetworkRuleWithAccountParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder subnetId(Output<String> subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Output.of(Objects.requireNonNull(subnetId));
            return this;
        }        public CreateVirtualNetworkRuleWithAccountParametersArgs build() {
            return new CreateVirtualNetworkRuleWithAccountParametersArgs(name, subnetId);
        }
    }
}
