// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lb.inputs;

import com.pulumi.aws.lb.inputs.ListenerDefaultActionGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerState extends com.pulumi.resources.ResourceArgs {

    public static final ListenerState Empty = new ListenerState();

    /**
     * Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
     * 
     */
    @Import(name="alpnPolicy")
      private final @Nullable Output<String> alpnPolicy;

    public Output<String> alpnPolicy() {
        return this.alpnPolicy == null ? Codegen.empty() : this.alpnPolicy;
    }

    /**
     * ARN of the target group.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
     * 
     */
    @Import(name="certificateArn")
      private final @Nullable Output<String> certificateArn;

    public Output<String> certificateArn() {
        return this.certificateArn == null ? Codegen.empty() : this.certificateArn;
    }

    /**
     * Configuration block for default actions. Detailed below.
     * 
     */
    @Import(name="defaultActions")
      private final @Nullable Output<List<ListenerDefaultActionGetArgs>> defaultActions;

    public Output<List<ListenerDefaultActionGetArgs>> defaultActions() {
        return this.defaultActions == null ? Codegen.empty() : this.defaultActions;
    }

    /**
     * ARN of the load balancer.
     * 
     */
    @Import(name="loadBalancerArn")
      private final @Nullable Output<String> loadBalancerArn;

    public Output<String> loadBalancerArn() {
        return this.loadBalancerArn == null ? Codegen.empty() : this.loadBalancerArn;
    }

    /**
     * Port. Specify a value from `1` to `65535` or `#{port}`. Defaults to `#{port}`.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> port() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    /**
     * Protocol. Valid values are `HTTP`, `HTTPS`, or `#{protocol}`. Defaults to `#{protocol}`.
     * 
     */
    @Import(name="protocol")
      private final @Nullable Output<String> protocol;

    public Output<String> protocol() {
        return this.protocol == null ? Codegen.empty() : this.protocol;
    }

    /**
     * Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
     * 
     */
    @Import(name="sslPolicy")
      private final @Nullable Output<String> sslPolicy;

    public Output<String> sslPolicy() {
        return this.sslPolicy == null ? Codegen.empty() : this.sslPolicy;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public ListenerState(
        @Nullable Output<String> alpnPolicy,
        @Nullable Output<String> arn,
        @Nullable Output<String> certificateArn,
        @Nullable Output<List<ListenerDefaultActionGetArgs>> defaultActions,
        @Nullable Output<String> loadBalancerArn,
        @Nullable Output<Integer> port,
        @Nullable Output<String> protocol,
        @Nullable Output<String> sslPolicy,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.alpnPolicy = alpnPolicy;
        this.arn = arn;
        this.certificateArn = certificateArn;
        this.defaultActions = defaultActions;
        this.loadBalancerArn = loadBalancerArn;
        this.port = port;
        this.protocol = protocol;
        this.sslPolicy = sslPolicy;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ListenerState() {
        this.alpnPolicy = Codegen.empty();
        this.arn = Codegen.empty();
        this.certificateArn = Codegen.empty();
        this.defaultActions = Codegen.empty();
        this.loadBalancerArn = Codegen.empty();
        this.port = Codegen.empty();
        this.protocol = Codegen.empty();
        this.sslPolicy = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> alpnPolicy;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> certificateArn;
        private @Nullable Output<List<ListenerDefaultActionGetArgs>> defaultActions;
        private @Nullable Output<String> loadBalancerArn;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> protocol;
        private @Nullable Output<String> sslPolicy;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alpnPolicy = defaults.alpnPolicy;
    	      this.arn = defaults.arn;
    	      this.certificateArn = defaults.certificateArn;
    	      this.defaultActions = defaults.defaultActions;
    	      this.loadBalancerArn = defaults.loadBalancerArn;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.sslPolicy = defaults.sslPolicy;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder alpnPolicy(@Nullable Output<String> alpnPolicy) {
            this.alpnPolicy = alpnPolicy;
            return this;
        }
        public Builder alpnPolicy(@Nullable String alpnPolicy) {
            this.alpnPolicy = Codegen.ofNullable(alpnPolicy);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder certificateArn(@Nullable Output<String> certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }
        public Builder certificateArn(@Nullable String certificateArn) {
            this.certificateArn = Codegen.ofNullable(certificateArn);
            return this;
        }
        public Builder defaultActions(@Nullable Output<List<ListenerDefaultActionGetArgs>> defaultActions) {
            this.defaultActions = defaultActions;
            return this;
        }
        public Builder defaultActions(@Nullable List<ListenerDefaultActionGetArgs> defaultActions) {
            this.defaultActions = Codegen.ofNullable(defaultActions);
            return this;
        }
        public Builder defaultActions(ListenerDefaultActionGetArgs... defaultActions) {
            return defaultActions(List.of(defaultActions));
        }
        public Builder loadBalancerArn(@Nullable Output<String> loadBalancerArn) {
            this.loadBalancerArn = loadBalancerArn;
            return this;
        }
        public Builder loadBalancerArn(@Nullable String loadBalancerArn) {
            this.loadBalancerArn = Codegen.ofNullable(loadBalancerArn);
            return this;
        }
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Codegen.ofNullable(port);
            return this;
        }
        public Builder protocol(@Nullable Output<String> protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = Codegen.ofNullable(protocol);
            return this;
        }
        public Builder sslPolicy(@Nullable Output<String> sslPolicy) {
            this.sslPolicy = sslPolicy;
            return this;
        }
        public Builder sslPolicy(@Nullable String sslPolicy) {
            this.sslPolicy = Codegen.ofNullable(sslPolicy);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public ListenerState build() {
            return new ListenerState(alpnPolicy, arn, certificateArn, defaultActions, loadBalancerArn, port, protocol, sslPolicy, tags, tagsAll);
        }
    }
}
