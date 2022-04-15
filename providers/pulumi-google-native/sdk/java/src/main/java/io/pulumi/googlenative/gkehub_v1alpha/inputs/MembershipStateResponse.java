// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * MembershipState describes the state of a Membership resource.
 * 
 */
public final class MembershipStateResponse extends io.pulumi.resources.InvokeArgs {

    public static final MembershipStateResponse Empty = new MembershipStateResponse();

    /**
     * The current state of the Membership resource.
     * 
     */
    @Import(name="code", required=true)
      private final String code;

    public String code() {
        return this.code;
    }

    public MembershipStateResponse(String code) {
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
    }

    private MembershipStateResponse() {
        this.code = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }        public MembershipStateResponse build() {
            return new MembershipStateResponse(code);
        }
    }
}
