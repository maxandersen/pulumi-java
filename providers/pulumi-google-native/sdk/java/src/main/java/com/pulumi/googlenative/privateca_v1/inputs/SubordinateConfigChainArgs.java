// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * This message describes a subordinate CA&#39;s issuer certificate chain. This wrapper exists for compatibility reasons.
 * 
 */
public final class SubordinateConfigChainArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubordinateConfigChainArgs Empty = new SubordinateConfigChainArgs();

    /**
     * Expected to be in leaf-to-root order according to RFC 5246.
     * 
     */
    @Import(name="pemCertificates", required=true)
    private Output<List<String>> pemCertificates;

    public Output<List<String>> pemCertificates() {
        return this.pemCertificates;
    }

    private SubordinateConfigChainArgs() {}

    private SubordinateConfigChainArgs(SubordinateConfigChainArgs $) {
        this.pemCertificates = $.pemCertificates;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubordinateConfigChainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubordinateConfigChainArgs $;

        public Builder() {
            $ = new SubordinateConfigChainArgs();
        }

        public Builder(SubordinateConfigChainArgs defaults) {
            $ = new SubordinateConfigChainArgs(Objects.requireNonNull(defaults));
        }

        public Builder pemCertificates(Output<List<String>> pemCertificates) {
            $.pemCertificates = pemCertificates;
            return this;
        }

        public Builder pemCertificates(List<String> pemCertificates) {
            return pemCertificates(Output.of(pemCertificates));
        }

        public Builder pemCertificates(String... pemCertificates) {
            return pemCertificates(List.of(pemCertificates));
        }

        public SubordinateConfigChainArgs build() {
            $.pemCertificates = Objects.requireNonNull($.pemCertificates, "expected parameter 'pemCertificates' to be non-null");
            return $;
        }
    }

}
