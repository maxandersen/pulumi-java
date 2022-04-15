// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTargetInstanceResult {
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * A URL to the virtual machine instance that handles traffic for this target instance. When creating a target instance, you can provide the fully-qualified URL or a valid partial URL to the desired virtual machine. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance - zones/zone/instances/instance
     * 
     */
    private final String instance;
    /**
     * The type of the resource. Always compute#targetInstance for target instances.
     * 
     */
    private final String kind;
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * NAT option controlling how IPs are NAT'ed to the instance. Currently only NO_NAT (default value) is supported.
     * 
     */
    private final String natPolicy;
    /**
     * The URL of the network this target instance uses to forward traffic. If not specified, the traffic will be forwarded to the network that the default network interface belongs to.
     * 
     */
    private final String network;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * URL of the zone where the target instance resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    private final String zone;

    @CustomType.Constructor
    private GetTargetInstanceResult(
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("instance") String instance,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("natPolicy") String natPolicy,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("zone") String zone) {
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.instance = instance;
        this.kind = kind;
        this.name = name;
        this.natPolicy = natPolicy;
        this.network = network;
        this.selfLink = selfLink;
        this.zone = zone;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * A URL to the virtual machine instance that handles traffic for this target instance. When creating a target instance, you can provide the fully-qualified URL or a valid partial URL to the desired virtual machine. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance - zones/zone/instances/instance
     * 
    */
    public String instance() {
        return this.instance;
    }
    /**
     * The type of the resource. Always compute#targetInstance for target instances.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * NAT option controlling how IPs are NAT'ed to the instance. Currently only NO_NAT (default value) is supported.
     * 
    */
    public String natPolicy() {
        return this.natPolicy;
    }
    /**
     * The URL of the network this target instance uses to forward traffic. If not specified, the traffic will be forwarded to the network that the default network interface belongs to.
     * 
    */
    public String network() {
        return this.network;
    }
    /**
     * Server-defined URL for the resource.
     * 
    */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * URL of the zone where the target instance resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
    */
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTargetInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTimestamp;
        private String description;
        private String instance;
        private String kind;
        private String name;
        private String natPolicy;
        private String network;
        private String selfLink;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTargetInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.instance = defaults.instance;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.natPolicy = defaults.natPolicy;
    	      this.network = defaults.network;
    	      this.selfLink = defaults.selfLink;
    	      this.zone = defaults.zone;
        }

        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder instance(String instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder natPolicy(String natPolicy) {
            this.natPolicy = Objects.requireNonNull(natPolicy);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public GetTargetInstanceResult build() {
            return new GetTargetInstanceResult(creationTimestamp, description, instance, kind, name, natPolicy, network, selfLink, zone);
        }
    }
}
