// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs Empty = new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs();

    /**
     * The values sent must match the specified values exactly.
     * 
     */
    @Import(name="exacts", required=true)
    private Output<List<String>> exacts;

    public Output<List<String>> exacts() {
        return this.exacts;
    }

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs() {}

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs $) {
        this.exacts = $.exacts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs $;

        public Builder() {
            $ = new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs();
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs defaults) {
            $ = new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder exacts(Output<List<String>> exacts) {
            $.exacts = exacts;
            return this;
        }

        public Builder exacts(List<String> exacts) {
            return exacts(Output.of(exacts));
        }

        public Builder exacts(String... exacts) {
            return exacts(List.of(exacts));
        }

        public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatchGetArgs build() {
            $.exacts = Objects.requireNonNull($.exacts, "expected parameter 'exacts' to be non-null");
            return $;
        }
    }

}
