// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.UrlPathMatchConditionParametersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the UrlPath condition for the delivery rule.
 * 
 */
public final class DeliveryRuleUrlPathConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeliveryRuleUrlPathConditionArgs Empty = new DeliveryRuleUrlPathConditionArgs();

    /**
     * The name of the condition for the delivery rule.
     * Expected value is &#39;UrlPath&#39;.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Defines the parameters for the condition.
     * 
     */
    @Import(name="parameters", required=true)
      private final Output<UrlPathMatchConditionParametersArgs> parameters;

    public Output<UrlPathMatchConditionParametersArgs> parameters() {
        return this.parameters;
    }

    public DeliveryRuleUrlPathConditionArgs(
        Output<String> name,
        Output<UrlPathMatchConditionParametersArgs> parameters) {
        this.name = Codegen.stringProp("name").output().arg(name).require();
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private DeliveryRuleUrlPathConditionArgs() {
        this.name = Codegen.empty();
        this.parameters = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleUrlPathConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<UrlPathMatchConditionParametersArgs> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleUrlPathConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder parameters(Output<UrlPathMatchConditionParametersArgs> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(UrlPathMatchConditionParametersArgs parameters) {
            this.parameters = Output.of(Objects.requireNonNull(parameters));
            return this;
        }        public DeliveryRuleUrlPathConditionArgs build() {
            return new DeliveryRuleUrlPathConditionArgs(name, parameters);
        }
    }
}
