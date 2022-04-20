// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class BackendServiceSecuritySettingsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceSecuritySettingsGetArgs Empty = new BackendServiceSecuritySettingsGetArgs();

    /**
     * ClientTlsPolicy is a resource that specifies how a client should authenticate
     * connections to backends of a service. This resource itself does not affect
     * configuration unless it is attached to a backend service resource.
     * 
     */
    @Import(name="clientTlsPolicy", required=true)
      private final Output<String> clientTlsPolicy;

    public Output<String> clientTlsPolicy() {
        return this.clientTlsPolicy;
    }

    /**
     * A list of alternate names to verify the subject identity in the certificate.
     * If specified, the client will verify that the server certificate&#39;s subject
     * alt name matches one of the specified values.
     * 
     */
    @Import(name="subjectAltNames", required=true)
      private final Output<List<String>> subjectAltNames;

    public Output<List<String>> subjectAltNames() {
        return this.subjectAltNames;
    }

    public BackendServiceSecuritySettingsGetArgs(
        Output<String> clientTlsPolicy,
        Output<List<String>> subjectAltNames) {
        this.clientTlsPolicy = Objects.requireNonNull(clientTlsPolicy, "expected parameter 'clientTlsPolicy' to be non-null");
        this.subjectAltNames = Objects.requireNonNull(subjectAltNames, "expected parameter 'subjectAltNames' to be non-null");
    }

    private BackendServiceSecuritySettingsGetArgs() {
        this.clientTlsPolicy = Codegen.empty();
        this.subjectAltNames = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceSecuritySettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> clientTlsPolicy;
        private Output<List<String>> subjectAltNames;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceSecuritySettingsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientTlsPolicy = defaults.clientTlsPolicy;
    	      this.subjectAltNames = defaults.subjectAltNames;
        }

        public Builder clientTlsPolicy(Output<String> clientTlsPolicy) {
            this.clientTlsPolicy = Objects.requireNonNull(clientTlsPolicy);
            return this;
        }
        public Builder clientTlsPolicy(String clientTlsPolicy) {
            this.clientTlsPolicy = Output.of(Objects.requireNonNull(clientTlsPolicy));
            return this;
        }
        public Builder subjectAltNames(Output<List<String>> subjectAltNames) {
            this.subjectAltNames = Objects.requireNonNull(subjectAltNames);
            return this;
        }
        public Builder subjectAltNames(List<String> subjectAltNames) {
            this.subjectAltNames = Output.of(Objects.requireNonNull(subjectAltNames));
            return this;
        }
        public Builder subjectAltNames(String... subjectAltNames) {
            return subjectAltNames(List.of(subjectAltNames));
        }        public BackendServiceSecuritySettingsGetArgs build() {
            return new BackendServiceSecuritySettingsGetArgs(clientTlsPolicy, subjectAltNames);
        }
    }
}
