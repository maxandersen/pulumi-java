// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TopicRuleSigV4AuthorizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final TopicRuleSigV4AuthorizationArgs Empty = new TopicRuleSigV4AuthorizationArgs();

    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    @Import(name="signingRegion", required=true)
    private Output<String> signingRegion;

    public Output<String> signingRegion() {
        return this.signingRegion;
    }

    private TopicRuleSigV4AuthorizationArgs() {}

    private TopicRuleSigV4AuthorizationArgs(TopicRuleSigV4AuthorizationArgs $) {
        this.roleArn = $.roleArn;
        this.serviceName = $.serviceName;
        this.signingRegion = $.signingRegion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicRuleSigV4AuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicRuleSigV4AuthorizationArgs $;

        public Builder() {
            $ = new TopicRuleSigV4AuthorizationArgs();
        }

        public Builder(TopicRuleSigV4AuthorizationArgs defaults) {
            $ = new TopicRuleSigV4AuthorizationArgs(Objects.requireNonNull(defaults));
        }

        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public Builder signingRegion(Output<String> signingRegion) {
            $.signingRegion = signingRegion;
            return this;
        }

        public Builder signingRegion(String signingRegion) {
            return signingRegion(Output.of(signingRegion));
        }

        public TopicRuleSigV4AuthorizationArgs build() {
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            $.signingRegion = Objects.requireNonNull($.signingRegion, "expected parameter 'signingRegion' to be non-null");
            return $;
        }
    }

}
