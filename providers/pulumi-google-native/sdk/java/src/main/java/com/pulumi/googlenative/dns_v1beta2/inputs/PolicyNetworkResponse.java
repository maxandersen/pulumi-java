// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1beta2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PolicyNetworkResponse extends com.pulumi.resources.InvokeArgs {

    public static final PolicyNetworkResponse Empty = new PolicyNetworkResponse();

    @Import(name="kind", required=true)
      private final String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * The fully qualified URL of the VPC network to bind to. This should be formatted like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
     * 
     */
    @Import(name="networkUrl", required=true)
      private final String networkUrl;

    public String networkUrl() {
        return this.networkUrl;
    }

    public PolicyNetworkResponse(
        String kind,
        String networkUrl) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.networkUrl = Objects.requireNonNull(networkUrl, "expected parameter 'networkUrl' to be non-null");
    }

    private PolicyNetworkResponse() {
        this.kind = null;
        this.networkUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyNetworkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private String networkUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyNetworkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.networkUrl = defaults.networkUrl;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder networkUrl(String networkUrl) {
            this.networkUrl = Objects.requireNonNull(networkUrl);
            return this;
        }        public PolicyNetworkResponse build() {
            return new PolicyNetworkResponse(kind, networkUrl);
        }
    }
}
