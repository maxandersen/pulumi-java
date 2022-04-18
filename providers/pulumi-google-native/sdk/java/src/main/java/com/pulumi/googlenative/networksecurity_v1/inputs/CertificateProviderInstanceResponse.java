// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specification of a TLS certificate provider instance. Workloads may have one or more CertificateProvider instances (plugins) and one of them is enabled and configured by specifying this message. Workloads use the values from this message to locate and load the CertificateProvider instance configuration.
 * 
 */
public final class CertificateProviderInstanceResponse extends com.pulumi.resources.InvokeArgs {

    public static final CertificateProviderInstanceResponse Empty = new CertificateProviderInstanceResponse();

    /**
     * Plugin instance name, used to locate and load CertificateProvider instance configuration. Set to "google_cloud_private_spiffe" to use Certificate Authority Service certificate provider instance.
     * 
     */
    @Import(name="pluginInstance", required=true)
      private final String pluginInstance;

    public String pluginInstance() {
        return this.pluginInstance;
    }

    public CertificateProviderInstanceResponse(String pluginInstance) {
        this.pluginInstance = Objects.requireNonNull(pluginInstance, "expected parameter 'pluginInstance' to be non-null");
    }

    private CertificateProviderInstanceResponse() {
        this.pluginInstance = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateProviderInstanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String pluginInstance;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateProviderInstanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pluginInstance = defaults.pluginInstance;
        }

        public Builder pluginInstance(String pluginInstance) {
            this.pluginInstance = Objects.requireNonNull(pluginInstance);
            return this;
        }        public CertificateProviderInstanceResponse build() {
            return new CertificateProviderInstanceResponse(pluginInstance);
        }
    }
}
