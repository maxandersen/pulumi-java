// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.discovery.k8s.io_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.core_v1.inputs.ObjectReferenceArgs;
import com.pulumi.kubernetes.discovery.k8s.io_v1beta1.inputs.EndpointConditionsArgs;
import com.pulumi.kubernetes.discovery.k8s.io_v1beta1.inputs.EndpointHintsArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Endpoint represents a single logical "backend" implementing a service.
 * 
 */
public final class EndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointArgs Empty = new EndpointArgs();

    /**
     * addresses of this endpoint. The contents of this field are interpreted according to the corresponding EndpointSlice addressType field. Consumers must handle different types of addresses in the context of their own capabilities. This must contain at least one address but no more than 100.
     * 
     */
    @Import(name="addresses", required=true)
      private final Output<List<String>> addresses;

    public Output<List<String>> addresses() {
        return this.addresses;
    }

    /**
     * conditions contains information about the current status of the endpoint.
     * 
     */
    @Import(name="conditions")
      private final @Nullable Output<EndpointConditionsArgs> conditions;

    public Output<EndpointConditionsArgs> conditions() {
        return this.conditions == null ? Codegen.empty() : this.conditions;
    }

    /**
     * hints contains information associated with how an endpoint should be consumed.
     * 
     */
    @Import(name="hints")
      private final @Nullable Output<EndpointHintsArgs> hints;

    public Output<EndpointHintsArgs> hints() {
        return this.hints == null ? Codegen.empty() : this.hints;
    }

    /**
     * hostname of this endpoint. This field may be used by consumers of endpoints to distinguish endpoints from each other (e.g. in DNS names). Multiple endpoints which use the same hostname should be considered fungible (e.g. multiple A values in DNS). Must be lowercase and pass DNS Label (RFC 1123) validation.
     * 
     */
    @Import(name="hostname")
      private final @Nullable Output<String> hostname;

    public Output<String> hostname() {
        return this.hostname == null ? Codegen.empty() : this.hostname;
    }

    /**
     * nodeName represents the name of the Node hosting this endpoint. This can be used to determine endpoints local to a Node. This field can be enabled with the EndpointSliceNodeName feature gate.
     * 
     */
    @Import(name="nodeName")
      private final @Nullable Output<String> nodeName;

    public Output<String> nodeName() {
        return this.nodeName == null ? Codegen.empty() : this.nodeName;
    }

    /**
     * targetRef is a reference to a Kubernetes object that represents this endpoint.
     * 
     */
    @Import(name="targetRef")
      private final @Nullable Output<ObjectReferenceArgs> targetRef;

    public Output<ObjectReferenceArgs> targetRef() {
        return this.targetRef == null ? Codegen.empty() : this.targetRef;
    }

    /**
     * topology contains arbitrary topology information associated with the endpoint. These key/value pairs must conform with the label format. https://kubernetes.io/docs/concepts/overview/working-with-objects/labels Topology may include a maximum of 16 key/value pairs. This includes, but is not limited to the following well known keys: * kubernetes.io/hostname: the value indicates the hostname of the node
     *   where the endpoint is located. This should match the corresponding
     *   node label.
     * * topology.kubernetes.io/zone: the value indicates the zone where the
     *   endpoint is located. This should match the corresponding node label.
     * * topology.kubernetes.io/region: the value indicates the region where the
     *   endpoint is located. This should match the corresponding node label.
     *   This field is deprecated and will be removed in future api versions.
     * 
     */
    @Import(name="topology")
      private final @Nullable Output<Map<String,String>> topology;

    public Output<Map<String,String>> topology() {
        return this.topology == null ? Codegen.empty() : this.topology;
    }

    public EndpointArgs(
        Output<List<String>> addresses,
        @Nullable Output<EndpointConditionsArgs> conditions,
        @Nullable Output<EndpointHintsArgs> hints,
        @Nullable Output<String> hostname,
        @Nullable Output<String> nodeName,
        @Nullable Output<ObjectReferenceArgs> targetRef,
        @Nullable Output<Map<String,String>> topology) {
        this.addresses = Objects.requireNonNull(addresses, "expected parameter 'addresses' to be non-null");
        this.conditions = conditions;
        this.hints = hints;
        this.hostname = hostname;
        this.nodeName = nodeName;
        this.targetRef = targetRef;
        this.topology = topology;
    }

    private EndpointArgs() {
        this.addresses = Codegen.empty();
        this.conditions = Codegen.empty();
        this.hints = Codegen.empty();
        this.hostname = Codegen.empty();
        this.nodeName = Codegen.empty();
        this.targetRef = Codegen.empty();
        this.topology = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> addresses;
        private @Nullable Output<EndpointConditionsArgs> conditions;
        private @Nullable Output<EndpointHintsArgs> hints;
        private @Nullable Output<String> hostname;
        private @Nullable Output<String> nodeName;
        private @Nullable Output<ObjectReferenceArgs> targetRef;
        private @Nullable Output<Map<String,String>> topology;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
    	      this.conditions = defaults.conditions;
    	      this.hints = defaults.hints;
    	      this.hostname = defaults.hostname;
    	      this.nodeName = defaults.nodeName;
    	      this.targetRef = defaults.targetRef;
    	      this.topology = defaults.topology;
        }

        public Builder addresses(Output<List<String>> addresses) {
            this.addresses = Objects.requireNonNull(addresses);
            return this;
        }
        public Builder addresses(List<String> addresses) {
            this.addresses = Output.of(Objects.requireNonNull(addresses));
            return this;
        }
        public Builder addresses(String... addresses) {
            return addresses(List.of(addresses));
        }
        public Builder conditions(@Nullable Output<EndpointConditionsArgs> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(@Nullable EndpointConditionsArgs conditions) {
            this.conditions = Codegen.ofNullable(conditions);
            return this;
        }
        public Builder hints(@Nullable Output<EndpointHintsArgs> hints) {
            this.hints = hints;
            return this;
        }
        public Builder hints(@Nullable EndpointHintsArgs hints) {
            this.hints = Codegen.ofNullable(hints);
            return this;
        }
        public Builder hostname(@Nullable Output<String> hostname) {
            this.hostname = hostname;
            return this;
        }
        public Builder hostname(@Nullable String hostname) {
            this.hostname = Codegen.ofNullable(hostname);
            return this;
        }
        public Builder nodeName(@Nullable Output<String> nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public Builder nodeName(@Nullable String nodeName) {
            this.nodeName = Codegen.ofNullable(nodeName);
            return this;
        }
        public Builder targetRef(@Nullable Output<ObjectReferenceArgs> targetRef) {
            this.targetRef = targetRef;
            return this;
        }
        public Builder targetRef(@Nullable ObjectReferenceArgs targetRef) {
            this.targetRef = Codegen.ofNullable(targetRef);
            return this;
        }
        public Builder topology(@Nullable Output<Map<String,String>> topology) {
            this.topology = topology;
            return this;
        }
        public Builder topology(@Nullable Map<String,String> topology) {
            this.topology = Codegen.ofNullable(topology);
            return this;
        }        public EndpointArgs build() {
            return new EndpointArgs(addresses, conditions, hints, hostname, nodeName, targetRef, topology);
        }
    }
}
