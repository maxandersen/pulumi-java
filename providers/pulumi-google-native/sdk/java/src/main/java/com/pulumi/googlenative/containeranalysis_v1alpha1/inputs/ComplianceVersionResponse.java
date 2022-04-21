// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the CIS benchmark version that is applicable to a given OS and os version.
 * 
 */
public final class ComplianceVersionResponse extends com.pulumi.resources.InvokeArgs {

    public static final ComplianceVersionResponse Empty = new ComplianceVersionResponse();

    /**
     * The CPE URI (https://cpe.mitre.org/specification/) this benchmark is applicable to.
     * 
     */
    @Import(name="cpeUri", required=true)
    private String cpeUri;

    public String cpeUri() {
        return this.cpeUri;
    }

    /**
     * The version of the benchmark. This is set to the version of the OS-specific CIS document the benchmark is defined in.
     * 
     */
    @Import(name="version", required=true)
    private String version;

    public String version() {
        return this.version;
    }

    private ComplianceVersionResponse() {}

    private ComplianceVersionResponse(ComplianceVersionResponse $) {
        this.cpeUri = $.cpeUri;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ComplianceVersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComplianceVersionResponse $;

        public Builder() {
            $ = new ComplianceVersionResponse();
        }

        public Builder(ComplianceVersionResponse defaults) {
            $ = new ComplianceVersionResponse(Objects.requireNonNull(defaults));
        }

        public Builder cpeUri(String cpeUri) {
            $.cpeUri = cpeUri;
            return this;
        }

        public Builder version(String version) {
            $.version = version;
            return this;
        }

        public ComplianceVersionResponse build() {
            $.cpeUri = Objects.requireNonNull($.cpeUri, "expected parameter 'cpeUri' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
