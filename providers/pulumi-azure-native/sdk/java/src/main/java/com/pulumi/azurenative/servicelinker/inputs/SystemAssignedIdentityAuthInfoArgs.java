// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicelinker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The authentication info when authType is systemAssignedIdentity
 * 
 */
public final class SystemAssignedIdentityAuthInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final SystemAssignedIdentityAuthInfoArgs Empty = new SystemAssignedIdentityAuthInfoArgs();

    /**
     * The authentication type.
     * Expected value is &#39;systemAssignedIdentity&#39;.
     * 
     */
    @Import(name="authType", required=true)
      private final Output<String> authType;

    public Output<String> authType() {
        return this.authType;
    }

    public SystemAssignedIdentityAuthInfoArgs(Output<String> authType) {
        this.authType = Codegen.stringProp("authType").output().arg(authType).require();
    }

    private SystemAssignedIdentityAuthInfoArgs() {
        this.authType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SystemAssignedIdentityAuthInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> authType;

        public Builder() {
    	      // Empty
        }

        public Builder(SystemAssignedIdentityAuthInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authType = defaults.authType;
        }

        public Builder authType(Output<String> authType) {
            this.authType = Objects.requireNonNull(authType);
            return this;
        }
        public Builder authType(String authType) {
            this.authType = Output.of(Objects.requireNonNull(authType));
            return this;
        }        public SystemAssignedIdentityAuthInfoArgs build() {
            return new SystemAssignedIdentityAuthInfoArgs(authType);
        }
    }
}
