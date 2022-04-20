// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FirewallPolicyRuleSecureTagResponse extends com.pulumi.resources.InvokeArgs {

    public static final FirewallPolicyRuleSecureTagResponse Empty = new FirewallPolicyRuleSecureTagResponse();

    /**
     * Name of the secure tag, created with TagManager&#39;s TagValue API.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * State of the secure tag, either `EFFECTIVE` or `INEFFECTIVE`. A secure tag is `INEFFECTIVE` when it is deleted or its network is deleted.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String state() {
        return this.state;
    }

    public FirewallPolicyRuleSecureTagResponse(
        String name,
        String state) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private FirewallPolicyRuleSecureTagResponse() {
        this.name = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleSecureTagResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleSecureTagResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.state = defaults.state;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public FirewallPolicyRuleSecureTagResponse build() {
            return new FirewallPolicyRuleSecureTagResponse(name, state);
        }
    }
}
