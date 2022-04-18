// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicedirectory_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * An individual endpoint that provides a service. The service must already exist to create an endpoint.
 * 
 */
public final class EndpointResponse extends com.pulumi.resources.InvokeArgs {

    public static final EndpointResponse Empty = new EndpointResponse();

    /**
     * Optional. An IPv4 or IPv6 address. Service Directory rejects bad addresses like: * `8.8.8` * `8.8.8.8:53` * `test:bad:address` * `[::1]` * `[::1]:8080` Limited to 45 characters.
     * 
     */
    @Import(name="address", required=true)
      private final String address;

    public String address() {
        return this.address;
    }

    /**
     * Optional. Annotations for the endpoint. This data can be consumed by service clients. Restrictions: * The entire annotations dictionary may contain up to 512 characters, spread accoss all key-value pairs. Annotations that go beyond this limit are rejected * Valid annotation keys have two segments: an optional prefix and name, separated by a slash (/). The name segment is required and must be 63 characters or less, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between. The prefix is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated by dots (.), not longer than 253 characters in total, followed by a slash (/) Annotations that fails to meet these requirements are rejected. Note: This field is equivalent to the `metadata` field in the v1beta1 API. They have the same syntax and read/write to the same location in Service Directory.
     * 
     */
    @Import(name="annotations", required=true)
      private final Map<String,String> annotations;

    public Map<String,String> annotations() {
        return this.annotations;
    }

    /**
     * Immutable. The resource name for the endpoint in the format `projects/*{@literal /}locations/*{@literal /}namespaces/*{@literal /}services/*{@literal /}endpoints/*`.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Immutable. The Google Compute Engine network (VPC) of the endpoint in the format `projects//locations/global/networks/*`. The project must be specified by project number (project id is rejected). Incorrectly formatted networks are rejected, we also check to make sure that you have the servicedirectory.networks.attach permission on the project specified.
     * 
     */
    @Import(name="network", required=true)
      private final String network;

    public String network() {
        return this.network;
    }

    /**
     * Optional. Service Directory rejects values outside of `[0, 65535]`.
     * 
     */
    @Import(name="port", required=true)
      private final Integer port;

    public Integer port() {
        return this.port;
    }

    public EndpointResponse(
        String address,
        Map<String,String> annotations,
        String name,
        String network,
        Integer port) {
        this.address = Objects.requireNonNull(address, "expected parameter 'address' to be non-null");
        this.annotations = Objects.requireNonNull(annotations, "expected parameter 'annotations' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private EndpointResponse() {
        this.address = null;
        this.annotations = Map.of();
        this.name = null;
        this.network = null;
        this.port = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String address;
        private Map<String,String> annotations;
        private String name;
        private String network;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.annotations = defaults.annotations;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.port = defaults.port;
        }

        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }
        public Builder annotations(Map<String,String> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }        public EndpointResponse build() {
            return new EndpointResponse(address, annotations, name, network, port);
        }
    }
}
