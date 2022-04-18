// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mq.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetBrokerInstance extends com.pulumi.resources.InvokeArgs {

    public static final GetBrokerInstance Empty = new GetBrokerInstance();

    @Import(name="consoleUrl", required=true)
      private final String consoleUrl;

    public String consoleUrl() {
        return this.consoleUrl;
    }

    @Import(name="endpoints", required=true)
      private final List<String> endpoints;

    public List<String> endpoints() {
        return this.endpoints;
    }

    @Import(name="ipAddress", required=true)
      private final String ipAddress;

    public String ipAddress() {
        return this.ipAddress;
    }

    public GetBrokerInstance(
        String consoleUrl,
        List<String> endpoints,
        String ipAddress) {
        this.consoleUrl = Objects.requireNonNull(consoleUrl, "expected parameter 'consoleUrl' to be non-null");
        this.endpoints = Objects.requireNonNull(endpoints, "expected parameter 'endpoints' to be non-null");
        this.ipAddress = Objects.requireNonNull(ipAddress, "expected parameter 'ipAddress' to be non-null");
    }

    private GetBrokerInstance() {
        this.consoleUrl = null;
        this.endpoints = List.of();
        this.ipAddress = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBrokerInstance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String consoleUrl;
        private List<String> endpoints;
        private String ipAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBrokerInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consoleUrl = defaults.consoleUrl;
    	      this.endpoints = defaults.endpoints;
    	      this.ipAddress = defaults.ipAddress;
        }

        public Builder consoleUrl(String consoleUrl) {
            this.consoleUrl = Objects.requireNonNull(consoleUrl);
            return this;
        }
        public Builder endpoints(List<String> endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }
        public Builder endpoints(String... endpoints) {
            return endpoints(List.of(endpoints));
        }
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }        public GetBrokerInstance build() {
            return new GetBrokerInstance(consoleUrl, endpoints, ipAddress);
        }
    }
}
