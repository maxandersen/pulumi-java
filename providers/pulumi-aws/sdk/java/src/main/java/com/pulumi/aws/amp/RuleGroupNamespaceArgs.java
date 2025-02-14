// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.amp;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupNamespaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupNamespaceArgs Empty = new RuleGroupNamespaceArgs();

    /**
     * the rule group namespace data that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-Ruler.html).
     * 
     */
    @Import(name="data", required=true)
    private Output<String> data;

    /**
     * @return the rule group namespace data that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-Ruler.html).
     * 
     */
    public Output<String> data() {
        return this.data;
    }

    /**
     * The name of the rule group namespace
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the rule group namespace
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The id of the prometheus workspace the rule group namespace should be linked to
     * 
     */
    @Import(name="workspaceId", required=true)
    private Output<String> workspaceId;

    /**
     * @return The id of the prometheus workspace the rule group namespace should be linked to
     * 
     */
    public Output<String> workspaceId() {
        return this.workspaceId;
    }

    private RuleGroupNamespaceArgs() {}

    private RuleGroupNamespaceArgs(RuleGroupNamespaceArgs $) {
        this.data = $.data;
        this.name = $.name;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupNamespaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupNamespaceArgs $;

        public Builder() {
            $ = new RuleGroupNamespaceArgs();
        }

        public Builder(RuleGroupNamespaceArgs defaults) {
            $ = new RuleGroupNamespaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param data the rule group namespace data that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-Ruler.html).
         * 
         * @return builder
         * 
         */
        public Builder data(Output<String> data) {
            $.data = data;
            return this;
        }

        /**
         * @param data the rule group namespace data that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-Ruler.html).
         * 
         * @return builder
         * 
         */
        public Builder data(String data) {
            return data(Output.of(data));
        }

        /**
         * @param name The name of the rule group namespace
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the rule group namespace
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param workspaceId The id of the prometheus workspace the rule group namespace should be linked to
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(Output<String> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId The id of the prometheus workspace the rule group namespace should be linked to
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(String workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        public RuleGroupNamespaceArgs build() {
            $.data = Objects.requireNonNull($.data, "expected parameter 'data' to be non-null");
            $.workspaceId = Objects.requireNonNull($.workspaceId, "expected parameter 'workspaceId' to be non-null");
            return $;
        }
    }

}
