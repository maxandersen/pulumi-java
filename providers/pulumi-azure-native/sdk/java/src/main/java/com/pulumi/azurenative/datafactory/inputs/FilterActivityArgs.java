// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import com.pulumi.azurenative.datafactory.inputs.ExpressionArgs;
import com.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Filter and return results from input array based on the conditions.
 * 
 */
public final class FilterActivityArgs extends ResourceArgs {

    public static final FilterActivityArgs Empty = new FilterActivityArgs();

    /**
     * Condition to be used for filtering the input.
     * 
     */
    @Import(name="condition", required=true)
    private Output<ExpressionArgs> condition;

    /**
     * @return Condition to be used for filtering the input.
     * 
     */
    public Output<ExpressionArgs> condition() {
        return this.condition;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
    private @Nullable Output<List<ActivityDependencyArgs>> dependsOn;

    /**
     * @return Activity depends on condition.
     * 
     */
    public Optional<Output<List<ActivityDependencyArgs>>> dependsOn() {
        return Optional.ofNullable(this.dependsOn);
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Activity description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Input array on which filter should be applied.
     * 
     */
    @Import(name="items", required=true)
    private Output<ExpressionArgs> items;

    /**
     * @return Input array on which filter should be applied.
     * 
     */
    public Output<ExpressionArgs> items() {
        return this.items;
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Activity name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Type of activity.
     * Expected value is &#39;Filter&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of activity.
     * Expected value is &#39;Filter&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
    private @Nullable Output<List<UserPropertyArgs>> userProperties;

    /**
     * @return Activity user properties.
     * 
     */
    public Optional<Output<List<UserPropertyArgs>>> userProperties() {
        return Optional.ofNullable(this.userProperties);
    }

    private FilterActivityArgs() {}

    private FilterActivityArgs(FilterActivityArgs $) {
        this.condition = $.condition;
        this.dependsOn = $.dependsOn;
        this.description = $.description;
        this.items = $.items;
        this.name = $.name;
        this.type = $.type;
        this.userProperties = $.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FilterActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FilterActivityArgs $;

        public Builder() {
            $ = new FilterActivityArgs();
        }

        public Builder(FilterActivityArgs defaults) {
            $ = new FilterActivityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param condition Condition to be used for filtering the input.
         * 
         * @return builder
         * 
         */
        public Builder condition(Output<ExpressionArgs> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition Condition to be used for filtering the input.
         * 
         * @return builder
         * 
         */
        public Builder condition(ExpressionArgs condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param dependsOn Activity depends on condition.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(@Nullable Output<List<ActivityDependencyArgs>> dependsOn) {
            $.dependsOn = dependsOn;
            return this;
        }

        /**
         * @param dependsOn Activity depends on condition.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(List<ActivityDependencyArgs> dependsOn) {
            return dependsOn(Output.of(dependsOn));
        }

        /**
         * @param dependsOn Activity depends on condition.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(ActivityDependencyArgs... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }

        /**
         * @param description Activity description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Activity description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param items Input array on which filter should be applied.
         * 
         * @return builder
         * 
         */
        public Builder items(Output<ExpressionArgs> items) {
            $.items = items;
            return this;
        }

        /**
         * @param items Input array on which filter should be applied.
         * 
         * @return builder
         * 
         */
        public Builder items(ExpressionArgs items) {
            return items(Output.of(items));
        }

        /**
         * @param name Activity name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Activity name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type Type of activity.
         * Expected value is &#39;Filter&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of activity.
         * Expected value is &#39;Filter&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param userProperties Activity user properties.
         * 
         * @return builder
         * 
         */
        public Builder userProperties(@Nullable Output<List<UserPropertyArgs>> userProperties) {
            $.userProperties = userProperties;
            return this;
        }

        /**
         * @param userProperties Activity user properties.
         * 
         * @return builder
         * 
         */
        public Builder userProperties(List<UserPropertyArgs> userProperties) {
            return userProperties(Output.of(userProperties));
        }

        /**
         * @param userProperties Activity user properties.
         * 
         * @return builder
         * 
         */
        public Builder userProperties(UserPropertyArgs... userProperties) {
            return userProperties(List.of(userProperties));
        }

        public FilterActivityArgs build() {
            $.condition = Objects.requireNonNull($.condition, "expected parameter 'condition' to be non-null");
            $.items = Objects.requireNonNull($.items, "expected parameter 'items' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
