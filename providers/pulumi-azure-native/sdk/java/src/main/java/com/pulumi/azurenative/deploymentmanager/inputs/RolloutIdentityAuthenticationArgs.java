// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * RolloutIdentity uses the user-assigned managed identity authentication context specified in the Identity property during rollout creation.
 * 
 */
public final class RolloutIdentityAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final RolloutIdentityAuthenticationArgs Empty = new RolloutIdentityAuthenticationArgs();

    /**
     * The authentication type.
     * Expected value is &#39;RolloutIdentity&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public RolloutIdentityAuthenticationArgs(Output<String> type) {
        this.type = Codegen.stringProp("type").output().arg(type).require();
    }

    private RolloutIdentityAuthenticationArgs() {
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RolloutIdentityAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RolloutIdentityAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public RolloutIdentityAuthenticationArgs build() {
            return new RolloutIdentityAuthenticationArgs(type);
        }
    }
}
