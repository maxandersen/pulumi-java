// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Specification of a TLS certificate provider instance. Workloads may have one or more CertificateProvider instances (plugins) and one of them is enabled and configured by specifying this message. Workloads use the values from this message to locate and load the CertificateProvider instance configuration.
 * 
 */
public final class CertificateProviderInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateProviderInstanceArgs Empty = new CertificateProviderInstanceArgs();

    /**
     * Plugin instance name, used to locate and load CertificateProvider instance configuration. Set to &#34;google_cloud_private_spiffe&#34; to use Certificate Authority Service certificate provider instance.
     * 
     */
    @Import(name="pluginInstance", required=true)
      private final Output<String> pluginInstance;

    public Output<String> pluginInstance() {
        return this.pluginInstance;
    }

    public CertificateProviderInstanceArgs(Output<String> pluginInstance) {
        this.pluginInstance = Objects.requireNonNull(pluginInstance, "expected parameter 'pluginInstance' to be non-null");
    }

    private CertificateProviderInstanceArgs() {
        this.pluginInstance = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateProviderInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> pluginInstance;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateProviderInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pluginInstance = defaults.pluginInstance;
        }

        public Builder pluginInstance(Output<String> pluginInstance) {
            this.pluginInstance = Objects.requireNonNull(pluginInstance);
            return this;
        }
        public Builder pluginInstance(String pluginInstance) {
            this.pluginInstance = Output.of(Objects.requireNonNull(pluginInstance));
            return this;
        }        public CertificateProviderInstanceArgs build() {
            return new CertificateProviderInstanceArgs(pluginInstance);
        }
    }
}
