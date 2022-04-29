// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetPolicyDefinitionArgs extends InvokeArgs {

    public static final GetPolicyDefinitionArgs Empty = new GetPolicyDefinitionArgs();

    /**
     * The name of the policy definition to get.
     * 
     */
    @Import(name="policyDefinitionName", required=true)
    private String policyDefinitionName;

    /**
     * @return The name of the policy definition to get.
     * 
     */
    public String policyDefinitionName() {
        return this.policyDefinitionName;
    }

    private GetPolicyDefinitionArgs() {}

    private GetPolicyDefinitionArgs(GetPolicyDefinitionArgs $) {
        this.policyDefinitionName = $.policyDefinitionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPolicyDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPolicyDefinitionArgs $;

        public Builder() {
            $ = new GetPolicyDefinitionArgs();
        }

        public Builder(GetPolicyDefinitionArgs defaults) {
            $ = new GetPolicyDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param policyDefinitionName The name of the policy definition to get.
         * 
         * @return builder
         * 
         */
        public Builder policyDefinitionName(String policyDefinitionName) {
            $.policyDefinitionName = policyDefinitionName;
            return this;
        }

        public GetPolicyDefinitionArgs build() {
            $.policyDefinitionName = Objects.requireNonNull($.policyDefinitionName, "expected parameter 'policyDefinitionName' to be non-null");
            return $;
        }
    }

}
