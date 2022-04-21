// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicIAMPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final TopicIAMPolicyArgs Empty = new TopicIAMPolicyArgs();

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData", required=true)
    private Output<String> policyData;

    public Output<String> policyData() {
        return this.policyData;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="topic", required=true)
    private Output<String> topic;

    public Output<String> topic() {
        return this.topic;
    }

    private TopicIAMPolicyArgs() {}

    private TopicIAMPolicyArgs(TopicIAMPolicyArgs $) {
        this.policyData = $.policyData;
        this.project = $.project;
        this.topic = $.topic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicIAMPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicIAMPolicyArgs $;

        public Builder() {
            $ = new TopicIAMPolicyArgs();
        }

        public Builder(TopicIAMPolicyArgs defaults) {
            $ = new TopicIAMPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder policyData(Output<String> policyData) {
            $.policyData = policyData;
            return this;
        }

        public Builder policyData(String policyData) {
            return policyData(Output.of(policyData));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder topic(Output<String> topic) {
            $.topic = topic;
            return this;
        }

        public Builder topic(String topic) {
            return topic(Output.of(topic));
        }

        public TopicIAMPolicyArgs build() {
            $.policyData = Objects.requireNonNull($.policyData, "expected parameter 'policyData' to be non-null");
            $.topic = Objects.requireNonNull($.topic, "expected parameter 'topic' to be non-null");
            return $;
        }
    }

}
