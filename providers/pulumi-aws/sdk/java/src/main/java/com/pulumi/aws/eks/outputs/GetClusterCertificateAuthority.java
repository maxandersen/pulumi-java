// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterCertificateAuthority {
    /**
     * The base64 encoded certificate data required to communicate with your cluster. Add this to the `certificate-authority-data` section of the `kubeconfig` file for your cluster.
     * 
     */
    private final String data;

    @CustomType.Constructor
    private GetClusterCertificateAuthority(@CustomType.Parameter("data") String data) {
        this.data = data;
    }

    /**
     * The base64 encoded certificate data required to communicate with your cluster. Add this to the `certificate-authority-data` section of the `kubeconfig` file for your cluster.
     * 
    */
    public String data() {
        return this.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterCertificateAuthority defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String data;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterCertificateAuthority defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
        }

        public Builder data(String data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }        public GetClusterCertificateAuthority build() {
            return new GetClusterCertificateAuthority(data);
        }
    }
}
