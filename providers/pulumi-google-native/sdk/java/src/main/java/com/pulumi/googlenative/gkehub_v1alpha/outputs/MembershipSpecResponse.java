// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MembershipSpecResponse {
    /**
     * @return Specifies workload certificate management.
     * 
     */
    private final String certificateManagement;

    @CustomType.Constructor
    private MembershipSpecResponse(@CustomType.Parameter("certificateManagement") String certificateManagement) {
        this.certificateManagement = certificateManagement;
    }

    /**
     * @return Specifies workload certificate management.
     * 
     */
    public String certificateManagement() {
        return this.certificateManagement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateManagement;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateManagement = defaults.certificateManagement;
        }

        public Builder certificateManagement(String certificateManagement) {
            this.certificateManagement = Objects.requireNonNull(certificateManagement);
            return this;
        }        public MembershipSpecResponse build() {
            return new MembershipSpecResponse(certificateManagement);
        }
    }
}
