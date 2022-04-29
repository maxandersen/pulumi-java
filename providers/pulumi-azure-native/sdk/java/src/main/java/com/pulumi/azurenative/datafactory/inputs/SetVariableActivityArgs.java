// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import com.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Set value for a Variable.
 * 
 */
public final class SetVariableActivityArgs extends ResourceArgs {

    public static final SetVariableActivityArgs Empty = new SetVariableActivityArgs();

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
     * Expected value is &#39;SetVariable&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of activity.
     * Expected value is &#39;SetVariable&#39;.
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

    /**
     * Value to be set. Could be a static value or Expression
     * 
     */
    @Import(name="value")
    private @Nullable Output<Object> value;

    /**
     * @return Value to be set. Could be a static value or Expression
     * 
     */
    public Optional<Output<Object>> value() {
        return Optional.ofNullable(this.value);
    }

    /**
     * Name of the variable whose value needs to be set.
     * 
     */
    @Import(name="variableName")
    private @Nullable Output<String> variableName;

    /**
     * @return Name of the variable whose value needs to be set.
     * 
     */
    public Optional<Output<String>> variableName() {
        return Optional.ofNullable(this.variableName);
    }

    private SetVariableActivityArgs() {}

    private SetVariableActivityArgs(SetVariableActivityArgs $) {
        this.dependsOn = $.dependsOn;
        this.description = $.description;
        this.name = $.name;
        this.type = $.type;
        this.userProperties = $.userProperties;
        this.value = $.value;
        this.variableName = $.variableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SetVariableActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SetVariableActivityArgs $;

        public Builder() {
            $ = new SetVariableActivityArgs();
        }

        public Builder(SetVariableActivityArgs defaults) {
            $ = new SetVariableActivityArgs(Objects.requireNonNull(defaults));
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
         * Expected value is &#39;SetVariable&#39;.
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
         * Expected value is &#39;SetVariable&#39;.
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

        /**
         * @param value Value to be set. Could be a static value or Expression
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<Object> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value to be set. Could be a static value or Expression
         * 
         * @return builder
         * 
         */
        public Builder value(Object value) {
            return value(Output.of(value));
        }

        /**
         * @param variableName Name of the variable whose value needs to be set.
         * 
         * @return builder
         * 
         */
        public Builder variableName(@Nullable Output<String> variableName) {
            $.variableName = variableName;
            return this;
        }

        /**
         * @param variableName Name of the variable whose value needs to be set.
         * 
         * @return builder
         * 
         */
        public Builder variableName(String variableName) {
            return variableName(Output.of(variableName));
        }

        public SetVariableActivityArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
