// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.RequestMethodMatchConditionParametersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the RequestMethod condition for the delivery rule.
 * 
 */
public final class DeliveryRuleRequestMethodConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeliveryRuleRequestMethodConditionArgs Empty = new DeliveryRuleRequestMethodConditionArgs();

    /**
     * The name of the condition for the delivery rule.
     * Expected value is &#39;RequestMethod&#39;.
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
      private final Output<RequestMethodMatchConditionParametersArgs> parameters;

    public Output<RequestMethodMatchConditionParametersArgs> parameters() {
        return this.parameters;
    }

    public DeliveryRuleRequestMethodConditionArgs(
        Output<String> name,
        Output<RequestMethodMatchConditionParametersArgs> parameters) {
        this.name = Codegen.stringProp("name").output().arg(name).require();
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private DeliveryRuleRequestMethodConditionArgs() {
        this.name = Codegen.empty();
        this.parameters = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleRequestMethodConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<RequestMethodMatchConditionParametersArgs> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleRequestMethodConditionArgs defaults) {
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
        public Builder parameters(Output<RequestMethodMatchConditionParametersArgs> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(RequestMethodMatchConditionParametersArgs parameters) {
            this.parameters = Output.of(Objects.requireNonNull(parameters));
            return this;
        }        public DeliveryRuleRequestMethodConditionArgs build() {
            return new DeliveryRuleRequestMethodConditionArgs(name, parameters);
        }
    }
}
