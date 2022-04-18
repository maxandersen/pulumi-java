// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration for an App Engine network endpoint group (NEG). The service is optional, may be provided explicitly or in the URL mask. The version is optional and can only be provided explicitly or in the URL mask when service is present. Note: App Engine service must be in the same project and located in the same region as the Serverless NEG.
 * 
 */
public final class NetworkEndpointGroupAppEngineResponse extends com.pulumi.resources.InvokeArgs {

    public static final NetworkEndpointGroupAppEngineResponse Empty = new NetworkEndpointGroupAppEngineResponse();

    /**
     * Optional serving service. The service name is case-sensitive and must be 1-63 characters long. Example value: "default", "my-service".
     * 
     */
    @Import(name="service", required=true)
      private final String service;

    public String service() {
        return this.service;
    }

    /**
     * A template to parse service and version fields from a request URL. URL mask allows for routing to multiple App Engine services without having to create multiple Network Endpoint Groups and backend services. For example, the request URLs "foo1-dot-appname.appspot.com/v1" and "foo1-dot-appname.appspot.com/v2" can be backed by the same Serverless NEG with URL mask "-dot-appname.appspot.com/". The URL mask will parse them to { service = "foo1", version = "v1" } and { service = "foo1", version = "v2" } respectively.
     * 
     */
    @Import(name="urlMask", required=true)
      private final String urlMask;

    public String urlMask() {
        return this.urlMask;
    }

    /**
     * Optional serving version. The version name is case-sensitive and must be 1-100 characters long. Example value: "v1", "v2".
     * 
     */
    @Import(name="version", required=true)
      private final String version;

    public String version() {
        return this.version;
    }

    public NetworkEndpointGroupAppEngineResponse(
        String service,
        String urlMask,
        String version) {
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
        this.urlMask = Objects.requireNonNull(urlMask, "expected parameter 'urlMask' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private NetworkEndpointGroupAppEngineResponse() {
        this.service = null;
        this.urlMask = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkEndpointGroupAppEngineResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String service;
        private String urlMask;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkEndpointGroupAppEngineResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.service = defaults.service;
    	      this.urlMask = defaults.urlMask;
    	      this.version = defaults.version;
        }

        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public Builder urlMask(String urlMask) {
            this.urlMask = Objects.requireNonNull(urlMask);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public NetworkEndpointGroupAppEngineResponse build() {
            return new NetworkEndpointGroupAppEngineResponse(service, urlMask, version);
        }
    }
}
