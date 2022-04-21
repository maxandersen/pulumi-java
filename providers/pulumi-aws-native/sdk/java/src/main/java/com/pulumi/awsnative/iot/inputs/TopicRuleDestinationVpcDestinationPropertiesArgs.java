// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicRuleDestinationVpcDestinationPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final TopicRuleDestinationVpcDestinationPropertiesArgs Empty = new TopicRuleDestinationVpcDestinationPropertiesArgs();

    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    @Import(name="securityGroups")
    private @Nullable Output<List<String>> securityGroups;

    public Optional<Output<List<String>>> securityGroups() {
        return Optional.ofNullable(this.securityGroups);
    }

    @Import(name="subnetIds")
    private @Nullable Output<List<String>> subnetIds;

    public Optional<Output<List<String>>> subnetIds() {
        return Optional.ofNullable(this.subnetIds);
    }

    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private TopicRuleDestinationVpcDestinationPropertiesArgs() {}

    private TopicRuleDestinationVpcDestinationPropertiesArgs(TopicRuleDestinationVpcDestinationPropertiesArgs $) {
        this.roleArn = $.roleArn;
        this.securityGroups = $.securityGroups;
        this.subnetIds = $.subnetIds;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicRuleDestinationVpcDestinationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicRuleDestinationVpcDestinationPropertiesArgs $;

        public Builder() {
            $ = new TopicRuleDestinationVpcDestinationPropertiesArgs();
        }

        public Builder(TopicRuleDestinationVpcDestinationPropertiesArgs defaults) {
            $ = new TopicRuleDestinationVpcDestinationPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            $.securityGroups = securityGroups;
            return this;
        }

        public Builder securityGroups(List<String> securityGroups) {
            return securityGroups(Output.of(securityGroups));
        }

        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }

        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public TopicRuleDestinationVpcDestinationPropertiesArgs build() {
            return $;
        }
    }

}
