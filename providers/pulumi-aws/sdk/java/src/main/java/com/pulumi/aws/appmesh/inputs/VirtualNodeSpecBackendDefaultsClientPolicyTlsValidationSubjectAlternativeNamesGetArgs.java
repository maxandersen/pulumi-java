// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.util.Objects;


public final class VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesGetArgs Empty = new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesGetArgs();

    /**
     * The criteria for determining a SAN&#39;s match.
     * 
     */
    @Import(name="match", required=true)
      private final Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs> match;

    public Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs> match() {
        return this.match;
    }

    public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesGetArgs(Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs> match) {
        this.match = Objects.requireNonNull(match, "expected parameter 'match' to be non-null");
    }

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesGetArgs() {
        this.match = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs> match;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.match = defaults.match;
        }

        public Builder match(Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs> match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }
        public Builder match(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs match) {
            this.match = Output.of(Objects.requireNonNull(match));
            return this;
        }        public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesGetArgs build() {
            return new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesGetArgs(match);
        }
    }
}
