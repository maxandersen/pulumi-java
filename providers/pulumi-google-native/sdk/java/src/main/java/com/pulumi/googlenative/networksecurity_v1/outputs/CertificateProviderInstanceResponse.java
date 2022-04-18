// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CertificateProviderInstanceResponse {
    /**
     * Plugin instance name, used to locate and load CertificateProvider instance configuration. Set to "google_cloud_private_spiffe" to use Certificate Authority Service certificate provider instance.
     * 
     */
    private final String pluginInstance;

    @CustomType.Constructor
    private CertificateProviderInstanceResponse(@CustomType.Parameter("pluginInstance") String pluginInstance) {
        this.pluginInstance = pluginInstance;
    }

    /**
     * Plugin instance name, used to locate and load CertificateProvider instance configuration. Set to "google_cloud_private_spiffe" to use Certificate Authority Service certificate provider instance.
     * 
    */
    public String pluginInstance() {
        return this.pluginInstance;
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
