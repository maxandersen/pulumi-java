// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.applicationloadbalancing.inputs;

import com.pulumi.aws.applicationloadbalancing.inputs.ListenerDefaultActionGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerState extends com.pulumi.resources.ResourceArgs {

    public static final ListenerState Empty = new ListenerState();

    /**
     * Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
     * 
     */
    @Import(name="alpnPolicy")
    private @Nullable Output<String> alpnPolicy;

    public Optional<Output<String>> alpnPolicy() {
        return Optional.ofNullable(this.alpnPolicy);
    }

    /**
     * ARN of the target group.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
     * 
     */
    @Import(name="certificateArn")
    private @Nullable Output<String> certificateArn;

    public Optional<Output<String>> certificateArn() {
        return Optional.ofNullable(this.certificateArn);
    }

    /**
     * Configuration block for default actions. Detailed below.
     * 
     */
    @Import(name="defaultActions")
    private @Nullable Output<List<ListenerDefaultActionGetArgs>> defaultActions;

    public Optional<Output<List<ListenerDefaultActionGetArgs>>> defaultActions() {
        return Optional.ofNullable(this.defaultActions);
    }

    /**
     * ARN of the load balancer.
     * 
     */
    @Import(name="loadBalancerArn")
    private @Nullable Output<String> loadBalancerArn;

    public Optional<Output<String>> loadBalancerArn() {
        return Optional.ofNullable(this.loadBalancerArn);
    }

    /**
     * Port. Specify a value from `1` to `65535` or `#{port}`. Defaults to `#{port}`.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Protocol. Valid values are `HTTP`, `HTTPS`, or `#{protocol}`. Defaults to `#{protocol}`.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
     * 
     */
    @Import(name="sslPolicy")
    private @Nullable Output<String> sslPolicy;

    public Optional<Output<String>> sslPolicy() {
        return Optional.ofNullable(this.sslPolicy);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private ListenerState() {}

    private ListenerState(ListenerState $) {
        this.alpnPolicy = $.alpnPolicy;
        this.arn = $.arn;
        this.certificateArn = $.certificateArn;
        this.defaultActions = $.defaultActions;
        this.loadBalancerArn = $.loadBalancerArn;
        this.port = $.port;
        this.protocol = $.protocol;
        this.sslPolicy = $.sslPolicy;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerState $;

        public Builder() {
            $ = new ListenerState();
        }

        public Builder(ListenerState defaults) {
            $ = new ListenerState(Objects.requireNonNull(defaults));
        }

        public Builder alpnPolicy(@Nullable Output<String> alpnPolicy) {
            $.alpnPolicy = alpnPolicy;
            return this;
        }

        public Builder alpnPolicy(String alpnPolicy) {
            return alpnPolicy(Output.of(alpnPolicy));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder certificateArn(@Nullable Output<String> certificateArn) {
            $.certificateArn = certificateArn;
            return this;
        }

        public Builder certificateArn(String certificateArn) {
            return certificateArn(Output.of(certificateArn));
        }

        public Builder defaultActions(@Nullable Output<List<ListenerDefaultActionGetArgs>> defaultActions) {
            $.defaultActions = defaultActions;
            return this;
        }

        public Builder defaultActions(List<ListenerDefaultActionGetArgs> defaultActions) {
            return defaultActions(Output.of(defaultActions));
        }

        public Builder defaultActions(ListenerDefaultActionGetArgs... defaultActions) {
            return defaultActions(List.of(defaultActions));
        }

        public Builder loadBalancerArn(@Nullable Output<String> loadBalancerArn) {
            $.loadBalancerArn = loadBalancerArn;
            return this;
        }

        public Builder loadBalancerArn(String loadBalancerArn) {
            return loadBalancerArn(Output.of(loadBalancerArn));
        }

        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public Builder sslPolicy(@Nullable Output<String> sslPolicy) {
            $.sslPolicy = sslPolicy;
            return this;
        }

        public Builder sslPolicy(String sslPolicy) {
            return sslPolicy(Output.of(sslPolicy));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public ListenerState build() {
            return $;
        }
    }

}
