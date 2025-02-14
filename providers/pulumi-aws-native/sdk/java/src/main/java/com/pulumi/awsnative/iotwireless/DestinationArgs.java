// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotwireless;

import com.pulumi.awsnative.iotwireless.enums.DestinationExpressionType;
import com.pulumi.awsnative.iotwireless.inputs.DestinationTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DestinationArgs Empty = new DestinationArgs();

    /**
     * Destination description
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Destination description
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Destination expression
     * 
     */
    @Import(name="expression", required=true)
    private Output<String> expression;

    /**
     * @return Destination expression
     * 
     */
    public Output<String> expression() {
        return this.expression;
    }

    /**
     * Must be RuleName
     * 
     */
    @Import(name="expressionType", required=true)
    private Output<DestinationExpressionType> expressionType;

    /**
     * @return Must be RuleName
     * 
     */
    public Output<DestinationExpressionType> expressionType() {
        return this.expressionType;
    }

    /**
     * Unique name of destination
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Unique name of destination
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * AWS role ARN that grants access
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    /**
     * @return AWS role ARN that grants access
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * A list of key-value pairs that contain metadata for the destination.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<DestinationTagArgs>> tags;

    /**
     * @return A list of key-value pairs that contain metadata for the destination.
     * 
     */
    public Optional<Output<List<DestinationTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DestinationArgs() {}

    private DestinationArgs(DestinationArgs $) {
        this.description = $.description;
        this.expression = $.expression;
        this.expressionType = $.expressionType;
        this.name = $.name;
        this.roleArn = $.roleArn;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DestinationArgs $;

        public Builder() {
            $ = new DestinationArgs();
        }

        public Builder(DestinationArgs defaults) {
            $ = new DestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Destination description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Destination description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param expression Destination expression
         * 
         * @return builder
         * 
         */
        public Builder expression(Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression Destination expression
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        /**
         * @param expressionType Must be RuleName
         * 
         * @return builder
         * 
         */
        public Builder expressionType(Output<DestinationExpressionType> expressionType) {
            $.expressionType = expressionType;
            return this;
        }

        /**
         * @param expressionType Must be RuleName
         * 
         * @return builder
         * 
         */
        public Builder expressionType(DestinationExpressionType expressionType) {
            return expressionType(Output.of(expressionType));
        }

        /**
         * @param name Unique name of destination
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique name of destination
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param roleArn AWS role ARN that grants access
         * 
         * @return builder
         * 
         */
        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn AWS role ARN that grants access
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param tags A list of key-value pairs that contain metadata for the destination.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<DestinationTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of key-value pairs that contain metadata for the destination.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<DestinationTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of key-value pairs that contain metadata for the destination.
         * 
         * @return builder
         * 
         */
        public Builder tags(DestinationTagArgs... tags) {
            return tags(List.of(tags));
        }

        public DestinationArgs build() {
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            $.expressionType = Objects.requireNonNull($.expressionType, "expected parameter 'expressionType' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}
