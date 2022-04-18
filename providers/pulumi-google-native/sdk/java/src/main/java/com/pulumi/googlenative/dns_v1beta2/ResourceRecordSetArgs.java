// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1beta2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.dns_v1beta2.inputs.RRSetRoutingPolicyArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceRecordSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceRecordSetArgs Empty = new ResourceRecordSetArgs();

    @Import(name="clientOperationId")
      private final @Nullable Output<String> clientOperationId;

    public Output<String> clientOperationId() {
        return this.clientOperationId == null ? Codegen.empty() : this.clientOperationId;
    }

    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    @Import(name="managedZone", required=true)
      private final Output<String> managedZone;

    public Output<String> managedZone() {
        return this.managedZone;
    }

    /**
     * For example, www.example.com.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Configures dynamic query responses based on geo location of querying user or a weighted round robin based routing policy. A ResourceRecordSet should only have either rrdata (static) or routing_policy (dynamic). An error is returned otherwise.
     * 
     */
    @Import(name="routingPolicy")
      private final @Nullable Output<RRSetRoutingPolicyArgs> routingPolicy;

    public Output<RRSetRoutingPolicyArgs> routingPolicy() {
        return this.routingPolicy == null ? Codegen.empty() : this.routingPolicy;
    }

    /**
     * As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples.
     * 
     */
    @Import(name="rrdatas")
      private final @Nullable Output<List<String>> rrdatas;

    public Output<List<String>> rrdatas() {
        return this.rrdatas == null ? Codegen.empty() : this.rrdatas;
    }

    /**
     * As defined in RFC 4034 (section 3.2).
     * 
     */
    @Import(name="signatureRrdatas")
      private final @Nullable Output<List<String>> signatureRrdatas;

    public Output<List<String>> signatureRrdatas() {
        return this.signatureRrdatas == null ? Codegen.empty() : this.signatureRrdatas;
    }

    /**
     * Number of seconds that this ResourceRecordSet can be cached by resolvers.
     * 
     */
    @Import(name="ttl")
      private final @Nullable Output<Integer> ttl;

    public Output<Integer> ttl() {
        return this.ttl == null ? Codegen.empty() : this.ttl;
    }

    /**
     * The identifier of a supported record type. See the list of Supported DNS record types.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public ResourceRecordSetArgs(
        @Nullable Output<String> clientOperationId,
        @Nullable Output<String> kind,
        Output<String> managedZone,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<RRSetRoutingPolicyArgs> routingPolicy,
        @Nullable Output<List<String>> rrdatas,
        @Nullable Output<List<String>> signatureRrdatas,
        @Nullable Output<Integer> ttl,
        @Nullable Output<String> type) {
        this.clientOperationId = clientOperationId;
        this.kind = kind;
        this.managedZone = Objects.requireNonNull(managedZone, "expected parameter 'managedZone' to be non-null");
        this.name = name;
        this.project = project;
        this.routingPolicy = routingPolicy;
        this.rrdatas = rrdatas;
        this.signatureRrdatas = signatureRrdatas;
        this.ttl = ttl;
        this.type = type;
    }

    private ResourceRecordSetArgs() {
        this.clientOperationId = Codegen.empty();
        this.kind = Codegen.empty();
        this.managedZone = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.routingPolicy = Codegen.empty();
        this.rrdatas = Codegen.empty();
        this.signatureRrdatas = Codegen.empty();
        this.ttl = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceRecordSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clientOperationId;
        private @Nullable Output<String> kind;
        private Output<String> managedZone;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<RRSetRoutingPolicyArgs> routingPolicy;
        private @Nullable Output<List<String>> rrdatas;
        private @Nullable Output<List<String>> signatureRrdatas;
        private @Nullable Output<Integer> ttl;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceRecordSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientOperationId = defaults.clientOperationId;
    	      this.kind = defaults.kind;
    	      this.managedZone = defaults.managedZone;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.routingPolicy = defaults.routingPolicy;
    	      this.rrdatas = defaults.rrdatas;
    	      this.signatureRrdatas = defaults.signatureRrdatas;
    	      this.ttl = defaults.ttl;
    	      this.type = defaults.type;
        }

        public Builder clientOperationId(@Nullable Output<String> clientOperationId) {
            this.clientOperationId = clientOperationId;
            return this;
        }
        public Builder clientOperationId(@Nullable String clientOperationId) {
            this.clientOperationId = Codegen.ofNullable(clientOperationId);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder managedZone(Output<String> managedZone) {
            this.managedZone = Objects.requireNonNull(managedZone);
            return this;
        }
        public Builder managedZone(String managedZone) {
            this.managedZone = Output.of(Objects.requireNonNull(managedZone));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder routingPolicy(@Nullable Output<RRSetRoutingPolicyArgs> routingPolicy) {
            this.routingPolicy = routingPolicy;
            return this;
        }
        public Builder routingPolicy(@Nullable RRSetRoutingPolicyArgs routingPolicy) {
            this.routingPolicy = Codegen.ofNullable(routingPolicy);
            return this;
        }
        public Builder rrdatas(@Nullable Output<List<String>> rrdatas) {
            this.rrdatas = rrdatas;
            return this;
        }
        public Builder rrdatas(@Nullable List<String> rrdatas) {
            this.rrdatas = Codegen.ofNullable(rrdatas);
            return this;
        }
        public Builder rrdatas(String... rrdatas) {
            return rrdatas(List.of(rrdatas));
        }
        public Builder signatureRrdatas(@Nullable Output<List<String>> signatureRrdatas) {
            this.signatureRrdatas = signatureRrdatas;
            return this;
        }
        public Builder signatureRrdatas(@Nullable List<String> signatureRrdatas) {
            this.signatureRrdatas = Codegen.ofNullable(signatureRrdatas);
            return this;
        }
        public Builder signatureRrdatas(String... signatureRrdatas) {
            return signatureRrdatas(List.of(signatureRrdatas));
        }
        public Builder ttl(@Nullable Output<Integer> ttl) {
            this.ttl = ttl;
            return this;
        }
        public Builder ttl(@Nullable Integer ttl) {
            this.ttl = Codegen.ofNullable(ttl);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public ResourceRecordSetArgs build() {
            return new ResourceRecordSetArgs(clientOperationId, kind, managedZone, name, project, routingPolicy, rrdatas, signatureRrdatas, ttl, type);
        }
    }
}
