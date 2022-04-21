// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import com.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
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
public final class SetVariableActivityResponse extends com.pulumi.resources.InvokeArgs {

    public static final SetVariableActivityResponse Empty = new SetVariableActivityResponse();

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
    private @Nullable List<ActivityDependencyResponse> dependsOn;

    public Optional<List<ActivityDependencyResponse>> dependsOn() {
        return Optional.ofNullable(this.dependsOn);
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Type of activity.
     * Expected value is &#39;SetVariable&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
    private @Nullable List<UserPropertyResponse> userProperties;

    public Optional<List<UserPropertyResponse>> userProperties() {
        return Optional.ofNullable(this.userProperties);
    }

    /**
     * Value to be set. Could be a static value or Expression
     * 
     */
    @Import(name="value")
    private @Nullable Object value;

    public Optional<Object> value() {
        return Optional.ofNullable(this.value);
    }

    /**
     * Name of the variable whose value needs to be set.
     * 
     */
    @Import(name="variableName")
    private @Nullable String variableName;

    public Optional<String> variableName() {
        return Optional.ofNullable(this.variableName);
    }

    private SetVariableActivityResponse() {}

    private SetVariableActivityResponse(SetVariableActivityResponse $) {
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
    public static Builder builder(SetVariableActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SetVariableActivityResponse $;

        public Builder() {
            $ = new SetVariableActivityResponse();
        }

        public Builder(SetVariableActivityResponse defaults) {
            $ = new SetVariableActivityResponse(Objects.requireNonNull(defaults));
        }

        public Builder dependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            $.dependsOn = dependsOn;
            return this;
        }

        public Builder dependsOn(ActivityDependencyResponse... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder userProperties(@Nullable List<UserPropertyResponse> userProperties) {
            $.userProperties = userProperties;
            return this;
        }

        public Builder userProperties(UserPropertyResponse... userProperties) {
            return userProperties(List.of(userProperties));
        }

        public Builder value(@Nullable Object value) {
            $.value = value;
            return this;
        }

        public Builder variableName(@Nullable String variableName) {
            $.variableName = variableName;
            return this;
        }

        public SetVariableActivityResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
