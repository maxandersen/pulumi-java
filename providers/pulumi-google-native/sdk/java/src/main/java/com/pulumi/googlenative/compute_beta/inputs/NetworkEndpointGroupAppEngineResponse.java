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
     * Optional serving service. The service name is case-sensitive and must be 1-63 characters long. Example value: &#34;default&#34;, &#34;my-service&#34;.
     * 
     */
    @Import(name="service", required=true)
    private String service;

    public String service() {
        return this.service;
    }

    /**
     * A template to parse service and version fields from a request URL. URL mask allows for routing to multiple App Engine services without having to create multiple Network Endpoint Groups and backend services. For example, the request URLs &#34;foo1-dot-appname.appspot.com/v1&#34; and &#34;foo1-dot-appname.appspot.com/v2&#34; can be backed by the same Serverless NEG with URL mask &#34;-dot-appname.appspot.com/&#34;. The URL mask will parse them to { service = &#34;foo1&#34;, version = &#34;v1&#34; } and { service = &#34;foo1&#34;, version = &#34;v2&#34; } respectively.
     * 
     */
    @Import(name="urlMask", required=true)
    private String urlMask;

    public String urlMask() {
        return this.urlMask;
    }

    /**
     * Optional serving version. The version name is case-sensitive and must be 1-100 characters long. Example value: &#34;v1&#34;, &#34;v2&#34;.
     * 
     */
    @Import(name="version", required=true)
    private String version;

    public String version() {
        return this.version;
    }

    private NetworkEndpointGroupAppEngineResponse() {}

    private NetworkEndpointGroupAppEngineResponse(NetworkEndpointGroupAppEngineResponse $) {
        this.service = $.service;
        this.urlMask = $.urlMask;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkEndpointGroupAppEngineResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkEndpointGroupAppEngineResponse $;

        public Builder() {
            $ = new NetworkEndpointGroupAppEngineResponse();
        }

        public Builder(NetworkEndpointGroupAppEngineResponse defaults) {
            $ = new NetworkEndpointGroupAppEngineResponse(Objects.requireNonNull(defaults));
        }

        public Builder service(String service) {
            $.service = service;
            return this;
        }

        public Builder urlMask(String urlMask) {
            $.urlMask = urlMask;
            return this;
        }

        public Builder version(String version) {
            $.version = version;
            return this;
        }

        public NetworkEndpointGroupAppEngineResponse build() {
            $.service = Objects.requireNonNull($.service, "expected parameter 'service' to be non-null");
            $.urlMask = Objects.requireNonNull($.urlMask, "expected parameter 'urlMask' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
