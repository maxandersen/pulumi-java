// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration for a Cloud Run network endpoint group (NEG). The service must be provided explicitly or in the URL mask. The tag is optional, may be provided explicitly or in the URL mask. Note: Cloud Run service must be in the same project and located in the same region as the Serverless NEG.
 * 
 */
public final class NetworkEndpointGroupCloudRunResponse extends com.pulumi.resources.InvokeArgs {

    public static final NetworkEndpointGroupCloudRunResponse Empty = new NetworkEndpointGroupCloudRunResponse();

    /**
     * Cloud Run service is the main resource of Cloud Run. The service must be 1-63 characters long, and comply with RFC1035. Example value: &#34;run-service&#34;.
     * 
     */
    @Import(name="service", required=true)
      private final String service;

    public String service() {
        return this.service;
    }

    /**
     * Optional Cloud Run tag represents the &#34;named-revision&#34; to provide additional fine-grained traffic routing information. The tag must be 1-63 characters long, and comply with RFC1035. Example value: &#34;revision-0010&#34;.
     * 
     */
    @Import(name="tag", required=true)
      private final String tag;

    public String tag() {
        return this.tag;
    }

    /**
     * A template to parse service and tag fields from a request URL. URL mask allows for routing to multiple Run services without having to create multiple network endpoint groups and backend services. For example, request URLs &#34;foo1.domain.com/bar1&#34; and &#34;foo1.domain.com/bar2&#34; can be backed by the same Serverless Network Endpoint Group (NEG) with URL mask &#34;.domain.com/&#34;. The URL mask will parse them to { service=&#34;bar1&#34;, tag=&#34;foo1&#34; } and { service=&#34;bar2&#34;, tag=&#34;foo2&#34; } respectively.
     * 
     */
    @Import(name="urlMask", required=true)
      private final String urlMask;

    public String urlMask() {
        return this.urlMask;
    }

    public NetworkEndpointGroupCloudRunResponse(
        String service,
        String tag,
        String urlMask) {
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
        this.tag = Objects.requireNonNull(tag, "expected parameter 'tag' to be non-null");
        this.urlMask = Objects.requireNonNull(urlMask, "expected parameter 'urlMask' to be non-null");
    }

    private NetworkEndpointGroupCloudRunResponse() {
        this.service = null;
        this.tag = null;
        this.urlMask = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkEndpointGroupCloudRunResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String service;
        private String tag;
        private String urlMask;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkEndpointGroupCloudRunResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.service = defaults.service;
    	      this.tag = defaults.tag;
    	      this.urlMask = defaults.urlMask;
        }

        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public Builder tag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }
        public Builder urlMask(String urlMask) {
            this.urlMask = Objects.requireNonNull(urlMask);
            return this;
        }        public NetworkEndpointGroupCloudRunResponse build() {
            return new NetworkEndpointGroupCloudRunResponse(service, tag, urlMask);
        }
    }
}
